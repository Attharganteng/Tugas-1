package com.Pemlan;

import java.util.Scanner;

public class Selde {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Selde();
    }

    public static void Selde(){
        String bilangan = input.nextLine();
        String balik  = "";

        for (int i = bilangan.length()-1; i >= 0; i--){
            balik = balik + bilangan.charAt(i);
        }

        if (bilangan.equals(balik)){
            System.out.println(bilangan + " adalah selde.");
        }
        else {System.out.println(bilangan + " bukan selde.");}
    }
}
