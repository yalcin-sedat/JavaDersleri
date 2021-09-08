package AritmetikOperatorler;

import java.util.Scanner;

public class Odev15_CarpmaIslemi {

    public static void main(String[] args) {

        int count=0;
        int result=1;


        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayi girin...");
        do {

            int number=scanner.nextInt();
            if (number!=0)
            result*=number;

            if (number==0){
                System.out.println("Girdiginz Sayilarin Carpimlari ="+result);
                break;
            }
            count++;

        }while (count>0);



    }
}
