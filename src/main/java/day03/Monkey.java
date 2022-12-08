package main.java.day03;

import main.java.day03.enums.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Monkey {
  //attributes
  private String name;
  private List<Object> stomach = new ArrayList<>();

  //methods
  public void toEat(Object food) {
    if (food instanceof Fruit || food instanceof Monkey) {
      this.stomach.add(food);
    } else {
      throw new IllegalArgumentException("The Monkey doesn't eat this type of food!");
    }
  }

  public void toDigest() {
    if (this.stomach.isEmpty()) {
      throw new RuntimeException("Stomach already empty!");
    } else {
      //https://github.com/cami-la/mentoria_GFT_START_5_23052022/issues/5#issuecomment-1148802692
      this.stomach.remove(this.getStomach().get(0));
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Object> getStomach() {
    return stomach;
  }

  public void setStomach(List<Object> stomach) {
    this.stomach = stomach;
  }
}
