package OOP.television_simulation;

import java.util.Scanner;

public class TvSimulation {


    static Scanner inputText=new Scanner(System.in);
    static Television tv;

    public static void main(String[] args) {
        boolean exit=false;

        while (!exit){
            System.out.println("Seciminiz : (Menüyü görmek icin 8 i Tuslayiniz)");

            int choice=inputText.nextInt();

            switch (choice){
                case 1:
                    createTvChannel();
                case 2:
                    openTv();
                    break;
                case 3:
                    plusVoice();
                    break;
                case 4:
                    minusVoice();
                    break;

                case 5:
                    changeTvChannel();
                    break;

                case 6:
                    showChannelInfo();
                    break;
                case 7:
                    closeTv();
                    break;
                case 8:
                    showMenu();
                    break;
                case 0:
                    System.out.println("Sistemden cikiliyor...");
                    exit=true;
                default:
                    System.out.println("0 ile 8 arasinda bir secim yapiniz ");
                    break;
            }

        }
    }

    private static void showChannelInfo() {
        if (tv!=null){

           tv.showActiviteChannel();
        }else {
            System.out.println("Önce Tv yi kurun ve kanallari olusturun");
        }
    }

    private static void changeTvChannel() {
        if (tv!=null){
            System.out.println("Istediginiz kanal numarasini giriniz \n");
            int tvChannel=inputText.nextInt();
            tv.changeTvChannel(tvChannel);
        }else {
            System.out.println("Önce Tv yi kurun ve kanallari olusturun");
        }
    }


    private static void plusVoice() {

        if (tv!=null){
            tv.voicePlus();
        }else {
            System.out.println("Once Tv yi kurun ve kanallari olusturun ");

        }
    }

    private static void minusVoice() {

        if (tv!=null){
            tv.voiceMinus();
        }else {
            System.out.println("Once Tv yi kurun ve kanallari olusturun ");

        }
    }
    private static void closeTv() {
        if (tv !=null){
            tv.tvClose();
        }else {
            System.out.println("Once Tv yi kurun ve kanallari olusturun ");
        }
    }

    private static void openTv() {

        if (tv !=null){
            tv.tvOpen();
        }else {
            System.out.println("Once Tv yi kurun ve kanallari olusturun ");
        }
    }

    private static void createTvChannel() {
        if (tv==null){
            inputText.nextLine();//
            System.out.println("Televizyonun markasini giriniz...");
            String marka=inputText.nextLine();
            System.out.println("Televizyonun boyutu giriniz...");
            int size=inputText.nextInt();
            if (size<10 || size>500){
                System.out.println("Gecersiz ekran boyutu");

            }else {
                tv=new Television(marka,size);
            }
            System.out.println(tv);

        }else {
            System.out.println(tv);
        }
    }

    private static void showMenu() {
        System.out.println("**********MENU***********");
        System.out.println(
                "0--Cikis \n"+
                "1--Televizyonu Kur \n"+
                "2--Televizyonu Ac \n"+
                "3--Sesini Ac \n"+
                "4--Sesi Kapat \n"+
                "5--Kanal Degistir \n"+
                "6--Kanal Bilgisini Göster \n"+
                "7--Televizyonu Kapat \n"+
                "8--Menuyu Göster \n");
    }
}
