package com.Pemlan;

import java.util.Locale;
import java.util.Scanner;

public class SuratKaisar {
    static Scanner in = new Scanner(System.in);
    static char[] abjad = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static char[] abjad1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static void main(String[] args) {
        KodeSurat();
    }

    static void KodeSurat(){
        String kalimat = in.nextLine();
        int geser = in.nextInt();
        String kode = "";

        for (int i = 0; i < kalimat.length(); i++){
            for (int j = 0; j < abjad.length; j++){
                String huruf = String.valueOf(kalimat.charAt(i));
                if (huruf.equals(String.valueOf(abjad[j]))){
                    int pergeseran = j+geser;
                    if (pergeseran > 25){
                        kode = kode + abjad[pergeseran-26];
                    }
                    else {kode = kode + abjad[pergeseran];}
                }else if (huruf.equals(String.valueOf(abjad1[j]))){
                    int pergeseran = j+geser;
                    if (pergeseran > 25){
                        kode = kode + abjad1[pergeseran-26];
                    }
                    else {kode = kode + abjad1[pergeseran];}
                }else if (huruf.isBlank()){
                    kode = kode + huruf;
                    break;
                }
                huruf = "";
            }
        }

        System.out.println(kode);
    }
}
