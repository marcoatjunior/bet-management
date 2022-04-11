package com.matj.bet.management.api.entity;

import com.matj.bet.management.api.dto.model.team.TeamModelDto;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
  
  private LocalDateTime time;
  private String league;

  @DBRef
  private TeamModelDto home;
  
  @DBRef
  private TeamModelDto away;
  
  private String bet;

  @DBRef
  private MethodEntity method;

  @DBRef
  private StakeEntity stake;

  private BigDecimal odd;
  private BigDecimal result;
}
