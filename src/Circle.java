public class Circle {

    private final int radius;
    Circle(int radius){
        this.radius = radius;
    }

    public double getRadius() {
        return Math.PI * (this.radius * this.radius);
    }
}
