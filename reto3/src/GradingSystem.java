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
   // method 2 -- stat2
   public int stat2(){
      int noteI = 0;
      for (int i = 0; i < n; i++){
         if (data[i][3] <= 6 && data[i][3] > 3){
            noteI += 1;
         }
      }
      // output
      return noteI;
   }
}
