package ca.sheridancollege;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class HomeController {

  @GetMapping("")
  public String goHome() {
    return "sessionTest.html";
  }

  @GetMapping("/testSession")
  public String testSession(HttpServletRequest request, HttpSession session) {

    if (session.isNew()) {
      request.setAttribute("reqVar", "The Session is new");
    } else {
      request.setAttribute("reqVar", "Welcome Back");
    }
    session.setAttribute("meow", session.getId());

    return "sessionTest";
  }

  @GetMapping("add")
  public String addName(HttpServletRequest request, HttpSession session) {

    session.setMaxInactiveInterval(60 * 20); // 20 mins
    String n = request.getParameter("name");
    ArrayList<String> names;
    if (session.isNew()) {
      names = new ArrayList<String>();
    } else {
      names = (ArrayList<String>)session.getAttribute("nameList");
    }
    names.add(n);
    session.setAttribute("nameList", names);

    return "redirect:/";
  }

  @GetMapping("/endSession")
  public String endSession(HttpServletRequest request, HttpSession session) {
    session.invalidate();
    return "sessionTest";
  }
}