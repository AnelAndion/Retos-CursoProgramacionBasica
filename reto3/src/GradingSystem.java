import java.util.Scanner;
import java.text.DecimalFormat;
public class GradingSystem {
   protected Scanner read = new Scanner(System.in);
   protected  int n;
   protected double[][] data;

   // method 1 -- stat1
   public double stat1(){
      DecimalFormat f = new DecimalFormat("0.00");
      double summation = 0.0, main;
      // summation
      for (int i = 0; i < n; i++){
         summation += data[i][3];
      }
      // main
      main = summation/n;
      return Double.parseDouble(f.format(main)); // output
   }
}
