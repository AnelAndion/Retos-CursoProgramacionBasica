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
}
