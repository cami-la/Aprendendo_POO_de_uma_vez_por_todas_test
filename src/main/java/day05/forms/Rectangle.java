package main.java.day05.forms;

public class Rectangle implements CalculableArea {
  //attributes
  protected double sideA;
  protected double sideB;

  public Rectangle(double sideA, double sideB) {
    this.sideA = sideA;
    this.sideB = sideB;
  }

  @Override
  public double calculateArea() {
    return sideA * sideB;
  }

  public double getSideA() {
    return sideA;
  }

  public void setSideA(double sideA) {
    this.sideA = sideA;
  }

  public double getSideB() {
    return sideB;
  }

  public void setSideB(double sideB) {
    this.sideB = sideB;
  }
}
