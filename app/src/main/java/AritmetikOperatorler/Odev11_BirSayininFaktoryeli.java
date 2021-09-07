package AritmetikOperatorler;

import java.util.Scanner;

public class Odev11_BirSayininFaktoryeli {

    public static void main(String[] args) {

        int count;
        int result=1;
        int s=1;
        //*******************************************
        int result2=1;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Faktöriyelini alacaginiz sayiyi giriniz..");
        count=scanner.nextInt();
        for (int i=1;i<=count;i++){
            result=result*i;
        }
        System.out.println("Girdiginiz sayinin faktöriyeli "+result);
        System.out.println("While ile  Faktöriyel Hesaplama");

        do {
            result2=result2*s;
            s++;
        }while (s<=count);
        System.out.println("Girdiginiz sayinin faktöriyeli "+result2);



    }

}
