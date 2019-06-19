package ca.sheridancollege.demo;

public class Player {
  private String name = new String();
  private int score = 0;

  public Player() {
  }

  ;

  public Player(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
