package org.example;

import org.example.parametertsUtility.ClassEntityManager;
import org.example.parametertsUtility.ClassEntityService;

public class Main {
    public static void main(String[] args) {
        var cs = new ClassEntityManager();
        cs.setA(50);
        cs.setB(40);
        var sv = new ClassEntityService();
        System.out.println("a somma equivale" + sv.somma(cs));
    }
}