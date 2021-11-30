package statements;

public class SwitchingBranches {
    /*
    switch (test-variable)
    {
        case value1 : code-to-be-executed-when-true; break;
        case value1 : code-to-be-executed-when-true; break;
        case value1 : code-to-be-executed-when-true; break;
        default: code-to-be-executed-when-false;
    }
     */
    public static void main(String[] args) {
        int month = 2, year = 2022, num = 31;

        switch (month) {
            case 4: case 6: case 9: case 11: num = 30; break;
            case 2: num = (year % 4 == 0)? 29 : 28; break;
        }
        System.out.println(month+"/"+year+": "+num+"days");
    }
}
