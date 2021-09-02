package AritmetikOperatorler;

public class Odev3_Ternary {

    public static void main(String[] args) {


        int a =10, b =8, c=0;

        c = (a>b) ? (a-b) : (a+b);
        //eger a>b ise c=a-b eger a>b degil ise c=a+b

        System.out.println(a+"  buyuktur "+b+" yani (10>8) o yüzden c' degiskenine (a-b) yani "+(a-b)+"  atanir. c ="+c);
    }
}
