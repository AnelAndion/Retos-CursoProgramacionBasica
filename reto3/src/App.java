public class App {
    public static void main(String[] args) {
        SchoolGradingSystem statistics = new SchoolGradingSystem();
        statistics.loadData();
        //output 1
        System.out.println(statistics.stat1());
    }
}
