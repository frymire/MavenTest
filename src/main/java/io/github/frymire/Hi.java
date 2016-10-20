package io.github.frymire;

import javax.swing.JOptionPane;

/**
 * This is a class to show whether or not I know how to use Maven.
 */
public class Hi {  
  
  /**
   * Warmly greets the user.
   */
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Hello, cruel world.");    
    System.exit(0); // Need to do this explicitly, since we're using a GUI.
  }  
}