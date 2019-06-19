package ca.sheridancollege.exercise111.logic;

import ca.sheridancollege.exercise111.beans.ColourBean;

public class ColourExpert {

  public ColourBean makeColourBean(String colour) {

    ColourBean cb = new ColourBean();

    cb.setName(colour);
    System.out.println(cb.getName());
    if(cb.getName().equals("red")) {
      cb.setFood("red1");
      cb.setObject1("red2");
      cb.setObject2("red3");
    } else if (cb.getName().equals("red")) {
      cb.setFood("blue1");
      cb.setObject1("blue2");
      cb.setObject2("blue3");
    } else if (cb.getName().equals("red")) {
      cb.setFood("green1");
      cb.setObject1("green2");
      cb.setObject2("green3");
    } else {
      cb.setFood("yellow1");
      cb.setObject1("yellow2");
      cb.setObject2("yellow3");
    }

    return cb;
  }
}
