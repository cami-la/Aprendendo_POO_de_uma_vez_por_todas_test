package main.java.day03;

import java.math.BigDecimal;

public class GasStation {
  //atributes
  private FuelType fuelType;
  private BigDecimal priceFuel;
  private double quantityFuel;

  //constructor method
  public GasStation() {
    this.quantityFuel = 100;
  }

  //methods
  public double supply(BigDecimal value) {
    double quantityLiterSupply = value.divide(this.priceFuel).doubleValue();
    if (quantityLiterSupply <= this.getQuantityFuel()) {
      double quantityFinalFuel = this.getQuantityFuel() - quantityLiterSupply;
      setQuantityFuel(quantityFinalFuel);
      return quantityFinalFuel;
    } else {
      throw new IllegalArgumentException(
          String.format("Impossible to supply this quantity %s of fuel!", quantityLiterSupply));
    }
  }

  public BigDecimal supply(double quantityLiters) {
    if (quantityLiters <= this.getQuantityFuel()) {
      double quantityFinalFuel = getQuantityFuel() - quantityLiters;
      setQuantityFuel(quantityFinalFuel);
      return BigDecimal.valueOf(quantityLiters).multiply(getPriceFuel());
    } else {
      throw new IllegalArgumentException(
          String.format("Impossible to supply this quantity %s of fuel!", quantityLiters));
    }
  }

  public FuelType getFuelType() {
    return fuelType;
  }

  public void setFuelType(FuelType fuelType) {
    this.fuelType = fuelType;
  }

  public BigDecimal getPriceFuel() {
    return priceFuel;
  }

  public void setPriceFuel(BigDecimal priceFuel) {
    this.priceFuel = priceFuel;
  }

  public double getQuantityFuel() {
    return quantityFuel;
  }

  public void setQuantityFuel(double quantityFuel) {
    this.quantityFuel = quantityFuel;
  }
}
