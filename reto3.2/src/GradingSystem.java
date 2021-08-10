import java.text.DecimalFormat;

public class GradingSystem {

    protected int n;
    protected double[][] data;

    // method 1 -- stat1
   public String stat1(){
        DecimalFormat f = new DecimalFormat("0.00");
        double summation = 0.0, main;
        // summation
        for (int i = 0; i < n; i++){
            summation += data[i][3];
        }
        // main
        main = summation/n;
        return f.format(main); // output
    }

    // method 2 -- stat2
   public String stat2(){
       int noteI = 0;

        for (int i = 0; i < n; i++){

           if (data[i][3] <= 6 && data[i][3] > 3){
               noteI += 1;
            }

        }
        // output
        return Integer.toString(noteI);
    }

}
