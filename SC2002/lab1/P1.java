import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); // Create a Scanner object
        char userChar = userInput.next(".").charAt(0); // Read user input

        switch (userChar) {
            case 'a':
            case 'A':
                System.out.println("Action movie fan");
                break;
            case 'c':
            case 'C':
                System.out.println("Comedy movie fan");
                break;
            case 'd':
            case 'D':
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
