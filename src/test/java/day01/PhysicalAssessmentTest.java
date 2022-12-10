package test.java.day01;

import main.java.day01.Client;
import main.java.day01.PhysicalAssessment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;


class PhysicalAssessmentTest {
  private PhysicalAssessment physicalAssessment;

  @BeforeEach
  void setUp() {
    this.physicalAssessment = new PhysicalAssessment();
  }

  @Test
  void shouldCalculateCurrentImcValue() {
    //given
    double weight = 69d;
    double height = 1.71d;
    this.physicalAssessment.setWeight(weight);
    this.physicalAssessment.setHeight(height);
    DecimalFormat df = new DecimalFormat("#.0");
    //when
    this.physicalAssessment.calculateImc();
    double actual = physicalAssessment.getImc();
    //then
    double expected = 23.6;

    String expectedFormat = df.format(expected);
    String actualFormat = df.format(actual);
    Assertions.assertEquals(expectedFormat, actualFormat);
  }

  @Test
  void shouldAddNewPhysicalAssessmentToClient() {
    //given
    Client client = new Client();
    this.physicalAssessment.setClient(client);
    //when
    physicalAssessment.addPhysicalAssessment();
    int actual = client.getPhysicalAssessmentList().size();
    //then
    int expected = 1;
    Assertions.assertEquals(expected, actual);
  }

}