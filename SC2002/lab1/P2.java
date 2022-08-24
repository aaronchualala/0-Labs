import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner salaryInput = new Scanner(System.in); // Create a Scanner object
        Integer salary = salaryInput.nextInt();
        Scanner meritInput = new Scanner(System.in); // Create a Scanner object
        Integer merit = meritInput.nextInt();

        if (salary >= 600 && salary <= 649 && merit < 10) {
            System.out.println("Grade C");
        } else if (salary >= 600 && salary <= 649) {
            System.out.println("Grade B");
        }

        if (salary >= 700 && salary <= 799 && merit < 20) {
            System.out.println("Grade B");
        } else if (salary >= 700 && salary <= 799) {
            System.out.println("Grade A");
        }

        // if (salary >= 500 && salary <= 649) {
        // System.out.println("Grade C");
        // } else if (salary >= 600 && salary <= 799) {
        // if (salary <= 649 && merit < 10) {
        // System.out.println("Grade C");
        // } else {
        // System.out.println("Grade B");
        // }
        // } else if (salary >= 700 && salary <= 899) {
        // if (salary <= 799 && merit < 20) {
        // System.out.println("Grade B");
        // } else {
        // System.out.println("Grade A");
        // }
        // } else {
        // System.out.println("Invalid Input");
        // }
    }
}
