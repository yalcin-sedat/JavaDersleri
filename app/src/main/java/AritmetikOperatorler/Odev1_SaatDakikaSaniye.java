package AritmetikOperatorler;

public class Odev1_SaatDakikaSaniye {
    public static void main(String[] args) {

        int veriable=900001;

        int minute;
        int second;
        int hour;//bir saate 60 dk=3600 sn var

        hour=veriable/3600;
        second=veriable-hour*3600;

        minute=second/60;

        second=veriable%60;

        System.out.println(veriable+" Sayisi = "+hour+" Saat "+minute+" Dakika "+second+" Saniye ");

    }
}
