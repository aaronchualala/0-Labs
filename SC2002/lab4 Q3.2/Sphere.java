public class Sphere implements Shape {
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    public double findArea() {
        return 4 * Math.PI * radius * radius;
    }
}
