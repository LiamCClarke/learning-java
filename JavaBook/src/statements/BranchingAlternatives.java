package statements;

public class BranchingAlternatives {
    public static void main(String[] args) {
        int hrs = 21;
        if (hrs < 13)
            System.out.println("Good morning: " + hrs);
        else if (hrs < 18)
            System.out.println("Good afternoon: " + hrs);
        // Its good practice to use a else statement as a default for unexpected values
        else System.out.println("Good evening: " + hrs);
    }
}
