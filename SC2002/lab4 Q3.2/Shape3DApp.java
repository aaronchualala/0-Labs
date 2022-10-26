import java.util.Scanner;

public class Shape3DApp {

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
                // Q2
                case "Sphere":
                    System.out.println("\nEnter the radius...");
                    shapeList[i] = new Sphere(sc.nextInt());
                    break;
                case "Pyramid":
                    System.out.println("\nEnter the height and base...");
                    shapeList[i] = new Pyramid(sc.nextInt(), sc.nextInt());
                    break;
                case "Cuboid":
                    System.out.println("\nEnter the length and breadth...");
                    shapeList[i] = new Cuboid(sc.nextInt(), sc.nextInt());
                    break;
                // Q3
                case "Cone":
                    System.out.println("\nEnter the height and base...");
                    shapeList[i] = new Cone(sc.nextInt(), sc.nextInt());
                    break;
                case "Cylinder":
                    System.out.println("\nEnter the length and breadth...");
                    shapeList[i] = new Cylinder(sc.nextInt(), sc.nextInt());
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
