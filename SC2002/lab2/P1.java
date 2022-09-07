import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;

public class P1 {

    public static void mulTest() {
        int score = 0;
        for (int j = 1; j <= 5; j++) {
            int input;
            Scanner sc = new Scanner(System.in);
            int num1 = (int) (Math.random() * 10 + 1);
            int num2 = (int) (Math.random() * 10 + 1);
            int ans = num1 * num2;
            System.out.println("How much is " + (num1 + "") + " times " + (num2 + "") + "?");
            input = sc.nextInt();
            if (input == ans) {
                score += 1;
            }
        }
        System.out.println(score + " answers out of 5 are correct.");
    }

    public static int divide(int m, int n) {
        int q = 0;
        while (m >= n) {
            m -= n;
            q++;
        }
        return q;
    }

    public static int modulus(int m, int n) {
        while (m >= n) {
            m -= n;
        }
        return m;
    }

    public static int countDigits(int x) {
        String s = Integer.toString(x);
        return s.length();
    }

    public static int position(int num, int dgt) {
        String numStr = String.valueOf(num);
        for (int i = numStr.length(); i > 0; i--) {
            if (Character.getNumericValue(numStr.charAt(i - 1)) == dgt) {
                // System.out.println(numStr.charAt(j));
                return numStr.length() - i + 1;
            }
        }
        return -1;
    }

    public static long extractOddDigits(long x) {
        String output = "";
        String numStr = Long.toString(x);
        for (int i = 0; i < numStr.length(); i++) {
            if (Character.getNumericValue(numStr.charAt(i)) % 2 == 1) {
                output = output.concat(Character.toString(numStr.charAt(i)));
            }
        }
        if (output == "") {
            return -1;
        } else {
            return Long.parseLong(output);
        }
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    int m = sc.nextInt();
                    int n = sc.nextInt();
                    System.out.println(m + "/" + n + " = " + divide(m, n));
                    break;
                case 3: /* add modulus() call */
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println(a + " % " + b + " = " + modulus(a, b));
                    break;
                case 4: /* add countDigits() call */
                    int i = sc.nextInt();
                    if (i < 0) {
                        System.out.println("Error input!!");
                    } else {
                        System.out.println("count = " + countDigits(i));
                    }
                    break;
                case 5: /* add position() call */
                    int num = sc.nextInt();
                    int dgt = sc.nextInt();
                    System.out.println("position = " + position(num, dgt));
                    break;
                case 6: /* add extractOddDigits() call */
                    Long number = sc.nextLong();
                    if (number < 0) {
                        System.out.println("Error Input!!");
                    } else {
                        System.out.println("oddDigits = " + extractOddDigits(number));
                    }
                    break;
                case 7:
                    System.out.println("Program terminating ....");
            }
        } while (choice < 7);
    }
    /* add method code here */
}