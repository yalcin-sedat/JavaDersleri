package AritmetikOperatorler;

import java.util.Scanner;

public class Odev18_AsalSayilar {

    public static void main(String[] args) {

        int count;
        boolean primeNumber;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hangi sayiya  kadar olan sayilarin asal sayilarin bulunmasini istiyorsun ?");
        count=scanner.nextInt();

        for (int i=2;i<count;i++){
            primeNumber=true;
            for(int j=2;j<i;j++){
               if (i%j==0){
                   primeNumber=false;

               }
            }
            if (primeNumber)
                System.out.println("Asal Sayilar ="+i);
        }
    }
}
