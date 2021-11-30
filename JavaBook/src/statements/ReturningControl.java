package statements;

public class ReturningControl {
    public static void main(String[] args) {
        outerLoop : for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i == 2 && j == 3) {
                    System.out.println("Breaks OuterLoop when i="+i+" j="+j);
                    break outerLoop;
                }
                if (i == 1 && j == 1) {
                    System.out.println("Continues OuterLoop when i="+i+" j="+j);
                    continue outerLoop;
                }
                System.out.println("Running i="+i+" j="+j);
            }
        }
    }
}
