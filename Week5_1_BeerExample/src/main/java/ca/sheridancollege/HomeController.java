package ca.sheridancollege;

import ca.sheridancollege.beans.Beer;
import ca.sheridancollege.logic.BeerExpert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "pickBeer.html";
  }

  @GetMapping("SelectBeer.do")
  public String selectBeer(HttpServletRequest request) {

    String c = request.getParameter("colour");
    BeerExpert be = new BeerExpert();
    Beer b = be.pickBeer(c);
    request.setAttribute("mybeer", b);
    System.out.println(be.pickBeer(c));

    return "showBeer";
  }
}
