package AritmetikOperatorler;

import java.util.Scanner;

public class Odev7_UcgenCesidi {
    public static void main(String[] args) {

        int edge1,edge2,edge3;
        int count=0;

        Scanner scanner=new Scanner(System.in);

       do {
           System.out.println("Ucgenin 1. ekranini giriniz...");
           edge1=scanner.nextInt();
           System.out.println("Ucgenin 2. ekranini giriniz...");
           edge2=scanner.nextInt();
           System.out.println("Ucgenin 3. ekranini giriniz...");
           edge3=scanner.nextInt();

           if (edge1<=0 || edge2<=0 || edge3<=0){
               System.out.println("Lutfen sifirdan büyük sayi giriniz : ");

           }else if (edge1==edge2 && edge1==edge3){
               System.out.println("Girdiginiz Kenarlar: \n 1.Kenar= "+edge1+"\n 2.Kenar = "+edge2+"\n 3.Kenar = "+edge3);
               System.out.println("Eskenar Ucgen");

           }else if (edge1==edge2 && edge1!=edge3){
               System.out.println("Girdiginiz Kenarlar: \n 1.Kenar= "+edge1+"\n 2.Kenar = "+edge2+"\n 3.Kenar = "+edge3);

               System.out.println("Ikizkenar Ucgen");

           }else if (edge1!=edge2 && edge2!=edge3){
               System.out.println("Girdiginiz Kenarlar: \n 1.Kenar= "+edge1+"\n 2.Kenar = "+edge2+"\n 3.Kenar = "+edge3);

               System.out.println("Cesitkenar Ucgen");
           }

           count++;

       }while (count>0);


    }
}
