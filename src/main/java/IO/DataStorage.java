package IO;

import model.ColorMode;
import model.FractalSet;
import model.PositionAndSettings;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class DataStorage {
    private final String delimiter;
    public DataStorage(){
        delimiter = ";";
    }

    public void writePositionAndSettings(PositionAndSettings positionAndSettings){
        try(PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File("positionAndSettings.txt"),true));){
            printWriter.print(positionAndSettings.getName() + delimiter);
            printWriter.print(positionAndSettings.getMyScale() + delimiter);
            printWriter.print(positionAndSettings.getMyXOffset() + delimiter);
            printWriter.print(positionAndSettings.getMyYOffset() + delimiter);
            printWriter.print(positionAndSettings.getMyColorMode() + delimiter);
            printWriter.print(positionAndSettings.getMyColorOffset() + delimiter);
            printWriter.print(positionAndSettings.getMyMaxIterations() + delimiter);
            printWriter.print(positionAndSettings.getMyFractalSet().toString() + delimiter);
            printWriter.println();
        }
        catch (IOException e){
            System.out.println(e.getMessage());

        }
    }

    public PositionAndSettings readPositionAndSettings(int indexInList){
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("positionAndSettings.txt")))){
            scanner.useLocale(Locale.US);
            scanner.useDelimiter(delimiter);
            for(int i = 0; i<indexInList; i++){
                scanner.nextLine();
            }

            String name = scanner.next();
            float scale = scanner.nextFloat();
            float xOffset = scanner.nextFloat();
            float yOffset = scanner.nextFloat();
            ColorMode colorMode = ColorMode.colorModeFromString(scanner.next());
            int colorOffset = scanner.nextInt();
            int maxIterations = scanner.nextInt();
            FractalSet fractalSet = FractalSet.juliaSetFromString(scanner.next());
            PositionAndSettings positionAndSettings = new PositionAndSettings(scale, xOffset, yOffset, colorMode, colorOffset, maxIterations, fractalSet);
            positionAndSettings.setName(name);
            return positionAndSettings;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void removeLine(int index){
        File newFile = null;
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("positionAndSettings.txt")));
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(newFile =new File("newPositionAndSettings.txt")));){
            int line = 0;
            while(scanner.hasNextLine()){
                if(line!=index) {
                    printWriter.println(scanner.nextLine());
                }
                else{
                    scanner.nextLine();
                }
                line++;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        File oldFile = new File("positionAndSettings.txt");
        oldFile.delete();
        newFile.renameTo(new File("positionAndSettings.txt"));
    }

    public int howManyLinesWritten(){
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("positionAndSettings.txt")))){
            scanner.useDelimiter(delimiter);
            int linesInFile = 0;
            while(true){
                if(!scanner.hasNextLine()){
                    return linesInFile;
                }
                else{
                    linesInFile++;
                    scanner.nextLine();
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
