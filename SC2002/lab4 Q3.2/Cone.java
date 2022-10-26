public class Cone implements Shape {
    private int height;
    private int base;

    public Cone(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public double findArea() {
        return Math.PI * base * base + Math.PI * base * Math.sqrt((Math.pow(base, 2) + Math.pow(height, 2)));
    }
}
