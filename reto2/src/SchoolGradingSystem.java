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
        return Double.parseDouble(f.format(main)); // output
    }

    //method 3 type - answer question 2
    public int question2(){
        int noteI = 0;
        for (int i = 0; i < n; i++){
            if (data[i][3] <= 6 && data[i][3] > 3){
                noteI += 1;
            }
        }
        // output
        return noteI;
    }

    //method 4 type - answer question 3
    public String question3(){
        int counterL = 0, counterB = 0, counterG = 0;
        double summationL = 0.0, summationB = 0.0, summationG = 0.0;
        double[] summationSubjects = new double[3];
        for (int i = 0; i < n; i++){
            // Filter subjects of group women for summation and counter
            if (data[i][1] == 1.0){
                if (data[i][2] == 1.0){ //literature
                    summationL += data[i][3]; // summation
                    counterL += 1; // counter
                }
                if (data[i][2] == 2.0){// biology
                    summationB += data[i][3]; // summation
                    counterB += 1; // counter
                }
                if (data[i][2] == 3.0){ //geography
                    summationG += data[i][3]; // summation
                    counterG += 1; // counter
                }
            }
        }
        // so now put main in the matrix
        summationSubjects[0] = summationL / counterL;
        summationSubjects[1] = summationB / counterB;
        summationSubjects[2] = summationG / counterG;

        // looking top main in the matrix
        double noteTop = 0.0;
        for (int i = 0; i < 3; i++){
            if (summationSubjects[i] > noteTop){
                noteTop = summationSubjects[i];
            }
        }

        // looking subject with top main
        if (summationSubjects[0] == noteTop){
            // output
            return "literatura";
        }
        if (summationSubjects[1] == noteTop){
            // output
            return "biologia";
        }
        if (summationSubjects[2] == noteTop){
            // output
            return "geografia";
        }

        return null; // return null
    }

    // method 4 type - answer question 4
    public String question4(){
        double[] notesLiterature = new double[6];
        double notaTop = 0.0;
        int j = 0; // id student
        String[] people = {"armando","nicolas","daniel","maria","marcela","alexander"};
        String student = null;
        // filter notes of literature
        for (int i = 0; i < n; i++){
            if (data[i][2] == 1.0){
                notesLiterature[j] = data[i][3];
                j += 1;
            }
        }
        for (int i = 0; i < 6; i++){
            if (notesLiterature[i] > notaTop){
                notaTop = notesLiterature[i];
                student = people[i]; // save student with top main
            }
        }
        // output
        return student;

    }

}
