package ca.sheridancollege.demo;

public class QuestionSelect {

  public QuestionSelect() {
  }

  public MyQuestion getQuestion(int qnum) {
    MyQuestion myquestion = Question.qList.get(qnum);
    return myquestion;
  }
}
