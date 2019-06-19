package ca.sheridancollege.logic;

import ca.sheridancollege.beans.Beer;

public class BeerExpert {
  public Beer pickBeer(String colour) {

    Beer beer = new Beer();
    beer.setColour(colour);

    if (colour.equals("light")) {
      beer.setPick1("Coor Light");
      beer.setPick2("Bud Light");
    }

    if (colour.equals("amber")) {
      beer.setPick1("Mr Amber");
      beer.setPick2("Mrs Amber");
    }

    if (colour.equals("brown")) {
      beer.setPick1("Pilsner Brown");
      beer.setPick2("Toms Brown");
    }

    if (colour.equals("dark")) {
      beer.setPick1("Kozel Dark");
      beer.setPick2("Stout Dark");
    }

    return beer;
  }
}
