package main.java.day05.forms;

public class Trapeze implements CalculableArea {
  //attributes
  private double baseA;
  private double baseB;
  private double height;

  public Trapeze(double baseA, double baseB, double height) {
    this.baseA = baseA;
    this.baseB = baseB;
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return ((this.baseA + this.baseB)/2) * this.height;
  }

  public double getBaseA() {
    return baseA;
  }

  public void setBaseA(double baseA) {
    this.baseA = baseA;
  }

  public double getBaseB() {
    return baseB;
  }

  public void setBaseB(double baseB) {
    this.baseB = baseB;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
