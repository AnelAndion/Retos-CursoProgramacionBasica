public class App {
    public static void main(String[] args) {
        SchoolGradingSystem statistics = new SchoolGradingSystem();
        // read
        statistics.readData();
        // output - type answer question 1
        System.out.println(statistics.question1());
        // output - type answer question 2
        System.out.println(statistics.question2());
        // output - type answer question 3
        System.out.println(statistics.question3());
        // output - type answer question 4
        System.out.println(statistics.question4());
    }
}
