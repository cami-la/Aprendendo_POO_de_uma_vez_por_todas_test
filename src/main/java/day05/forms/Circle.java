package main.java.day05.forms;

public class Circle implements CalculableArea {
  //attributes
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
