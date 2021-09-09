package AritmetikOperatorler;

import java.util.Scanner;

public class Odev4_VucutKitle {

    //Kullanıcıdan aldığınız değerlere göre vücut kitle endeksini hesaplayınız.
    //Vücut Kitle Endeksi = kilo(kg) / ((boy(cm)/100) karesi)
    public static void main(String[] args) {

        double lenght;
        double weight;
        double result;
        int count = 1;

        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("*******************************************)");
            System.out.println("Lütfen Boyunuzu cm cinsinden giriniz: ");
            lenght=scanner.nextDouble();
            System.out.println("Lütfen Kilonuzu giriniz: ");
            weight=scanner.nextDouble();

            if (lenght >50  && weight > 5){
                result=(int)(weight)/(Math.pow(lenght/100,2));

                System.out.println("*******************************************)");
                System.out.println("SONUC \nKilonz = "+weight+"\nBoyunuz = "+lenght);

                if (result<15){

                    System.out.println("Cok ciddi derecede dusuk kilolu.");

                }else if (15<result && result<=16){

                    System.out.println("Ciddi derecede dusuk kilolu.");

                }else if (16<result && result<=18){

                    System.out.println("Düsük Kilolu");

                }else if (18<result && result<=25){

                    System.out.println("Normal(saglikli kilo)");

                }else if (25<result && result<=30){

                    System.out.println("Fazla kilolu");

                }else if (30<result && result<=35){

                    System.out.println("1. Dereceden Obez (Hafif Obez)");

                }else if (35<result && result<=40){

                    System.out.println("2. Dereceden Obez (Ciddi Obez)");

                }else if (result>40){

                    System.out.println("3. Dereceden Obez (Cok Ciddi Obez)");

                }

            }else {
                System.out.println("Lütfen Boyunuzu en az 50 cm ve kilonuzu en az 10 kilo olarak giriniz:\n" +
                        "Tekrar Deneyin ");

            }

            count++;

        }while (count>0);

    }

}
