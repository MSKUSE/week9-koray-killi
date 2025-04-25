public class Circle extends Shape {
    public int radius = 0;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }


}