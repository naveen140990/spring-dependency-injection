
package com.naveen.spring.di.services;
/**
 * @author naveen on 10/9/18
 */
public class ComputerWritingService implements WritingService {

  public void write(String message) {
    System.out.printf("Typing: %s%n ", message);
  }
}
