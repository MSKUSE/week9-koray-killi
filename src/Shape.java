public abstract class Shape{

    private String color="white";
    public Shape(String color){
        this.color = color;
    }

    public abstract double perimeter();
    public abstract double area();




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}