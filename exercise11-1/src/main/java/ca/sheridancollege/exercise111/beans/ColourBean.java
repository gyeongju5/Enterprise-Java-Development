package ca.sheridancollege.exercise111.beans;

import java.io.Serializable;

public class ColourBean {
  private String name;
  private String food;
  private String object1;
  private String object2;

  public ColourBean() {
  }

  public ColourBean(String name, String food, String object1, String object2) {
    this.name = name;
    this.food = food;
    this.object1 = object1;
    this.object2 = object2;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getObject1() {
    return object1;
  }

  public void setObject1(String object1) {
    this.object1 = object1;
  }

  public String getObject2() {
    return object2;
  }

  public void setObject2(String object2) {
    this.object2 = object2;
  }
}
