package ca.sheridancollege;

import ca.sheridancollege.beans.Drink;
import ca.sheridancollege.dao.DAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("")
  public String test() {
    return "home";
  }

  @GetMapping("/testDatabase")
  public String test1() {
    DAO.testConnection();
    return "home.html";
  }

  @GetMapping("/addDrink")
  public String addDrink() {
    String name = "My new Drink";
    String main = "Some Juice";
    double amount1 = 5.4;
    String second = "Tequilla";
    double amount2 = 3.2;
    String description = "Shake well";

    Drink d = new Drink(name, main, amount1, second, amount2, description);
    DAO.addDrink(d);
    System.out.println(d);

    return "home.html";
  }


}
