package ca.sheridancollege.exercise111;

import ca.sheridancollege.exercise111.beans.ColourBean;
import ca.sheridancollege.exercise111.logic.ColourExpert;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

  @GetMapping("")
  public String home() {

    return "pickColor";

  }

  @GetMapping("/SelectColour.do")
  public String pickColour(HttpServletRequest request) {

    String colourEntered = request.getParameter("colour");

    ColourExpert ce = new ColourExpert();
    ColourBean colourbean = ce.makeColourBean(colourEntered);

    request.setAttribute("colourBean", colourbean);

    return "getColor";

  }
}
