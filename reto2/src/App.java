public class App {
    public static void main(String[] args) {
        SchoolGradingSystem statistics = new SchoolGradingSystem();
        // read
        statistics.readData();
        // type 1
        System.out.println(statistics.question1());
    }
}
