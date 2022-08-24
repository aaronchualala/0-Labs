import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        Scanner startInput = new Scanner(System.in);
        Integer start = startInput.nextInt();
        Scanner endInput = new Scanner(System.in);
        Integer end = endInput.nextInt();
        Scanner incrementInput = new Scanner(System.in);
        Integer increment = incrementInput.nextInt();

        if (start > end) {
            System.out.println("Error input!!");
            System.exit(0);
        }

        System.out.println(" US$         S$");
        System.out.println(" --------------");
        // for loop
        for (int i = start; i <= end; i += increment) {
            System.out.println(" " + String.valueOf(i) + "        " + String.valueOf(i * 1.82));
        }

        System.out.println(" US$         S$");
        System.out.println(" --------------");
        // while loop
        int i = start;
        while (i <= end) {
            System.out.println(" " + String.valueOf(i) + "        " + String.valueOf(i * 1.82));
            i += increment;
        }

        System.out.println(" US$         S$");
        System.out.println(" --------------");
        // do/while loop
        i = start;
        do {
            System.out.println(" " + String.valueOf(i) + "        " + String.valueOf(i * 1.82));
            i += increment;
        } while (i <= end);
    }
}
