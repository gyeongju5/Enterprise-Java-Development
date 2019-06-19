package ca.sheridancollege.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HomeController {


//    private final DataService service;

//    @Autowired
//    public HomeController(DataService service) {
//        this.service = service;
//    }


  @GetMapping("")
  public String home(HttpServletRequest request, HttpServletResponse response) throws IOException {

    return "addName";
  }

//    @GetMapping("/add")
//    public ModelAndView addNames(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response) throws IOException {
//
//        DAO.names.add(request.getParameter("name"));
////        this.service.addName(request.getParameter("name"));
////        PrintWriter out = response.getWriter();
////        for (String x : DAO.names) {
////            out.println(x);
////        }
//        return new ModelAndView("redirect:/listnames",modelMap);
//    }

  @GetMapping("/add")
  public ModelAndView addNames(ModelMap model, HttpServletRequest request, HttpServletResponse response) throws IOException {
    DAO.names.add(request.getParameter("name"));

    return new ModelAndView("redirect:/", model);
  }

  @GetMapping("/listnames")
  public String listName(HttpServletRequest request, HttpServletResponse response) throws IOException {
    request.setAttribute("woof", DAO.names);
//        request.setAttribute("woof", this.service.getNames());
//        PrintWriter out = response.getWriter();
//        out.println(DAO.names.get(0) + DAO.names.get(1));

    return "thymeleaf";
  }
}
