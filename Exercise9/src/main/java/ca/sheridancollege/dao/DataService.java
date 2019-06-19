package ca.sheridancollege.dao;


import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class DataService {

  private List<String> names = new ArrayList<>();


  public List<String> getNames() {
    return this.names;
  }

  public void addName(String name) {
    this.names.add(name);
  }
}
