package ca.sheridancollege.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {

  public static ArrayList<MyQuestion> qList = new ArrayList<>(Arrays.asList(

          new MyQuestion("Nations", 100, "Capital of S.Korea?", "Toronto", "Washington", "Tokyo", "Seoul", "Seoul"),
          new MyQuestion("Nations", 200, "Capital of USA?", "Toronto", "Washington", "Tokyo", "Seoul", "USA"),
          new MyQuestion("Nations", 300, "Capital of Canada?", "Toronto", "Washington", "Tokyo", "Seoul", "Seoul"),
          new MyQuestion("Nations", 400, "Capital of Japan?", "Toronto", "Washington", "Tokyo", "Seoul", "Japan"),
          new MyQuestion("Nations", 500, "Capital of Ukraine?", "Toronto", "Kiev", "Tokyo", "Seoul", "Kiev"),

          new MyQuestion("Electronics", 100, "Who developed iPhone?", "Samsung", "Apple", "LG", "HTC", "Apple"),
          new MyQuestion("Electronics", 200, "Who developed Galaxy phone?", "Samsung", "Apple", "LG", "HTC", "Samsung"),
          new MyQuestion("Electronics", 300, "Who developed iPad?", "Samsung", "Apple", "LG", "HTC", "Apple"),
          new MyQuestion("Electronics", 400, "Who developed MacBook?", "Samsung", "Apple", "LG", "HTC", "Apple"),
          new MyQuestion("Electronics", 500, "Who developed LG gram laptop?", "Samsung", "Apple", "LG", "HTC", "LG"),

          new MyQuestion("Music", 100, "Whose song is Ode to My Family?", "Cranberries", "Metallica", "Bon Jovi",
                  "Eagles", "Cranberries"),
          new MyQuestion("Music", 200, "Whose song is Nothing Else Matters", "Cranberries", "Metallica", "Bon Jovi",
                  "Eagles", "Metallica"),
          new MyQuestion("Music", 300, "Whose song is Dreams?", "Cranberries", "Metallica", "Bon Jovi", "Eagles",
                  "Cranberries"),
          new MyQuestion("Music", 400, "Whose song is It's My Life?", "Cranberries", "Metallica", "Bon Jovi", "Eagles", "Bon Jovi"),
          new MyQuestion("Music", 500, "Whose song is Hotel California?", "Cranberries", "Metallica", "Bon Jovi",
                  "Eagles", "Eagles"),

          new MyQuestion("Sports", 100, "Which sports is Novak Djokovic playing?", "Tennis", "Soccer", "Baseball",
                  "Basketball", "Tennis"),
          new MyQuestion("Sports", 200, "Which sports is Roger Federer playing?", "Tennis", "Soccer", "Baseball",
                  "Basketball", "Tennis"),
          new MyQuestion("Sports", 300, "Which sports is Sharapova playing?", "Tennis", "Soccer", "Baseball",
                  "Basketball", "Tennis"),
          new MyQuestion("Sports", 400, "Which sports is Stephen Curry playing?", "Tennis", "Soccer", "Baseball",
                  "Basketball", "Basketball"),
          new MyQuestion("Sports", 500, "Which sports is Lionel Messi playing?", "Tennis", "Soccer", "Baseball",
                  "Basketball", "Soccer"),

          new MyQuestion("Programming", 100, "Guido van Rossum developed this language", "C", "Python", "GoLang",
                  "Java", "Python"),
          new MyQuestion("Programming", 200, "Dennis Ritche developed this language", "C", "Python", "GoLang",
                  "Javascript", "C"),
          new MyQuestion("Programming", 300, "Ken Thompson and Rob Pike developed this langeuage", "C", "Python",
                  "GoLang", "Javascript", "GoLang"),
          new MyQuestion("Programming", 400, "Netscape developed this language", "C", "Python", "GoLang", "Javascript", "Javascript"),
          new MyQuestion("Programming", 500, "James Gosling developed this language", "C", "Python", "GoLang",
                  "JavaScript", "Java"))
  );

}
