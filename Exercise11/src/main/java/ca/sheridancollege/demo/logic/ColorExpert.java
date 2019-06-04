package ca.sheridancollege.demo.logic;

import ca.sheridancollege.demo.beans.ColorBean;

public class ColorExpert {

  public ColorBean makeColorBean(String color) {

    ColorBean cb = new ColorBean();

    if (color.equals("red")) {
      cb.setName(color);
      cb.setFood("Tomato Pasta");
      cb.setObject1("Apple");
      cb.setObject2("Cherry");
    }
    if (color.equals("green")) {
      cb.setName(color);
      cb.setFood("Green Scrambled Egg Wrap");
      cb.setObject1("Spinach");
      cb.setObject2("lettuce");
    }
    if (color.equals("blue")) {
      cb.setName(color);
      cb.setFood("Blueberry");
      cb.setObject1("BlueJays");
      cb.setObject2("Blue Scissors");
    }
    if (color.equals("yellow")) {
      cb.setName(color);
      cb.setFood("Curry");
      cb.setObject1("Peanuts");
      cb.setObject2("Bananas");
    }

    return cb;
  }
}
