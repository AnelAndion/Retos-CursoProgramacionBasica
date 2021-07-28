import java.util.Scanner;
import java.text.DecimalFormat;
public class SchoolGradingSystem {

    private int n;
    private double[][] data;

    // method 1 -- read
    public void readData(){
        Scanner read = new Scanner(System.in);
        //input 1
        String input1 = read.nextLine();
        n = Integer.parseInt(input1);
        data = new double[n][4];
        //input 2
        for (int i = 0; i < n; i++){
            String line = read.nextLine();
            String[] lineSpace = line.split(" ");
            // turn into String to double and save
            for (int j = 0; j < 4; j++){
                data[i][j] = Double.parseDouble(lineSpace[j]);
            }
        }
    }

    // method 2 type - answer question 1
    public double question1(){
        DecimalFormat f = new DecimalFormat("0.00");
        double summation = 0.0, main;
        // summation
        for (int i = 0; i < n; i++){
            summation += data[i][3];
        }
        // main
        main = summation/n;
        return Double.parseDouble(f.format(main));
    }

    //method 3 type - answer question 2
    public int question2(){
        int noteI = 0;
        for (int i = 0; i < n; i++){
            if (data[i][3] <= 6 && data[i][3] > 3){
                noteI += 1;
            }
        }
        return noteI;
    }

}
