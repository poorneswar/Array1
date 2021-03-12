/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author prudvi
 */
public class ArraysTest {
    
    public ArraysTest() {
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        double[] total = {1.5, 2.2,3.5,4.6};
        double expResult = 0.0;
        double result = Arrays.getLowest(total);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        double[] total = {1.5, 2.2,3.5,4.6};
        double expResult = 0.0;
        double result = Arrays.getHighest(total);
        assertEquals(expResult, result, 0.0);
      
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        double[] total = {1.5, 2.2,3.5,4.6};
        double expResult = 0.0;
        double result = Arrays.getTotal(total);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        double[] total = {1.5, 2.2,3.5,4.6};
        double expResult = 0.0;
        double result = Arrays.getAverage(total);
        assertEquals(expResult, result, 0.0);
        
    }

    
    
}
