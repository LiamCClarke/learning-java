package statements;

public class LoopingWhileTrue {
    /*
    while (test-expression) {
        statements-to-be-executed-on-each-iteration;
    }
     */
    public static void main(String[] args) {
        int num = 100;
        while (num > 0) {
            System.out.println("While Countdown: " + num);
            num -= 10;
        }
    }
}
