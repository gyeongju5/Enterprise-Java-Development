package ca.sheridancollege.dao;

import ca.sheridancollege.beans.Drink;

import java.sql.*;
import java.util.ArrayList;

public class DAO {

  public static void testConnection() {

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = null;

      conn = DriverManager.getConnection("jdbc:mysql://localhost/exercise14", "root", "root");
      Statement st = conn.createStatement();

//      String Query = "";
//
//      ResultSet rs = st.executeQuery(Query);
//      st.executeUpdate(Query);

      System.out.println("Connection Success");
      conn.close();

    } catch (Exception e) {
      System.out.println("Connection Failed");
      System.out.println(e);
    }
  }

  public static void addDrink(Drink d) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = null;

      conn = DriverManager.getConnection
              ("jdbc:mysql://localhost/exercise14", "root", "root");

      //We build the MySQL string that will be used to insert our drink
      //into our database.  We do not include the ; at the end of the
      //statement because that is added when we use update.
      String q = " Insert Into easy_drinks Values('" + d.getName()
              + "', '" + d.getMain() + "', " + d.getAmount1() + ", '" + d.getSecond()
              + "', " + d.getAmount2() + ", '" + d.getDescription() + "')";

      Statement st = conn.createStatement();
      // st.executeQuery(q) --> Get a table
      // st.executeUpdate(q) --> Modify a table
      st.executeUpdate(q);

      conn.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static ArrayList<Drink> getDrinks() {

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
