package AritmetikOperatorler;

public class Odev9_IsimYazdirma {

    public static void main(String[] args) {

        //gelistirilecek
        String name ="SEDAT";
        int count=5;
        for (int i=0;i<1;i++){
            System.out.println(name);
            for (int j=0;j<count;j++){
                System.out.println(name.substring(j));
            }
        }
    }
}
