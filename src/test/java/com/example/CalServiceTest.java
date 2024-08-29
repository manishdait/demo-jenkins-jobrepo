package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalServiceTest {
  CalService calService = new CalService();

  @Test
  public void shouldAddTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(5, calService.add(a, b));
  }

  @Test
  public void shouldSubtractTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(1, calService.sub(a, b));
  }


  @Test
  public void shouldMultiplyTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(6, calService.mul(a, b));
  }

  @Test
  public void shouldDivideTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(1, calService.div(a, b));
  }
}
