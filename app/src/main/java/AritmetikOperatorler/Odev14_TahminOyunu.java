package AritmetikOperatorler;

import java.util.Scanner;

public class Odev14_TahminOyunu {

    public static void main(String[] args) {

        int randomNumber;
        int guessNumber;
        int count=0;

        randomNumber=(int)(Math.random()*100);
        System.out.println("Rastgele üretilen Sayi = "+randomNumber);
        Scanner scanner=new Scanner(System.in);

        do {

            System.out.println("****************************");
            System.out.println("Sayiyi tahmin edinin.");
            guessNumber=scanner.nextInt();

            if (guessNumber<0 || guessNumber >100 ){
                System.out.println("Lutfen 0 ile 100 arasinda bir sayi giriniz.");
            }else {
                if (randomNumber==guessNumber){
                    System.out.println("*****TEBRIKLER***** \n Dogru Tahmin Ettiniz ");
                }else if (randomNumber>guessNumber){
                    System.out.println("Maalesef bilemediniz...Daha büyük sayi tahmin edin. ");

                }else if (randomNumber<guessNumber){
                    System.out.println("Maalesef bilemediniz...Daha kucuk sayi tahmin edin. ");

                }else {
                    System.out.println("Lutfen bir sayi tahmin edin. ");
                }
            }


            count++;
        }while (count>0);



    }
}
