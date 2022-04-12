package com.matj.bet.management.api.entity;

import com.matj.bet.management.api.enumeration.BetResultEnum;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "bets")
public class BetEntity {

  @Id
  private String id;

  private LocalDate eventDate;

  @DBRef
  private LeagueEntity league;

  @DBRef
  private TeamEntity home;

  @DBRef
  private TeamEntity away;

  private String bet;

  @DBRef
  private MethodEntity method;

  @DBRef
  private StakeEntity stake;

  private BigDecimal odd;
  private BetResultEnum result;
}
