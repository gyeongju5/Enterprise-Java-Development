package com.example.exercise161;

import com.example.exercise161.beans.Drink;
import com.example.exercise161.dao.DAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

  @GetMapping("")
  public String home() {
    return "index";
  }

  @GetMapping("/addDrink")
  public String addDrink(HttpServletRequest request) {

    String name = request.getParameter("name");
    String main = request.getParameter("main");
    double amount1 = Double.parseDouble(request.getParameter("amount1"));
    String second = request.getParameter("second");
    double amount2 = Double.parseDouble(request.getParameter("amount2"));
    String description = request.getParameter("description");

    Drink d = new Drink(name, main, amount1, second, amount2, description);
    DAO.addDrink(d);

    return "redirect:/getDrinks";
  }

  @GetMapping("/getDrinks")
  public String getDrink(HttpServletRequest request) {

    request.setAttribute("drinks", DAO.getDrink());
    return "getDrink";
  }


}
