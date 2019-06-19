package ca.sheridancollege.beans;

public class Drink {
  private String name;
  private String main;
  private double amount1;
  private String second;
  private double amount2;
  private String description;

  public Drink(String name, String main, double amount1, String second, double amount2, String description) {
    this.name = name;
    this.main = main;
    this.amount1 = amount1;
    this.second = second;
    this.amount2 = amount2;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMain() {
    return main;
  }

  public void setMain(String main) {
    this.main = main;
  }

  public double getAmount1() {
    return amount1;
  }

  public void setAmount1(double amount1) {
    this.amount1 = amount1;
  }

  public String getSecond() {
    return second;
  }

  public void setSecond(String second) {
    this.second = second;
  }

  public double getAmount2() {
    return amount2;
  }

  public void setAmount2(double amount2) {
    this.amount2 = amount2;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
