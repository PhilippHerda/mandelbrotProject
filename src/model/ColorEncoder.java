package model;

import java.awt.*;

public class ColorEncoder {
    private int colorOffset;
    private ColorMode currentMode;
    public ColorEncoder(){
        colorOffset = 0;
        currentMode = ColorMode.HSB_LINEAR;
    }
    public int encodeColor(int iterations, int maxIterations){
        switch (currentMode){
            case HSB_LINEAR:
                return encodeColorHsbLinear(iterations, maxIterations);
            case HSB_LOGARITHMIC:
                return encodeColorHsbLogarithmic(iterations, maxIterations);
            case RGB:
                return encodeColorRGB(iterations, maxIterations);
            default:
                return 0;
        }

    }

    public void changeColorMode(String colorMode){
        ColorMode modeFromString = ColorMode.colorModeFromString(colorMode);
        if(modeFromString!=null) {
            currentMode = ColorMode.colorModeFromString(colorMode);
        }
        else{
            System.out.println("Unfortunately no matching color mode was found.");
        }
    }

    public int encodeColorHsbLinear(int iterations, int maxIterations){
        double color = 1.0*iterations/maxIterations;
        color += colorOffset/255.0;
        Color myColor = Color.getHSBColor((float) (color), 1, 1);
        return myColor.getRGB();
    }

    public int encodeColorHsbLogarithmic(int iterations, int maxIterations){
        double color = Math.log(iterations)/Math.log(maxIterations); // Needs some improvement!
        color += colorOffset/255.0;
        Color myColor = Color.getHSBColor((float) (color), 1, 1);
        return myColor.getRGB();
    }

    public int encodeColorRGB(int iterations, int maxIterations){
        return (iterations * (16777215 / maxIterations*2));
    }

    public void setColorOffset(int colorOffset) {
        this.colorOffset = colorOffset;
    }
}
