package AritmetikOperatorler;

import java.util.Scanner;

public class Odev2_ArtikYil {
    public static void main(String[] args) {

        int year;
        int count=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yil cinsinden bir Tarih girin \n Ornek: 1453");

        do {
            year=scanner.nextInt();

            if (year%400==0 || year%4==0 || year%100==0){
                System.out.println(year+" Yilli artik yildir");
            }else {
                System.out.println(year+" Yilli artik yil degildir.");
            }
            count++;
        }while (count>0);

    }
}
