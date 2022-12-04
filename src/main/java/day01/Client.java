package main.java.day01;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Client {
  //atributes
  private Long id;
  private LocalDate registerDate;
  private String name;
  private LocalDate birthDate;
  private String cep;
  private List<PhysicalAssessment> physicalAssessmentList = new ArrayList<>();

  //methods
  public int calculateAge() {
    //age = actualDate - bithDate;
    return Period.between(birthDate, LocalDate.now()).getYears();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LocalDate getRegisterDate() {
    return registerDate;
  }

  public void setRegisterDate(LocalDate registerDate) {
    this.registerDate = registerDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public List<PhysicalAssessment> getPhysicalAssessmentList() {
    return physicalAssessmentList;
  }

}
