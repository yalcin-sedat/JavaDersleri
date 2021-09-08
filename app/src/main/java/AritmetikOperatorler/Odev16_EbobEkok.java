package AritmetikOperatorler;

import java.util.Scanner;

public class Odev16_EbobEkok {

    public static void main(String[] args) {

        int ebob=0;
        int ekok=0;
        int number1;
        int number2;
        int count=0;

        Scanner scanner=new Scanner(System.in);

        do {
            System.out.println("Birinci Sayiyi giriniz.");
            number1=scanner.nextInt();
            System.out.println("Ikinci Sayiyi giriniz.");
            number2=scanner.nextInt();

            if (number1==0 || number2==0){
                ebob=0;
                System.out.println(+number1+"  ve "+number2+"  Sayilarin eboblari = "+ebob);

            }else {
                for (int i=1;i<=number1;i++){


                    if (number2%i==0 && number1%i==0){
                        ebob=i;
                    }

                }
                ekok=(number1*number2)/ebob;

                System.out.println(+number1+"  ve "+number2+"  Sayilarin eboblari = "+ebob);
                System.out.println(+number1+"  ve "+number2+"  Sayilarin ekoklari = "+ekok);

            }

            count++;
        }while (count>0);





    }
}
