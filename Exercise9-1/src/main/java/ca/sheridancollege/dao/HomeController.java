package ca.sheridancollege.dao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

    @GetMapping("")
    public String home() {
        return "addName.html";
    }

    @GetMapping("/add")
    public ModelAndView add(ModelMap model, HttpServletRequest request) {
        DAO.names.add(request.getParameter("name"))
        return new ModelAndView("redirect:/", model);
    }

    @GetMapping("listnames")
    public String listNames(HttpServletRequest request) {
        request.setAttribute("woof", DAO.names);
        return "thymeleaf";

    }
}
