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
public class latihan2 {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.print("berat maksimal(kg) : ");
        int berat = a.nextInt();
        int barang [] = new int [] {7, 5, 4, 3, 2};
        String nama [] = new String[]{"E", "B","A","D","C"};
        int total;
        
        for(int i=0;i<barang.length; i++){
            if(berat >= barang[i]){
                total = berat / barang[i];
                berat = berat % barang[i];
                System.out.println("benda " + nama[i]+" kg sebanyak "+total+" buah ");
                        
                        }
        }
    }
    
}
