package AritmetikOperatorler;

import java.util.Scanner;

public class Odev5_Piyango {


    public static void main(String[] args) {

        int guessCount;
        int  lotteryRandomCount= (int) (Math.random()*100);
        System.out.println("Rastgele üretilen iki basamakli sayi= "+lotteryRandomCount);

        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Iki basamakli bir pozitif  sayi Tahmin edin !");
            guessCount=scanner.nextInt();
            System.out.println("Tahmin ettigin Sayi = "+guessCount);
            if (guessCount<10)
                System.out.println("***HATTA *** \n POZITIF bir   sayi girin !");



        }while (guessCount<10);

        if (guessCount==lotteryRandomCount){
            System.out.println("***TEBRIKLER**\n 1000 Tl Kazandiniz..");
        }else {
            System.out.println("***TEKRAR DENEYINIZ**");

        }

    }

}
