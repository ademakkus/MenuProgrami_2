

package com.company;

import java.util.Scanner;
import java.lang.System;

public class Main {

    public static int main(String[]  args) {
        int kullaniciSecimi = -1;
        int sonuc = 0;
        while (kullaniciSecimi != 0) {

           if (kullaniciSecimi==0){
               break;
           }

        else{
            kullaniciSecimi = MenuGoster();

            Scanner sc = new Scanner(System.in);
            int sayi1, sayi2;
            System.out.print("Birinci sayıyı giriniz: ");
            sayi1 = sc.nextInt();

            System.out.print("İkinci sayıyı giriniz: ");
            sayi2 = sc.nextInt();
            switch (kullaniciSecimi) {

                case 1:
                    sonuc = Topla(sayi1, sayi2);
                    break;

                case 2:
                    sonuc = Cikarma(sayi1, sayi2);
                    break;

                case 3:
                    sonuc = Carpma(sayi1, sayi2);
                    break;

                case 4:
                    sonuc = Bolme(sayi1, sayi2);
                    break;

                case 5:
                    sonuc = Mod(sayi1, sayi2);
                    break;

                case 6:
                    sonuc = (int)UsAl(sayi1, sayi2);
                    break;

            }
            System.out.println("İşlemin sonucu : "+sonuc);
        }


    }

    /*private static int UsAl(int sayi1, int sayi2) {
        int islem = 0;
            islem=(int) (Math.pow(sayi1, sayi2));
            return  islem;
    }
*/
    private static int Mod(int sayi1, int sayi2) {
        return (sayi1 % sayi2);
    }

    private static int Bolme(int sayi1, int sayi2) {
        return (sayi1 / sayi2);
    }

    private static int Carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    private static int Cikarma(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    private static int Topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }


    public static int MenuGoster() {
        int secim;
        System.out.print("1- Toplama İşlemi " +
                "\n2- Çıkarma İşlemi" +
                "\n3- Çarpma İşlemi" +
                "\n4- Bölme İşlemi" +
                "\n5- Mod Alma İşlemi" +
                "\n6- Üs Alma İşlemi" +
                "  sayılarından birini seçiniz : ");
        Scanner sc = new Scanner(System.in);

        secim = sc.nextInt();
       // System.out.print(secim);
        return secim;
    }
}
