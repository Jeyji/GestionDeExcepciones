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
public class Test2 {
    public Test2(){
        dividebyzero();
    }
    double dividebyzero(){
        double result=0;
        try{
            result =25/0;
        }
        catch(ArithmeticException exception){
            System.out.println("Erro aritmetico, no se puede dividir por cero");
        }
        return result;
    }
    public static void main(String[] args) {
        new Test2();
    }
}
