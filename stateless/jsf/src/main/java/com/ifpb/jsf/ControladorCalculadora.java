package com.ifpb.jsf;

import com.ifpb.shared.Calculadora;
import com.ifpb.shared.ServiceLocator;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ControladorCalculadora {
    
    private Calculadora calculadora;
    
    @PostConstruct
    public void init(){
        calculadora = new ServiceLocator().lookup("host-core", "3700", "java:global/core/CalculadoraPadrao");
    }
    
    private int n1;
    private int n2;
    private int soma;
    
    public String somar(){
        this.soma = calculadora.somar(n1, n2);
        return null;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

}