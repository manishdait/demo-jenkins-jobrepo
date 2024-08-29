package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
  @Test
  public void shouldReturnMinIntVal() {
    assertEquals(Integer.MIN_VALUE, App.displayResult(2, 1, 'i'));
  }

  @Test
  public void shouldAddTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(5, App.displayResult(a, b, '+'));
  }

  @Test
  public void shouldSubtractTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(1, App.displayResult(a, b, '-'));
  }


  @Test
  public void shouldMultiplyTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(6, App.displayResult(a, b, '*'));
  }

  @Test
  public void shouldDivideTwoNumber(){
    int a = 3;
    int b = 2;
    assertEquals(1, App.displayResult(a, b, '/'));
  }
}
