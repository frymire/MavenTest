package io.github.frymire;

import javax.swing.JOptionPane;

public class Hi {  
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Hi.");    
    System.exit(0); // Need to do this explicitly, since we're using a GUI.
  }  
}