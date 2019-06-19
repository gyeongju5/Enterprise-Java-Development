package ca.sheridancollege.beans;

import lombok.*;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink implements Serializable {

  private String name;
  private String main;
  private double amount1;
  private String second;
  private double amount2;
  private String description;

}
