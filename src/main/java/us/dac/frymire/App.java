package us.dac.frymire;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * You're an idiot if you think this is going to work.<p>
 *
 * (C) Copyright DECISIVE ANALYTICS Corporation 2016<br>
 * All Rights Reserved<br>
 * DAC Proprietary<br>
 *
 * @author mark.e.frymire
 *
 */
public class App {
  
  public static void main(String[] args) {
    
    Logger myLog = LogManager.getLogger();
    myLog.info("It's working!");
    
    System.out.println("Hi.");
  }
  
}
