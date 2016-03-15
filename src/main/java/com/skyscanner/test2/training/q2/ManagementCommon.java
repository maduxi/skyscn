/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.skyscanner.test2.training.q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author madhava
 */
public class ManagementCommon {

    static void OutputCommonManager(int count, Scanner in) {
        String first="";
        String second="";
        Map<String, List<String>> managers = new HashMap<>();
        int i = 0;
        while (in.hasNext()) {
            String line = in.next();
            if (i == 0) {
                first = line;
            } else if (i == 1) {
                second = line;
            } else {
                String[] relation =line.split(" ");
                String manager = relation[0];
                String employee = relation[1];
                List<String> employees;
                if (!managers.containsKey(manager)) {
                    employees = new ArrayList<>();
                } else {
                    employees = managers.get(manager);
                }
                employees.add(employee);
                managers.put(manager, employees);
            }
            i++;
        }
        
        List<String> getFirst = getManChain(first,managers);
                
        List<String> getSecond = getManChain(second,managers);
        
        for(String man:getFirst){
            if(getSecond.contains(man)){
                System.out.println(man);
                return;
            }
        }

    }

    private static List<String> getManChain(String employee, Map<String, List<String>> managers) {
        List<String> manChain = new ArrayList<>();
        String manager = null;
        do {
            manager = getManager(employee, managers);
            if (manager != null) {
                manChain.add(manager);
                employee=manager; //Arggh forgot this on the test
            }
        } while (manager != null);
        return manChain;
    }

    private static String getManager(String employee, Map<String, List<String>> managers) {
        String manager = null;
        for (String man : managers.keySet()) {
            if (managers.get(man).contains(employee)) {
                manager = man;
            }
        }
        return manager;
    }

}
