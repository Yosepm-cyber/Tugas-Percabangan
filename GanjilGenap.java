package com.company;
import java.util.Scanner;
class TestGanjilGenap{
    public static void main(String args[]){
        int angka;
        System.out.println("Masukkan sebuah angka: ");
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        
        if ( angka % 2 == 0 )
            System.out.println(angka + " adalah bilangan genap");
        else
            System.out.println(angka + " adalah bilangan ganjil");
    }
}