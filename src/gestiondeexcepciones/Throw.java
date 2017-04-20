/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeexcepciones;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Throw {
    public double divisionecero(int denominador) throws JhojanException{
        double resultado =0;
        if (denominador==0) throw new JhojanException();
        resultado =25/denominador;
        return resultado;
    }
    public static void main(String[] args) {
        Throw j= new Throw();
        Scanner teclado = new Scanner(System.in);
        int denominador = 0;
        double resultado = 0;
        for (int i =0; i<3 ;i++){
        denominador = teclado.nextInt();
        try{
            resultado= j.divisionecero(denominador);
            System.out.println(resultado);
        }
        catch (ArithmeticException k){
            k.printStackTrace();
        }
        catch (JhojanException k){
            k.printStackTrace();
        }
    }
    }
}
