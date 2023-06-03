package model;

public class FractalSetCalculator {
    private FractalSet currentSet;

    public FractalSetCalculator() {
        currentSet = FractalSet.MANDELBROT;
    }

    public Float FractalSetA(Float originalA) {
        switch (currentSet) {
            case MANDELBROT:
                return originalA;
            case FIRSTFRACTAL:
                return 0F;
            case SECONDFRACTAL:
                return 0.37F;
            case THIRDFRACTAL:
                return 0.355F;
            case FOURTHFRACTAL:
                return -0.54F;
            case FIFTHFRACTAL:
                return -0.4F;
            case SIXTHFRACTAL:
                return 0.34F;
            case SEVENTHFRACTAL:
                return -0.4F;

            default:
                return originalA;
        }

    }

    public Float FractalSetB(Float originalB) {
        switch (currentSet) {
            case MANDELBROT:
                return originalB;
            case FIRSTFRACTAL:
                return 0.8F;
            case SECONDFRACTAL:
                return 0.1F;
            case THIRDFRACTAL:
                return 0.355F;
            case FOURTHFRACTAL:
                return -0.54F;
            case FIFTHFRACTAL:
                return -0.59F;
            case SIXTHFRACTAL:
                return -0.05F;
            case SEVENTHFRACTAL:
                return -0.59F;

            default:
                return originalB;
        }
    }

    public void changeJuliaSet(String juliaSet){
        FractalSet modeFromString = FractalSet.juliaSetFromString(juliaSet);
        if(modeFromString!=null) {
            currentSet = FractalSet.juliaSetFromString(juliaSet);
        }
        else{
            System.out.println("Unfortunately no matching Juliaset was found.");
        }

    }

    public FractalSet getCurrentSet() {
        return currentSet;
    }
}
