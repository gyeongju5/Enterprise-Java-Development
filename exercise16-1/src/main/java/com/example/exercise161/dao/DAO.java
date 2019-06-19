package com.example.exercise161.dao;

import com.example.exercise161.beans.Drink;

import java.sql.*;
import java.util.ArrayList;

public class DAO {
  public static void addDrink(Drink d) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = null;

      conn = DriverManager.getConnection
              ("jdbc:mysql://localhost/exercise14", "root", "root");


      String Query = "INSERT INTO easy_drinks VALUES (?,?,?,?,?,?)";

      PreparedStatement ps = conn.prepareStatement(Query);

      ps.setString(1, d.getName());
      ps.setString(2, d.getMain());
      ps.setDouble(3, d.getAmount1());
      ps.setString(4, d.getSecond());
      ps.setDouble(5, d.getAmount2());
      ps.setString(6, d.getDescription());
      ps.executeUpdate();

      conn.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static ArrayList<Drink> getDrink() {

    ArrayList<Drink> drinks = new ArrayList<Drink>();

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = null;

      conn = DriverManager.getConnection("jdbc:mysql://localhost/exercise14", "root", "root");

      String Query = "SELECT * FROM easy_drinks";

      Statement st = conn.createStatement();

      ResultSet rs = st.executeQuery(Query);
      ResultSetMetaData rsmd = rs.getMetaData();

      int numColumns = rsmd.getColumnCount();

      while (rs.next()) {
        String name = rs.getString(1); // name
        String main = rs.getString(2); // main
        double amount1 = rs.getDouble(3); // amount1
        String second = rs.getString(4); // second
        double amount2 = rs.getDouble(5); // amount2
        String description = rs.getString(6); // description

        Drink d = new Drink(name, main, amount1, second, amount2, description);
        drinks.add(d);
      }

    } catch (Exception e) {
      System.out.println(e);
    }

    return drinks;
  }
}