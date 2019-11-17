package edu.neu.csye6200.bg;

import static java.lang.Math.PI;
import java.util.ArrayList;

/**
 * BGGenerationSet class which holds multiple BG generations and can call th BGRule class repeatedly to create a list of successive generations
 * @author Guozhi Tang
 * NUID: 001824925
 */
public class BGGenerationSet {
    
    private ArrayList<BGGeneration> BGGenerationSetList; // The arraylist which contains many generations combining together as a generationset
    
    public BGGenerationSet () {
    
        BGGenerationSetList = new ArrayList<BGGeneration>();
        
        BGGeneration GenUnit = new BGGeneration();
        
        BGStem StemUnit = new BGStem(60, 1, 30, 600, PI / 2); // The initial point of the stem
     // BGGenerationList.add(StemUnit);
        
//        GenUnit.setRootStem(StemUnit);
//        BGGenerationSetList.add(GenUnit);
//     
        GenUnit.getBGGenerationList().add(StemUnit); // Add the initial point to the generationlist
         
        BGGenerationSetList.add(GenUnit); // Add the generationlist to the generationsetlist
    }
    
    /**
     * The method to add a new generation to the generationsetlist
     */
public void generadd(String ruleNum) {
        
        BGRule rule = new BGRule();
        BGGeneration addgen = new BGGeneration(); // New a new generation
        addgen =  rule.Rule(getBGGenerationSetList().get(getBGGenerationSetList().size()-1), ruleNum); // Use the rule to extend the last generation to the new generation
        getBGGenerationSetList().add(addgen); //  Add the generation addgen to the generationsetlist
    
    }

    /**
     * @return the BGGenerationSetList
     */
    public ArrayList<BGGeneration> getBGGenerationSetList() {
        return BGGenerationSetList;
    }

    /**
     * @param BGGenerationSetList the BGGenerationSetList to set
     */
    public void setBGGenerationSetList(ArrayList<BGGeneration> BGGenerationSetList) {
        this.BGGenerationSetList = BGGenerationSetList;
    }

}
