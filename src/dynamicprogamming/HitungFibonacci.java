/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogamming;

import java.util.Scanner;

/**
 *
 * @author Client
 */
public class HitungFibonacci {
    
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 3, 3, 5, 8, 13, 21,");
    }
    private static int tampilInput(){
        Scanner sanner = new Scanner(System.in);
        
         System.out.print("Bilangan ke-: ");
         int n = scanner.nextInt();
         
         return n;
    }
   public static void main(String[] args) {
        String identitas = "Mohammad Baliyun Taja / X RPL 5 / no ";
        tampilJudul(identitas);
        int n = tampilInput();
}
}