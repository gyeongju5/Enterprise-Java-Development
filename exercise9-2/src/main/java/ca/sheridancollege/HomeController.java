package ca.sheridancollege;

import ca.sheridancollege.dao.DAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

  @GetMapping("")
  public String home() {
    return "addName";
  }

  @GetMapping("/add")
  public String addNames(HttpServletRequest request, HttpServletResponse response) {
    DAO.names.add(request.getParameter("name"));

    return "redirect:/";
  }

  @GetMapping("/list")
  public String list(HttpServletRequest request, HttpServletResponse response) {

    request.setAttribute("woof", DAO.names);

    return "thymeleaf";
  }
}
