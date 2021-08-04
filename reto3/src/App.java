public class App {
    public static void main(String[] args) {
        SchoolGradingSystem statistics = new SchoolGradingSystem();
        statistics.loadData();
        //output 1
        System.out.println(statistics.stat1());
        //output 2
        System.out.println(statistics.stat2());
        //output 3
        System.out.println(statistics.stat3());
        //output 4
        System.out.println(statistics.stat4());
    }
}
