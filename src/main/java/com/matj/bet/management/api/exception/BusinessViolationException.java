package com.matj.bet.management.api.exception;

public class BusinessViolationException  extends BadRequestException {
  
  public BusinessViolationException(String message) {
    super(message);
  }
}