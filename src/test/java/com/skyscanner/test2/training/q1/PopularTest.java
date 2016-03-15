/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyscanner.test2.training.q1;

import com.skyscanner.test2.training.q1.*;
import java.util.Scanner;
import org.junit.Test;

/**
 *
 * @author madhava
 */
public class PopularTest {
    @Test
    public void typical(){
        Popular pop = new Popular();
        String input = "bar sy lo mi lo ed";
        Scanner s = new Scanner(input);
        pop.OutputMostPopularDestination(6,s);
    }
}
