package AritmetikOperatorler;

public class Odev10_BirdenYüzeSayilarinToplami {

    public static void main(String[] args) {

        int count=100;
        int summ=0;
        for (int i=1;i<=count;i++){
            summ+=i;
        }
        System.out.println("1'den "+count+"a kadar olan sayilarin toplami ="+summ);

    }
}
