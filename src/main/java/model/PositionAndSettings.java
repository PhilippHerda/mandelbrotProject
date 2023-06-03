package model;

public class PositionAndSettings {
    private String name;
    private float myScale;
    private float myXOffset;
    private float myYOffset;
    private ColorMode myColorMode;
    private int myColorOffset;
    private int myMaxIterations;
    private FractalSet myFractalSet;
    public PositionAndSettings(float scale, float xOffset, float yOffset, ColorMode colorMode, int colorOffset, int maxIterations, FractalSet fractalSet){
        myScale= scale;
        myXOffset =xOffset;
        myYOffset = yOffset;
        myColorMode = colorMode;
        myColorOffset = colorOffset;
        myMaxIterations = maxIterations;
        myFractalSet = fractalSet;
    }

    public float getMyScale() {
        return myScale;
    }

    public float getMyXOffset() {
        return myXOffset;
    }

    public float getMyYOffset() {
        return myYOffset;
    }

    public ColorMode getMyColorMode() {
        return myColorMode;
    }

    public int getMyColorOffset() {
        return myColorOffset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMyMaxIterations() {
        return myMaxIterations;
    }

    public FractalSet getMyFractalSet() {
        return myFractalSet;
    }
}
