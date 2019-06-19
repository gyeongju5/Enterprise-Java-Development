package com.example.exercise17;


import com.example.exercise17.beans.Contacts;
import com.example.exercise17.dao.DAOContacts;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

  @GetMapping("/")
  public String home() {
    return "newContacts";
  }

  @GetMapping("/addContacts")
  public String addContacts(HttpServletRequest request) {

    String name = request.getParameter("name");
    String phone = request.getParameter("phone");
    String address = request.getParameter("address");
    String email = request.getParameter("email");

    Contacts c = new Contacts(name, phone, address, email);
    DAOContacts.addContacts(c);

    return "redirect:/";
  }

  @GetMapping("/viewContacts")
  public String viewContatcts(HttpServletRequest request) {

    request.setAttribute("drinks", DAOContacts.viewContacts());

    return "viewContacts";
  }
}
