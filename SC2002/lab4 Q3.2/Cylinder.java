public class Cylinder implements Shape {
    private int length;
    private int breadth;

    public Cylinder(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double findArea() {
        return 2 * Math.PI * breadth * length + 2 * Math.PI * breadth * breadth;
    }
}
