package edu.neu.csye6200.bg;

import com.sun.webkit.graphics.GraphicsDecoder;
import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.event.ItemEvent;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Thread.sleep;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import static java.lang.Math.PI;
import java.util.ArrayList;

/**
 * BGApp class which draw the growth process of the tree and construct the user interface
 * @author Guozhi Tang
 * NUID: 001824925
 */
public class BGApp extends JPanel implements Runnable{
    
    private ArrayList<BGGeneration> BGGenerationSetList;
    BGGenerationSet bGenerationSet;
    
    int i = 10; // The intervals for each two trees
    String ruleNum; // The choose for the specified rule
    private boolean ifstop = true;
    Graphics2D g2;
    
    /**
     * Constructor
     */
    public BGApp() {
        
        bGenerationSet = new BGGenerationSet();
        initComponents();  
        ruleNum = (String) RuleSelection.getSelectedItem();
        
    }

    
    @Override
    public void run() {
        
        g2 = (Graphics2D) getGraphics();
        while (true) {
        g2.drawRect(0, 250, 2000, 1000); // The exact drawing board area for the UI
        
        if (ifstop) {
            try {
                sleep(1000);
                RuleSelection.setEnabled(true);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        } else {
            BGGeneration bGGeneration = bGenerationSet.getBGGenerationSetList().get(bGenerationSet.getBGGenerationSetList().size() - 1);
            RuleSelection.setEnabled(false);
            for(BGStem bGStem:bGGeneration.getBGGenerationList()){
            g2.setStroke(new BasicStroke(bGStem.getWidth()));
            int x1, y1;
            x1 = (int) ((bGStem.getX() + i) + bGStem.getLength() * cos(bGStem.getAngle()));
            y1 = (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle()));
            g2.drawLine((bGStem.getX() + i) , bGStem.getY(), x1, y1);
            System.out.println("x2: "+ (bGStem.getX() + i) +"y2: "+ bGStem.getY() + "x1: " + x1 + "y1: " + y1);
            }
            System.out.println("size: " + bGGeneration.getBGGenerationList().size());
            bGenerationSet.generadd(ruleNum);
            
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            i = i + 200;
        }
        }
    }
    
    private void initComponents() {
        
        JLabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        JLabel3 = new javax.swing.JLabel();
        JPanel1 = new javax.swing.JPanel();
        RuleSelection = new javax.swing.JComboBox<>();
        Start = new javax.swing.JButton();
        Stop = new javax.swing.JButton();
        JTextField1 = new javax.swing.JTextField();
        Generate = new javax.swing.JButton();
        
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

//        jPanel1.setBackground(new java.awt.Color(0, 0, 139));
//        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2000, 100));
        
        // JLabel1: The label on the top for the title and author name
        JLabel1.setForeground(new java.awt.Color(0, 0, 139));
        JLabel1.setFont(new java.awt.Font("Dialog", 1, 40));
        JLabel1.setText("Biological Growth - Guozhi Tang");
        add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 800, 100));
        
        // JLabel2: The label for the introduction for the rule selection
        JLabel2.setForeground(new java.awt.Color(0, 0, 139));
        JLabel2.setFont(new java.awt.Font("Dialog", 1, 15));
        JLabel2.setText("Please select the biological growth rule for the tree:");
        add(JLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 500, 20));

        // RuleSelection: The combox for three rules selection
        RuleSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Rule1", "Rule2", "Rule3"}));
        RuleSelection.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ruleSelectionChanged(evt);
            }
        });
        add(RuleSelection, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, -1));

        // Start: The button to start the process
        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        add(Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 100, -1));

        // Stop: The button to stop the process
        Stop.setText("Stop");
        Stop.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopActionPerformed(evt);
            }
        });
        add(Stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 100, -1));

        // JLabel3: The label for the introduction of the generation selection
        // JTextField1: The textfield for the input of the specified generation
        JLabel3.setForeground(new java.awt.Color(0, 0, 139));
        JLabel3.setFont(new java.awt.Font("Dialog", 1, 15));
        JLabel3.setText("Select the specified generation:");
        JTextField1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GenerateActionPerformed(e);
            }
        });
        add(JLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 130, 250, 29));
        add(JTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 180, 151, -1));
        
        // Generate: The button to generate the specified generation
        Generate.setText("Generate");
        Generate.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });
        add(Generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1600, 180, -1, -1));
    }// </editor-fold>
    
    private void StopActionPerformed(java.awt.event.ActionEvent evt) {
        
        ifstop = true;
    }

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {
        
        ifstop = false;
    }

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {
        BGGenerationSet bGGenerationSet1 = new BGGenerationSet();
        RuleSelection.setEnabled(false);
        
        int n = Integer.parseInt(JTextField1.getText());
        for (int i = 0; i < n; i++) {
            bGGenerationSet1.generadd(ruleNum);
        }
        
        BGGeneration bGGeneration1 = bGGenerationSet1.getBGGenerationSetList().get(bGGenerationSet1.getBGGenerationSetList().size() - 1);
        for(BGStem bGStem:bGGeneration1.getBGGenerationList()){
            g2.setStroke(new BasicStroke(bGStem.getWidth()));
            int x1, y1;
            x1 = (int) ((bGStem.getX()) + 1000 + bGStem.getLength() * cos(bGStem.getAngle()));
            y1 = (int) (bGStem.getY() + 300 - bGStem.getLength() * sin(bGStem.getAngle()));
            g2.drawLine((bGStem.getX()) + 1000 , bGStem.getY() + 300, x1 , y1);
            System.out.println("x2: "+ bGStem.getX() +"y2: "+ bGStem.getY() + "x1: " + x1 + "y1: " + y1);
        }
        System.out.println("size: " + bGGeneration1.getBGGenerationList().size());
        

    }
    
    /**
     * The method to clear the board when the rule changes
     * @param evt 
     */
    private void ruleSelectionChanged(ItemEvent evt) {
        i = 10;
        bGenerationSet = new  BGGenerationSet();
        ruleNum = (String) RuleSelection.getSelectedItem();
        g2 = (Graphics2D) getGraphics();
        g2.clearRect(0, 250, 2000, 1000);
        g2.drawRect(0, 250, 2000, 1000);
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JLabel JLabel3;
    private javax.swing.JPanel JPanel1;
    private javax.swing.JComboBox<String> RuleSelection;
    private javax.swing.JButton Start;
    private javax.swing.JButton Stop;
    private javax.swing.JTextField JTextField1;
    private javax.swing.JButton Generate;
    // End of variables declaration  

}
