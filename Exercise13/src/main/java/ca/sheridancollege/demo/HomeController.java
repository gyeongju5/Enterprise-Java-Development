package ca.sheridancollege.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

  @GetMapping("")
  public String login() {
    return "login.html";
  }

  @GetMapping("/jeopardy")
  public String jeopardy(HttpServletRequest request, HttpSession session) {

    if(request.getParameter("username") == null) {

      Player player = (Player)session.getAttribute("player");
      session.setAttribute("player", player);

      return "jeopardy.html";
    }

    Player player = new Player();
    String name = request.getParameter("username");
    player.setName(name);
    player.setScore(0);
    session.setAttribute("player", player);
    System.out.println(player);
    return "jeopardy.html";
  }

  @GetMapping("/question")
//  public String question(@RequestParam int value, @RequestParam String category, Model model) {
  public String question(HttpServletRequest request, HttpSession session) {

    int qnum = Integer.parseInt(request.getParameter("qnum"));
    QuestionSelect qs = new QuestionSelect();
    MyQuestion ques = qs.getQuestion(qnum);
    session.setAttribute("question", ques);

    return "question";
  }

  @GetMapping("/evaluate")
  public String evaluate(HttpServletRequest request, HttpSession session) {

    String pickedAnswer = request.getParameter("pickedAnswer");
    String correctAnswer = request.getParameter("correctAnswer");
    int value = Integer.parseInt(request.getParameter("value"));

    if (pickedAnswer.equals(correctAnswer)) {
      Player player = (Player)session.getAttribute("player");
      player.setScore(player.getScore() + value);

    } else {
      Player player = (Player)session.getAttribute("player");
      player.setScore(player.getScore() - value);
    }
    return "redirect:/jeopardy";
  }

}
