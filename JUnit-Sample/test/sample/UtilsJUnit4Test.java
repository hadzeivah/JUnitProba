/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author Andrej_
 */
public class UtilsJUnit4Test {
    
    public UtilsJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    System.out.println("* UtilsJUnit4Test> @BeforeClass method");
    }
    
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("* UtilsJUnit4Test> @AfterClass method");
    }
    
    @Before
    public void setUp()
    {
        System.out.println("* UtilsJUnit4Test> @Before method");
    }
    @After
    public void tearDown()
    {
        System.out.println("* UtilsJUnit4Test> @After method");
    }
    
    
    /**
     * Test of concatWords method, of class Utils.
     */
    @Test
    public void helloWordlCheck(){
        System.out.println("helloWordlCheck!");
        assertEquals("Hello, world!", Utils.concatWords("Hello",","," ","world!"));
    }

    /**
     * Test of computeFactorial method, of class Utils.
     */
    @Test
    public void testComputeFactorial() {
        System.out.println("computeFactorial");
        assertEquals("6", Utils.computeFactorial(3));
    }
   
    
    @Test(timeout=10000)
    public void testWithTimeout(){
        System.out.println("testWithTimeout");
        final int f= 1 + (int) (30000 * Math.random());
        System.out.println(Utils.computeFactorial(f));
    }

    
    @Test(expected=IllegalArgumentException.class)
    public void checkExpectedException(){
    System.out.println("checkExpectedException");
    System.out.println(Utils.computeFactorial(-5));
    }
    /**
     * Test of normalizeWord method, of class Utils.
     */
    
    @Test
    public void temporarilyDisabledTest() throws Exception {
    System.out.println("* UtilsJUnit4Test> TEST - Temporarilydisabled");
    assertEquals("Malm\u00f6", Utils.normalizeWord("Malmo\u0308"));
    }
            
    
}
