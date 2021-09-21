package OOP.television_simulation;

import java.util.ArrayList;

public class Television {

    private String marka;
    private int size;
    private ArrayList<TvChannels> channels;
    private boolean open;
    private int voice;
    private int activieChannel;


    public Television(String marka, int size) {
        this.marka = marka;
        this.size = size;
        channels=new ArrayList<>();
        voice=10;
        activieChannel=1;
        createTvChannels();
        this.open=false;
    }

    public void voicePlus(){
        if (voice<=20 && open == true){
            voice++;
            System.out.println("Ses seviyesi :" +voice);
        }else {
            System.out.println("Ses maximum... ya da Tv kapali ");
        }
    }

    public void voiceMinus(){
        if (voice>0 && open==true){
            voice--;
            System.out.println("Ses seviyesi :" +voice);

        }else {
            System.out.println("Ses minimum.. ");
        }
    }
    public void tvOpen(){
        if (open==false){
            open=true;

            System.out.println("Tv Acildi");
        }else {
            System.out.println("Tv zaten acik ");
        }
    }

    public void tvClose(){
        if (open==true){
            open=false;

            System.out.println("Tv Kapandi");
        }else {
            System.out.println("Tv zaten Kapali ");
        }
    }

    public void showActiviteChannel(){
        if (open)
        System.out.println("Aktif kanal : "+channels.get(activieChannel-1).showChannelInfo());
        else System.out.println("Once Tv yi acin");
    }
    private void createTvChannels() {
        NewsTvChannel CNN =new NewsTvChannel("CNN",1,"Genel Haber");
        channels.add(CNN);

        NewsTvChannel beinSport =new NewsTvChannel("Bein Sport",2,"Spor Haber");
        channels.add(beinSport);

        MusicChannel dreamTurk=new MusicChannel("DreamTurk",3,"Rock");
        channels.add(dreamTurk);

        MusicChannel numberOne=new MusicChannel("Number One ",4,"Cazz");
        channels.add(numberOne);



    }
    public   void changeTvChannel(int tvChannel) {
        if (open){
            if (tvChannel!=activieChannel){

                if (tvChannel<=channels.size() && tvChannel >=0){

                    activieChannel=tvChannel;
                    System.out.println("Kanal :"+tvChannel +"Bilgi : "+channels.get(activieChannel-1).showChannelInfo());
                }else {
                    System.out.println("Gecerli bir kanal numarasini giriniz");
                }
            }else {
                System.out.println("Zaten "+activieChannel+ ". kanladasiniz. ");
            }
        }else {
            System.out.println("Önce Tv yi acin");
        }
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Television{" +
                "marka='" + marka + '\'' +
                ", size='" + size + '\'' +
                ", Televizyon oluturldu.."+
                '}';
    }
}
