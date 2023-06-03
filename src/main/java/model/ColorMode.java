package model;

import java.util.ArrayList;
import java.util.List;

public enum ColorMode { HSB_LINEAR("HSB Linear"), HSB_LOGARITHMIC("HSB Logarithmic"), RGB("RGB"), RGB_SQRT("RGB Squareroot");
    private String name;
    ColorMode(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    public static String[] allColorModes(){
        ArrayList<String> allColorModes = new ArrayList<>();
        for(ColorMode thisColorMode : ColorMode.values()){
            allColorModes.add(thisColorMode.toString());
        }

        String[] allColorModesArr = new String[allColorModes.size()];
        allColorModesArr = allColorModes.toArray(allColorModesArr);
        return allColorModesArr;
    }

    public static ColorMode colorModeFromString(String input){
        for(ColorMode thisColorMode : ColorMode.values()){
            if(thisColorMode.toString().equals(input)){
                return thisColorMode;
            }
        }
        return null;
    }
}
