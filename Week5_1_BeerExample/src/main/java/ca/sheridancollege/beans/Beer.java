package ca.sheridancollege.beans;

import java.io.Serializable;

public class Beer implements Serializable {
  private String colour;
  private String pick1;
  private String pick2;

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public String getPick1() {
    return pick1;
  }

  public void setPick1(String pick1) {
    this.pick1 = pick1;
  }

  public String getPick2() {
    return pick2;
  }

  public Beer() {

  }

//    public Beer(String colour, String pick1, String pick2) {
//        this.colour = colour;
//        this.pick1 = pick1;
//        this.pick2 = pick2;
//    }

  public void setPick2(String pick2) {
    this.pick2 = pick2;
  }

  @Override
  public String toString() {
    return "Beer{" +
            "colour='" + colour + '\'' +
            ", pick1='" + pick1 + '\'' +
            ", pick2='" + pick2 + '\'' +
            '}';
  }
}
