public class Pyramid implements Shape {
    private int height;
    private int base;

    public Pyramid(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public double findArea() {
        double halfBase = base / 2;
        double l = Math.sqrt(halfBase * halfBase + height * height);
        return base * l * 2 + base * base;
    }
}
