package edu.neu.csye6200.bg;

import javax.swing.JFrame;

/**
 * BGPanel class which shows and run the final user interface
 * @author tangg
 */
public class BGPanel {
    
    static final int WIDTH = 2000;
    static final int HEIGHT = 1000;
    public static void main(String[] args) {
        
        JFrame jf = new JFrame("Biological Growth - Guozhi Tang");
        jf.setSize(WIDTH,HEIGHT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BGApp contentPane = new BGApp();
        jf.add(contentPane);
        jf.setVisible(true);
        new Thread(contentPane).start();
        
//        BGGenerationSet genSet = new BGGenerationSet(); // Call the generationset to get the initial stem
//        
//        genSet.generadd("Rule1");
//        genSet.generadd("Rule1");
//        genSet.generadd("Rule1");
//        // To test the exact size of the generationset (how many generations in the set)
//        System.out.println("There are " + genSet.getBGGenerationSetList().size() + " generations in the generationset:\n");
//        
//        int i = 0; // The iteration to show the number of generation
//        // To print the stems in each generation in the generationset
//        for(BGGeneration bGGeneration : genSet.getBGGenerationSetList()) {
//            
//          System.out.println("The No." + i + " Generation");
//          i++;
//          for(BGStem bGStem:bGGeneration.getBGGenerationList()) {
//              
//              System.out.println("(" + bGStem.getX() + ", " + bGStem.getY() + ") angle: " + Math.toDegrees(bGStem.getAngle())); // Print the x,y coordinate and the angle (in degree)
//          
//          }
//        }
   }
}
