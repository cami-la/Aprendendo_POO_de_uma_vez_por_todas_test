package test.java.day03;

import main.java.day03.GasStation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
  //attributes
  private GasStation gasStation;

  @BeforeEach
  void setUp() {
    gasStation = new GasStation();
  }

  @Test
  void shouldFuelVehicleReturnQuantityLiter_WhenSupplyByValue() {
    //given
    BigDecimal priceFuel = BigDecimal.valueOf(2d);
    BigDecimal valueSupply = BigDecimal.valueOf(100d);
    gasStation.setPriceFuel(priceFuel);
    //when
    double actual = gasStation.supply(valueSupply);
    //then
    double expectedQuantityLiterSupply = 50d;
    Assertions.assertEquals(actual, expectedQuantityLiterSupply);

    double actualLiterGasStation = gasStation.getQuantityFuel();
    double expectedLiterGasStation = 50d;
    Assertions.assertEquals(actualLiterGasStation, expectedLiterGasStation);
  }

  @Test
  void shouldThrowIllegalArgumentException_WhenTryFuelVehicleByValueAndInsufficientFuelOnGasStation() {
    //given
    BigDecimal priceFuel = BigDecimal.valueOf(2d);
    BigDecimal valueSupply = BigDecimal.valueOf(500);
    gasStation.setPriceFuel(priceFuel);
    //when
    IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
      gasStation.supply(valueSupply);
    });
    //then
    String expected = String.format("Impossible to supply this quantity %s of fuel!", valueSupply);
    Assertions.assertEquals(actual.getMessage(), expected);

    double actualLiterGasStation = gasStation.getQuantityFuel();
    double expectedLiterGasStation = 100d;
    Assertions.assertEquals(actualLiterGasStation, expectedLiterGasStation);
  }

  @Test
  void shouldFuelVehicleReturnQuantityLiter_WhenSupplyByLiter() {
    //given
    BigDecimal priceFuel = BigDecimal.valueOf(4d);
    double quantityLiter = 50d;
    gasStation.setPriceFuel(priceFuel);
    //when
    BigDecimal actual = gasStation.supply(quantityLiter);
    actual = actual.setScale(2,  RoundingMode.HALF_EVEN);
    //then
    BigDecimal expectedValueLitersSupply = BigDecimal.valueOf(200);
    expectedValueLitersSupply = expectedValueLitersSupply.setScale(2,  RoundingMode.HALF_EVEN);
    Assertions.assertEquals(actual, expectedValueLitersSupply);

    double actualLiterGasStation = gasStation.getQuantityFuel();
    double expectedLiterGasStation = 50d;
    Assertions.assertEquals(actualLiterGasStation, expectedLiterGasStation);
  }

  @Test
  void shouldThrowIllegalArgumentException_WhenTryFuelVehicleByLitersAndInsufficientFuelOnGasStation() {
    //given
    BigDecimal priceFuel = BigDecimal.valueOf(4d);
    double quantityLiter = 150d;
    gasStation.setPriceFuel(priceFuel);
    //when
    IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () -> {
      gasStation.supply(quantityLiter);
    });
    //then
    String expected = String.format("Impossible to supply this quantity %s of fuel!", quantityLiter);
    Assertions.assertEquals(actual.getMessage(), expected);

    double actualLiterGasStation = gasStation.getQuantityFuel();
    double expectedLiterGasStation = 100d;
    Assertions.assertEquals(actualLiterGasStation, expectedLiterGasStation);
  }
}