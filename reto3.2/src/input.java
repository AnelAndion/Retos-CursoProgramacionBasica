public class input extends GradingSystem{
    // method -- loadData
    public void loadData(int n, String textarea){

        this.n = n;
        data = new double[n][4];
        String[] lineSpace = textarea.split("\n");

        for (int i = 0; i < n; i++){
            String[] subLineSpace = lineSpace[i].split(" ");
            for (int j = 0; j < 4; j++){
                data[i][j] = Double.parseDouble(subLineSpace[j]);
            }
        }
        
    }
}
