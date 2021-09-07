package AritmetikOperatorler;

import java.util.Scanner;

public class Odev12_HarfliNotHesabi {

    public static void main(String[] args) {

        String noteAA="AA";//90-100
        String noteBA="BA";//70-90
        String noteBB="BB";//50-70
        String noteFF="FF";//0-50
        int passNote=0;
        int count=0;
        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Vize notunuzu giriniz..");
            int ersteNote=scanner.nextInt();
            System.out.println("Final notunuzu giriniz..");
            int finalNote=scanner.nextInt();

            if (finalNote<0 || finalNote>100 ){
                System.out.println("Gecersiz not sistemi.");
            }else {
                passNote=(ersteNote*40)/100+(finalNote*60)/100;

                if (passNote<=50){
                    System.out.println("Sinav Notunuz = "+passNote+"  Sinav harf notunuz = " +noteFF);
                }else if (passNote>=50 && passNote<70){
                    System.out.println("Sinav notunuz = "+passNote+"  Sinav harf notunuz = " +noteBB);

                }else if (passNote>=70 && passNote<90){
                    System.out.println("Sinav notunuz = "+passNote+"  Sinav harf notunuz  = " +noteBA);

                }else if (passNote>90 && passNote<=100){
                    System.out.println("Sinav notunuz = "+passNote+"  Sinav harf notunuz  = " +noteAA);
                }

            }

            count++;
        }while (count>0);




    }
}
