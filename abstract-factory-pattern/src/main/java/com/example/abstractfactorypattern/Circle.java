package com.example.abstractfactorypattern;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("drawing circle");
  }
}
