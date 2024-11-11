package Estudos.Avaliacao2PM.entitiesA;

public class Circle extends Shape {
    private double radius;
    public Circle(Color color, double radius) {
        super(color);
        setRadius(radius);
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}