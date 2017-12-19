package com.ifpb.stateless;

import com.ifpb.shared.Calculadora;
import com.ifpb.shared.ServiceLocator;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new ServiceLocator()
                .lookup("localhost", "3700", "java:global/core/CalculadoraPadrao");
        System.out.println(calculadora.somar(10, 90));
    }
}
