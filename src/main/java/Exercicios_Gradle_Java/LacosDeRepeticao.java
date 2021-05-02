/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios_Gradle_Java;

/**
 *
 * @author lucas
 */
public class LacosDeRepeticao {

    public static void main(String[] args) {
                
        int numero = 5;
        int mult;
        
        System.out.println("TABUADA DE "+ numero);
        
        for(int i = 1; i <= 10; i++){
            mult = i * numero;
            System.out.println(numero + " * " + i + " = " + mult);
            
        }
    }

}
