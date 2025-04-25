public class Rectangle extends Shape implements Drawable{
    int sideA = 0;
    int sideB = 0;

    public Rectangle(String color, int sideB, int sideA) {
        super(color);
        this.sideB = sideB;
        this.sideA = sideA;
    }

    @Override
    public double perimeter() {
        return 2*(this.sideA + this.sideB);
    }

    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn.");
    }
}
