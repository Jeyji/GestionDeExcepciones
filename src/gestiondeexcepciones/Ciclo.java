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
public class Ciclo {
    public double divisioncero(int denominador){
        double resultado = 0;
        try{
            resultado = 25/denominador;
        }
        catch(ArithmeticException excepción){
            System.out.println("Division por cero");
            excepción.printStackTrace();
        }
        return resultado;
    }
        public static void main(String[] args) {
            Ciclo j = new Ciclo();
            Scanner teclado = new Scanner(System.in);
            int denominador = 0;
            double resultado =0;
            for (int i = 0; i<3;i++)
                denominador = teclado.nextInt();
            System.out.println(resultado);
        }
}
