public class Triangle implements Shape {
    private int height;
    private int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public double findArea() {
        return 0.5 * height * base;
    }
}
