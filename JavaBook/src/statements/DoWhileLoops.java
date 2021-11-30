package statements;

public class DoWhileLoops {
    /*
    do {
        statements-to-be-executed-on-each-iteration;
    } while (text-expression);
     */
    public static void main(String[] args) {
        int num = 100;
        do {
            System.out.println("DoWhile Countup: " + num);
            num += 10;
        } while (num < 10);
    }
}
