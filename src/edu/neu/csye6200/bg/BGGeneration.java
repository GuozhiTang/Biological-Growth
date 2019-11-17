package edu.neu.csye6200.bg;

import java.applet.Applet;
import java.awt.Graphics;
import static java.lang.Math.PI;
import java.util.ArrayList;

/**
 * BGGeneration class which contains an array of child stems
 * @author tangg
 */
public class BGGeneration {
    
    private ArrayList<BGStem> BGGenerationList; // The arraylist which contains many stems combining together as a generation
    
    /**
     * Constructor
     */
    public BGGeneration () {
    
        BGGenerationList = new ArrayList<BGStem>();
        
        //BGRule rule = new BGRule();
        
        //rule.Rule(StemUnit);  
    }
    
    
//    /**
//     * Main Method
//     * @param args 
//     */
//    public static void main(String[] args) {
//        
//        BGGenerationSet genSet = new BGGenerationSet(); // Call the generationset to get the initial stem
//
//        genSet.generadd(); // Recall the add method to add a new generation (The First Generation) to the generationset
//        genSet.generadd(); // Recall the add method to add a new generation (The Second Generation) to the generationset
//        genSet.generadd(); // Recall the add method to add a new generation (The Third Generation) to the generationset
//
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
        
        
//        BGGeneration gen = new BGGeneration();
//        
//        for(BGStem bGStem:gen.getBGGenerationList()){
//        
//        for(BGStem bgs:bGStem.getBGStemList()){
//         System.out.println(bgs.getX() + "  "+ bgs.getY() + "  " + bgs.getAngle());
//        }
//        }
//        
//    }

    /**
     * @return the BGGenerationList
     */
    public ArrayList<BGStem> getBGGenerationList() {
        return BGGenerationList;
    }

    /**
     * @param BGGenerationList the BGGenerationList to set
     */
    public void setBGGenerationList(ArrayList<BGStem> BGGenerationList) {
        this.BGGenerationList = BGGenerationList;
    }

}
