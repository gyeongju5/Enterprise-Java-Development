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
  public String jeopardy(HttpServletRequest request) {
    request.setAttribute("username", request.getParameter("username"));
    Player player = new Player();
//    player.setName();

    return "jeopardy.html";
  }

  @GetMapping("/question")
//  public String question(@RequestParam int value, @RequestParam String  category, Model model) {
  public String question(HttpServletRequest request, HttpSession session) {
//      MyQuestion myquestion = new MyQuestion();
//      myquestion.getQuestion();
//      Question.qList.get(0).getQuestion();
//      session.getAttribute("test");
//      int a = Integer.parseInt(request.getParameter("test"));
//      System.out.println(Question.qList.get(a).getQuestion());
//    System.out.println(a);

//    Question myQuestion = listOfQuestions.getByValueAndCategory();
//    model.addAttribute("question",myQuestion);
    int index = Integer.parseInt(request.getParameter("number"));
    String question = Question.qList.get(index).getQuestion();
    String answer1 = Question.qList.get(index).getAnswer1();
    String answer2 = Question.qList.get(index).getAnswer2();
    String answer3 = Question.qList.get(index).getAnswer3();
    String answer4 = Question.qList.get(index).getAnswer4();
    String answer = Question.qList.get(index).getCorrectAnswer();

    session.setAttribute("question", question);
    session.setAttribute("answer1", answer1);
    session.setAttribute("answer2", answer2);
    session.setAttribute("answer3", answer3);
    session.setAttribute("answer4", answer4);
    session.setAttribute("answer", answer);


    return "question";
  }
}
