package ca.sheridancollege;

import ca.sheridancollege.beans.Drink;
import ca.sheridancollege.dao.DAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

  @GetMapping("")
  public String test() {
    return "addDrinks";
  }

  @GetMapping("/testDatabase")
  public String test1() {
    DAO.testConnection();
    return "home.html";
  }

  @GetMapping("/addDrinks")
  public String addDrink(HttpServletRequest request, HttpSession session) {

    String name = request.getParameter("name");
    String main = request.getParameter("main");
    double amount1 = Double.parseDouble(request.getParameter("amount1"));
    String second = request.getParameter("second");
    double amount2 = Double.parseDouble(request.getParameter("amount2"));
    String description = request.getParameter("description");

    Drink d = new Drink(name, main, amount1, second, amount2, description);
    DAO.addDrink(d);
    System.out.println(name);

    return "home.html";
  }

  @GetMapping("/getDrinks")
  public String getDrinks(HttpServletRequest request, Model model, HttpSession session) {


    //request.setAttribute("drinks", DAO.getDrinks());
    model.addAttribute("drinks", DAO.getDrinks());
    System.out.println(DAO.getDrinks().get(0).getName());
    System.out.println(DAO.getDrinks());

    return "getDrinks";
  }


}
