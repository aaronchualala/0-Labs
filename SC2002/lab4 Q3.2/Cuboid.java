public class Cuboid implements Shape {
    private int length;
    private int breadth;

    public Cuboid(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double findArea() {
        return 6 * Math.pow(length, 2);
    }
}
