package AritmetikOperatorler;

import java.util.Scanner;

public class Odev6_SayilarinOrtalamasi {

    public static void main(String[] args) {

        int langCount;
        int summ = 0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Gireceginiz Toplam sayi sayisini giriniz...");
        langCount=scanner.nextInt();

        for (int i=0;i<langCount;i++){
            int [] count = new int[langCount];
            System.out.println(+(i+1)+".  Sayiyi giriniz..");
            count[i]=scanner.nextInt();

            summ+=count[i];

        }

        System.out.println("Girdiginiz toplam sayi sayisi   =  "+langCount);
        System.out.println("Girdiginiz sayilarin Toplami    =  "+summ);
        System.out.println("Girdiginiz sayilarin ortalamasi =  "+summ/langCount);

    }
}
