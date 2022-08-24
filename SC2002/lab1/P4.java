import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner heightInput = new Scanner(System.in);
        Integer height = heightInput.nextInt();
        String pattern = "";

        if (height == 0) {
            System.out.println("Error input!!");
            System.exit(0);
        }
        for (int i = height; i > 0; i--) {
            if (i % 2 == 0) {
                pattern = "BB" + pattern;
            } else {
                pattern = "AA" + pattern;
            }
            System.out.println(pattern);
        }
    }
}
