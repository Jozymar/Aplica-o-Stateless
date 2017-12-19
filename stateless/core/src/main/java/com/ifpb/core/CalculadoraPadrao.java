package com.ifpb.core;

import com.ifpb.shared.Calculadora;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Remote(Calculadora.class)
public class CalculadoraPadrao implements Calculadora{

    @Override
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

}
