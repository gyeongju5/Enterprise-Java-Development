package ca.sheridancollege;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Controller
public class HomeController {

  @GetMapping("/")
  public String login(@RequestParam(name = "name", required = false) String name, HttpSession session) {

    if (session.isNew()) {
      return "login";

    } else {
      if (Objects.nonNull(name) && !name.isEmpty()) {
        session.setAttribute("yourName", name);

      }
      if (null == session.getAttribute("yourCount")) {
        session.setAttribute("yourCount", 1);
      } else {
        int count = (int) session.getAttribute("yourCount");
        count++;
        session.setAttribute("yourCount", count);
      }

      return "welcome";
    }
  }

  @GetMapping("/endSession")
  public String endSession(HttpSession session) {
    session.invalidate();
    return "redirect:/";
  }
}
