package com.example.exercise17.dao;

import com.example.exercise17.beans.Contacts;

import java.sql.*;
import java.util.ArrayList;

public class DAOContacts {

  public static void addContacts(Contacts c) {

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = null;

      conn = DriverManager.getConnection
              ("jdbc:mysql://localhost/exercise17", "root", "root");


      String Query = "INSERT INTO contacts VALUES (?,?,?,?)";

      PreparedStatement ps = conn.prepareStatement(Query);

      ps.setString(1, c.getName());
      ps.setString(2, c.getPhone());
      ps.setString(3, c.getPhone());
      ps.setString(4, c.getEmail());

      ps.executeUpdate();

      conn.close();

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static ArrayList<Contacts> viewContacts() {

    ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = null;

      conn = DriverManager.getConnection("jdbc:mysql://localhost/exercise17", "root", "root");

      String Query = "SELECT * FROM contacts";

      Statement st = conn.createStatement();

      ResultSet rs = st.executeQuery(Query);
      ResultSetMetaData rsmd = rs.getMetaData();

      int numColumns = rsmd.getColumnCount();

      while (rs.next()) {
        String name = rs.getString(1);
        String phone = rs.getString(2);
        String address = rs.getString(3);
        String email = rs.getString(4);


        Contacts c = new Contacts(name, phone, address, email);
        contacts.add(c);
      }

    } catch (Exception e) {
      System.out.println(e);
    }

    return contacts;
  }

}
