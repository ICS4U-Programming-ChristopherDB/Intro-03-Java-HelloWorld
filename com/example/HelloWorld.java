package com.example;

/**
 * Says hello to my friend.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 14-2-2024
 */

// HelloWorld class
public final class HelloWorld {

  /** Private constructor to prevent instantiation. */
  private HelloWorld() {
    throw new UnsupportedOperationException("Cannot instantiate");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    System.out.println("Hello, Spencer!");
    System.out.println("Look at this funny face: ( ͡° ʖ ͡°)");
  }
}
