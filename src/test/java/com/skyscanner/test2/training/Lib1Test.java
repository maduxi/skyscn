/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyscanner.test2.training;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author madhava
 */
public class Lib1Test {
    @BeforeClass
    public static void setUpClass() throws Exception {
        // Code executed before the first test method       
    }

    @Before
    public void setUp() throws Exception {
        // Code executed before each test    
    }
    
    @Test
    public void getName(){
        Lib1 lin = new Lib1();
        String result = lin.getName("pi");
        assertEquals(result, "pi");
    }
    
}
