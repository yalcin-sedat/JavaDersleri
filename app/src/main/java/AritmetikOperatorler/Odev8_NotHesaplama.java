package AritmetikOperatorler;

import android.view.animation.ScaleAnimation;

import java.util.Scanner;

public class Odev8_NotHesaplama {

    public static void main(String[] args) {

        int ersteNote;
        int finalNote;
        int passNote;
        int count=0;

        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("********NOT HESAPLAMA********");
            System.out.println("Lutfen,Vize Sinav notunuzu giriniz...");
            ersteNote=scanner.nextInt();
            System.out.println("Lutfen,Final Sinav notunuzu giriniz...");
            finalNote=scanner.nextInt();

            passNote=(ersteNote*40)/100+(finalNote*60)/100;

            if (passNote>=50){
                System.out.println("Tebrikler Dersi Gectiniz. \nNotunuz:  "+passNote);
            }else {
                System.out.println("Maalesef  Dersi Gecemediniz. \n Notunuz:  "+passNote);
            }
            System.out.println("********NOT HESAPLAMA********");
            count++;
        }while (count>0);



    }
}
