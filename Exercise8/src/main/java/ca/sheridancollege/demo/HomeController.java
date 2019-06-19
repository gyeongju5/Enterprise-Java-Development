package ca.sheridancollege.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class HomeController {
  private String username = "ko";
  private String password = "gyeongju";

  @GetMapping("")
  public String root() {
    return "home.html";
  }

  @GetMapping("/Dice")
  public void exercise6(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    String d1 = Integer.toString((int) ((Math.random() * 6) + 1));
    String d2 = Integer.toString((int) ((Math.random() * 6) + 1));
    out.println("<html><body>"
            + "<h1 align=center>HF\' Chap 2 Dice Roller</h1>"
            + "<p align=center>" + d1 + " and " + d2 + " were rolled"
            + "</body></html>");
  }

  @GetMapping("/login")
  public String exercise7() {
    return "login.html";
  }

  @GetMapping("/log")
  public void processLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String s1 = request.getParameter("user");
    String s2 = request.getParameter("pass");
    String s3 = username;
    String s4 = password;

    PrintWriter out = response.getWriter();

    if (s1.equals(s3) && s2.equals(s4)) {
      out.println("<html><body>Login Success!</body></html>");
    } else {
      out.println("<html><body>Login Failed!</body></html>");
    }
  }
}
