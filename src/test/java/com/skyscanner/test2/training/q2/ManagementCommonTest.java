/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyscanner.test2.training.q2;

import java.util.Scanner;
import org.junit.Test;

/**
 *
 * @author madhava
 */
public class ManagementCommonTest {
    @Test
    public void typical(){
        ManagementCommon pop = new ManagementCommon();
        String input = "Hilary\n"
                + "James\n"
                + "Sarah Fred\n"
                + "Sarah Paul\n"
                + "Fred Hilary\n"
                + "Fred Jenny\n"
                + "Jenny James\n";
        Scanner s = new Scanner(input).useDelimiter("\n");
        pop.OutputCommonManager(6,s);
    }
}
