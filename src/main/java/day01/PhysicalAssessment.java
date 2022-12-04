package main.java.day01;

public class PhysicalAssessment {
  //attributes
  private Long id;
  private Client client;
  private String professionalName;
  private double weight;
  private double height;
  private double imc;

  //methods
  public void calculateImc() {
    //imc = weight / (height)²
    this.imc = this.weight / Math.pow(this.height, 2);
  }

  public void addPhysicalAssessment() {
    this.client.getPhysicalAssessmentList().add(this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }

  public String getProfessionalName() {
    return professionalName;
  }

  public void setProfessionalName(String professionalName) {
    this.professionalName = professionalName;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getImc() {
    return imc;
  }

}
