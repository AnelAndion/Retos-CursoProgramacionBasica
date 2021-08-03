public class SchoolGradingSystem extends GradingSystem{
    // method -- loadData
    public void loadData(){
        // input 1
        String input1 = read.nextLine();
        n = Integer.parseInt(input1);
        data = new double[n][4];
        // input 2
        for (int i = 0; i < n; i++){
            String line = read.nextLine();
            String[] lineSpace = line.split(" ");
            // transform String to double and save
            for (int j = 0; j < 4; j++){
                data[i][j] = Double.parseDouble(lineSpace[j]);
            }
        }
    }
}
