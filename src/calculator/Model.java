/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author rock and roll
 */
public class Model {
private int a;
private int b;

    public Model() {
    }


    public Model(int a, int b) {
        this.a = a;
        this.b = b;
    }
    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    
}
