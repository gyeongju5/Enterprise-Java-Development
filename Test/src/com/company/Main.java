package com.company;

import com.company.beans.ColorBean;
import com.company.logic.ColorExpert;

public class Main {

  public static void main(String[] args) {

    ColorExpert be = new ColorExpert();
    ColorBean cb = be.makeColorBean("yellow");


  }
}
