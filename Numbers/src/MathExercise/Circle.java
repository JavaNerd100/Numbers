package MathExercise;

public class Circle  {


   private int centre;
   private double radius;
   private double Diameter;
   private double circumference;


    public Circle(int centre, double radius, double diameter,
                  double circumference) {
        this.centre = centre;
        this.radius = radius;
        this.Diameter = diameter;
        this.circumference = circumference;
    }

    public Circle() {

    }

    public int getCentre() {
        return centre;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return Diameter;
    }

    public void setDiameter(int diameter) {
        Diameter = diameter;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "centre=" + centre +
                ", radius=" + radius +
                ", Diameter=" + Diameter +
                ", circumference=" + circumference +
                '}';
    }
}
