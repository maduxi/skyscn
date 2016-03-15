/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyscanner.test2.training.q1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author madhava
 */
public class Popular {

    static void OutputMostPopularDestination(int count, Scanner in) {
        Map<String, Long> destinations = new HashMap<>();
        String destination = "";
        for (int i = 0; i < count; i++) {
            destination = in.next();
            if (destinations.containsKey(destination)) {
                destinations.put(destination, destinations.get(destination) + 1);
            }else{
                destinations.put(destination, 1l);
            }
        }
        Long max = 0l;
        for (String key : destinations.keySet()) {
            if (destinations.get(key) > max) {
                destination = key;
                max = destinations.get(key);
            }
        }
        System.out.println(destination);
    }
}
