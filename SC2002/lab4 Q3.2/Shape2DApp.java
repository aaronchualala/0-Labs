import java.util.Scanner;

public class Shape2DApp {

    public static void main(String[] args) {
        Shape[] shapeList;
        int totalNumber;
        String shape;
        double totalArea = 0;

        // number of shapes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of shapes");
        totalNumber = sc.nextInt();
        shapeList = new Shape[totalNumber];

        // shapes and dimensions
        for (int i = 0; i < totalNumber; i++) {
            System.out.println("\nEnter the shape...");
            shape = sc.next();
            switch (shape) {
                case "Circle":
                    System.out.println("\nEnter the radius...");
                    shapeList[i] = new Circle(sc.nextInt());
                    break;
                case "Triangle":
                    System.out.println("\nEnter the height and base...");
                    shapeList[i] = new Triangle(sc.nextInt(), sc.nextInt());
                    break;
                case "Rectangle":
                    System.out.println("\nEnter the length and breadth...");
                    shapeList[i] = new Rectangle(sc.nextInt(), sc.nextInt());
                    break;
            }
        }

        // calculate area
        for (int i = 0; i < totalNumber; i++) {
            totalArea += shapeList[i].findArea();
        }

        System.out.println(totalArea);
    }
}
