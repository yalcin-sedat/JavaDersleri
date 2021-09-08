package AritmetikOperatorler;

import java.util.Scanner;

public class Odev17_Palindrome {

    public static void main(String[] args) {

        String text;
        String text2 ="";


        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir Text girin ");
        text=scanner.next();
        System.out.println("Girdiginiz Text :"+text);


        for(int i=text.length()-1; i>=0; i--){
            text2+=text.charAt(i);
        }

        System.out.println("girdiginiz textin tersi :" +text2);

        if (text.equals(text2)){
            System.out.println("Girdiginiz text PALINDROME bir kelimedir.");
        }else{
            System.out.println("Girdiginiz text PALINDROME bir kelime degildir.");

        }


    }

}
