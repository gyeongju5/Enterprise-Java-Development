package ca.sheridancollege.demo;

import ca.sheridancollege.demo.beans.ColorBean;
import ca.sheridancollege.demo.logic.ColorExpert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

  @GetMapping("")
  public String pickColor() {

    return "pickColor";
  }

  @GetMapping("/SelectColor.do")
  public String showColor(HttpServletRequest request) {

    String colorEntered = request.getParameter("color");
    ColorExpert ce = new ColorExpert();
    ColorBean colorbean = ce.makeColorBean(colorEntered);

    request.setAttribute("colorBean", colorbean);

    return "showColor";
  }
}
