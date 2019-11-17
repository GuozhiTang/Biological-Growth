package edu.neu.csye6200.bg;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;
import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.random;
import static java.lang.Math.sin;


/**
 * BGRule class which can extend a new generation of stems based on a prior generation
 * @author Guozhi Tang
 * NUID: 001824925
 */
public class BGRule {

    /**
     * The method to control the way where the last generation extends to the new generation
     * @param inputbGGeneration The input generation is the last generation
     * @return bGGeneration1 The output generation is the latest generation
     */
    public BGGeneration Rule(BGGeneration inputbGGeneration, String ruleNum) {
        
        BGGeneration outputbGGeneration = new BGGeneration();
        
        switch(ruleNum){  // Three rules for the tree's growth
            
            case "Rule1":
                //System.out.println("Rule1");
                //ArrayList<bgStem> bArrayListpanduan =  new ArrayList<>();
                for (BGStem bGStem : inputbGGeneration.getBGGenerationList()) { // To loop to judge whether the stem has the child, if not, generate a new generation for this stem
            
                    if (bGStem.getBGStemList().isEmpty()) { // To judge whether the stem has the child
                    
//                System.out.println("edu.neu.csye6200.bg.BGRule.Rule()");
//                ArrayList<BGStem> StemList = new ArrayList<BGStem>();
                        BGStem Stem0 = new BGStem(bGStem.getLength() - 6, bGStem.getWidth() - (1/10), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle() - PI / 10);
                        BGStem Stem1 = new BGStem(bGStem.getLength() - 6, bGStem.getWidth() - (1/10), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle());
                        BGStem Stem2 = new BGStem(bGStem.getLength() - 6, bGStem.getWidth() - (1/10), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle() + PI / 10);
//                StemList.add(Stem0);
//                StemList.add(Stem1);
//                StemList.add(Stem2);
//        
//                bGStem.setBGStemList(StemList);
                        outputbGGeneration.getBGGenerationList().add(Stem0); // If it has no child then add three stems to the stem arraylist
                        outputbGGeneration.getBGGenerationList().add(Stem1);
                        outputbGGeneration.getBGGenerationList().add(Stem2);
                    
                    }
                    
                    outputbGGeneration.getBGGenerationList().add(bGStem); // Add the stem arraylist to the generationlist arraylist
                
                }
                break;
                
            case "Rule2":
                System.out.println("Rule2");
                //ArrayList<bgStem> bArrayListpanduan =  new ArrayList<>();
                for (BGStem bGStem : inputbGGeneration.getBGGenerationList()) { // To loop to judge whether the stem has the child, if not, generate a new generation for this stem
                    
                    if (bGStem.getBGStemList().isEmpty()) { // To judge whether the stem has the child
//                System.out.println("edu.neu.csye6200.bg.BGRule.Rule()");
//                ArrayList<BGStem> StemList = new ArrayList<BGStem>();
                        BGStem Stem0 = new BGStem((int) (bGStem.getLength()*0.8), bGStem.getWidth() + (1/2), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle() - PI / 5);
                        BGStem Stem1 = new BGStem((int) (bGStem.getLength()*0.8), bGStem.getWidth() + (1/2), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle());
                        BGStem Stem2 = new BGStem((int) (bGStem.getLength()*0.8), bGStem.getWidth() + (1/2), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle() + PI / 5);
//                StemList.add(Stem0);
//                StemList.add(Stem1);
//                StemList.add(Stem2);
//        
//                bGStem.setBGStemList(StemList);
                        outputbGGeneration.getBGGenerationList().add(Stem0); // If it has no child then add three stems to the stem arraylist
                        outputbGGeneration.getBGGenerationList().add(Stem1);
                        outputbGGeneration.getBGGenerationList().add(Stem2);
                    
                    }
                    
                    outputbGGeneration.getBGGenerationList().add(bGStem); // Add the stem arraylist to the generationlist arraylist
                
                }
                break;
                
            case "Rule3":
                System.out.println("Rule3");
                //ArrayList<bgStem> bArrayListpanduan =  new ArrayList<>();
                for (BGStem bGStem : inputbGGeneration.getBGGenerationList()) { // To loop to judge whether the stem has the child, if not, generate a new generation for this stem
            
                    if (bGStem.getBGStemList().isEmpty()) { // To judge whether the stem has the child
//                System.out.println("edu.neu.csye6200.bg.BGRule.Rule()");
//                ArrayList<BGStem> StemList = new ArrayList<BGStem>();
                        BGStem Stem0 = new BGStem((int) (bGStem.getLength()*0.7), bGStem.getWidth() + (1/8), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle() - PI / 2);
                        BGStem Stem1 = new BGStem((int) (bGStem.getLength()*0.7), bGStem.getWidth() + (1/8), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle());
                        BGStem Stem2 = new BGStem((int) (bGStem.getLength()*0.7), bGStem.getWidth() + (1/8), (int) (bGStem.getX() + bGStem.getLength() * cos(bGStem.getAngle())), (int) (bGStem.getY() - bGStem.getLength() * sin(bGStem.getAngle())), bGStem.getAngle() + PI / 2);
//                StemList.add(Stem0);
//                StemList.add(Stem1);
//                StemList.add(Stem2);
//        
//                bGStem.setBGStemList(StemList);
                        outputbGGeneration.getBGGenerationList().add(Stem0); // If it has no child then add three stems to the stem arraylist
                        outputbGGeneration.getBGGenerationList().add(Stem1);
                        outputbGGeneration.getBGGenerationList().add(Stem2);
                    
                    }
                    
                    outputbGGeneration.getBGGenerationList().add(bGStem); // Add the stem arraylist to the generationlist arraylist
                
                }
                break;
        }
        
        System.out.println("output" + outputbGGeneration.getBGGenerationList().size());
        return outputbGGeneration; 

    }
}


