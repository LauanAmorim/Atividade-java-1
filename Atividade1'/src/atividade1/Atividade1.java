/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade1;

import java.util.Scanner;


public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Digite um número inteiro positivo: ");
       Scanner sc = new Scanner(System.in);
       Double n = sc.nextDouble();
       int i = 1;
       double result = 0;
       
       while(i<=n){   
        result +=i;  
        i++;
       }
        System.out.println(result);     
    }
   }
    
