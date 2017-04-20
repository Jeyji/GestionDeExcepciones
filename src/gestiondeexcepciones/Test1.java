/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeexcepciones;

/**
 *
 * @author Estudiante
 */
public class Test1 {
    public Test1(){
    divideByzero();
    }
    int divideByzero(){
        return 25/0;
    }
    public static void main(String[] args) {
        new Test1();
    }
    
}
