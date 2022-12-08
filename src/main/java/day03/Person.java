package main.java.day03;

import java.util.Objects;

public class Person {
  //attributes
  private String name;
  private Person mother;
  private Person father;

  //constructor method

  public Person(String name) {
    this.name = name;
  }

  public Boolean isSiblings(Person person) {
    return this.mother.equals(person.mother) || this.father.equals(person.father);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Person getMother() {
    return mother;
  }

  public void setMother(Person mother) {
    this.mother = mother;
  }

  public Person getFather() {
    return father;
  }

  public void setFather(Person father) {
    this.father = father;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;
    return name.equals(person.name) && mother.equals(person.mother);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mother);
  }
}
