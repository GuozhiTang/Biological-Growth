package edu.neu.csye6200.bg;

import java.util.ArrayList;
import static java.lang.Math.PI;

/**
 * BGStem class which contains an array of child GGStem instances
 * @author Guozhi Tang
 * NUID: 001824925
 */
public class BGStem {
    
    private int length; // The length of one stem
    private float width; // The length of one stem
    private double angle; // The angle of one stem to the horizontal line
    private int x; // The x-coordinate of the stem
    private int y; // The y-coordinate of the stem
    private ArrayList<BGStem> BGStemList; // The arraylist which contains the children of one Stem

    /**
     * Constructor
     * @param length
     * @param width
     * @param angle
     * @param x
     * @param y 
     */
    public BGStem(int length, float width, int x, int y, double angle) {
        
        BGStemList = new ArrayList<BGStem>();
        this.length = length;
        this.width = width;
        this.angle = angle;
        this.x = x;
        this.y = y;
    }
    
    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the angle
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the BGStemList
     */
    public ArrayList<BGStem> getBGStemList() {
        return BGStemList;
    }

    /**
     * @param BGStemList the BGStemList to set
     */
    public void setBGStemList(ArrayList<BGStem> BGStemList) {
        this.BGStemList = BGStemList;
    }
}
