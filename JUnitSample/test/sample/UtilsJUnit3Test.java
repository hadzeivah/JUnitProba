package sample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sample.Utils;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author Win7
 */
public class UtilsJUnit3Test {
    
    public UtilsJUnit3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
            
            
            
            
            
    }
    
    @AfterClass
    public static void tearDownClass() {
  
    }
    
    @Before 
    public void setUp() {
  
     System.out.println("* UtilsJUnitTest: SetUp() method(");
            
    
    }
    
    @After
    public void tearDown() {
          System.out.println("* UtilsJUnitTest: tearDown() method(");
   
    }

    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void testHelloWorld()
    {
        System.out.println("* UtilsJUnitTest: test method 1 - testHelloWorld()");
   
        assertEquals("Hello, world!",Utils.concatWords("Hello", ", ","world","!"));
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testWithTimeout() throws InterruptedException, TimeoutException
    {
     System.out.println("* UtilsJunit3Test: test method 2 -testWithTimeout()");   
     final int factorialOf=1 + (int)(30000 * Math.random());  
     System.out.println("computing"+ factorialOf+"!");
      
     Thread testThread=new Thread() 
    {   
        @Override 
        public void run()
             {
                 System.out.println(factorialOf+"! = "+Utils.computeFactorial(factorialOf));
             }
           
    };
     testThread.start();
     testThread.sleep(1000);
     testThread.interrupt();
     
     if(testThread.isInterrupted())
     {
        throw new TimeoutException("test test took too long to complete"); 
     }
 }         
    /**
     * Test of normalizeWord method, of class Utils.
     */
    
    @Test
    public void testExpectedException()
    {
        System.out.println("* UtilsJUnit3Test: test method 3 testExpectedException()");

        try
        {
           final int factorialOf=-5;
           System.out.println(factorialOf + "! = " + Utils.computeFactorial(factorialOf));
           fail("IllegalArgumentException was expected");
            
        }
        catch(IllegalArgumentException ex)
                {
                    
                    
                }
        
        
    }
    
    
    
    @Test
    public void DISABLED_testTemporarilyDisabled() throws Exception
    {
       System.out.println("* UtilsJUnit3Test: test method 4 ");
       assertEquals("Malm\u00f6",Utils.normalizeWord("Malmo\u0308"));
    
    }
    
}
