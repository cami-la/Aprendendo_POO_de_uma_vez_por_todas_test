package test.java.day03;

import main.java.day03.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
  private Person person;
  @BeforeEach
  void setUp() {
    person = new Person("Cami");
  }

  @Test
  void shouldVerifierIsSameObjectReturnTrue_WhenPersonIsSame() {
    //given
    Person mother = new Person("Mother");

    person.setMother(mother);
    Person person2 = new Person("Cami");
    person2.setMother(mother);
    //when
    boolean actual = person.equals(person2);
    //then
    Boolean expected = true;
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldVerifierIsSameObjectReturnFalse_WhenPersonDoesntSame() {
    //given
    Person mother = new Person("Mother");
    Person mother2 = new Person("Mother 1");

    person.setMother(mother);
    Person person2 = new Person("Cami");
    person2.setMother(mother2);
    //when
    boolean actual = person.equals(person2);
    //then
    Boolean expected = false;
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldReturnTrue_WhenMotherIsSame() {
    //given
    Person mother = new Person("Mother");

    person.setMother(mother);
    Person person2 = new Person("Cami 2");
    person2.setMother(mother);
    //when
    boolean actual = person.isSiblings(person2);
    //then
    Boolean expected = true;
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void shouldReturnTrue_WhenFatherDoesntSame() {
    //given
    Person mother = new Person("Mother");
    Person mother2 = new Person("Mother 1");

    Person father = new Person("Father");
    Person father2 = new Person("Father 2");

    person.setMother(mother);
    person.setFather(father);
    Person person2 = new Person("Cami 2");
    person2.setMother(mother2);
    person2.setFather(father2);
    //when
    boolean actual = person.isSiblings(person2);
    //then
    Boolean expected = false;
    Assertions.assertEquals(expected, actual);
  }
}