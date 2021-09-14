package OOP;

import androidx.annotation.NonNull;

public class Ornek5_AlanCevreHesaplama {

    public static void main(String[] args) {

        Rectangle rectangle1=new Rectangle(10,40);
        Rectangle rectangle2=new Rectangle(-3,4);
        rectangle1.circlesCalculater();
        rectangle1.fieldCalculater();
        rectangle2.fieldCalculater();
        rectangle2.circlesCalculater();

        GeometryShapes g1=new GeometryShapes(4,5);
        System.out.println("Geometri Sekiller = "+g1);//to string overide ediliyor

        Rectangle r1=new Rectangle(5,9);
        System.out.println("Diktortgen = "+r1);

        System.out.println("********** Kare **********");



        Square s1=new Square(5);
        s1.circlesCalculater();
        s1.fieldCalculater();
        System.out.println("To String overide calisti = "+s1);
    }

    static class GeometryShapes{

        private int width;
        private int lenght;

        public GeometryShapes(int width, int lenght) {
                this.width = width;
                this.lenght = lenght;
                System.out.println("Geometri sekiller  Olusturuluyor");
        }

        public GeometryShapes(int width) {
            this.width = width;
            System.out.println("Geometri sekiller  Olusturuluyor");

        }
        public GeometryShapes(){
            System.out.println("Geometri sekiller  Olusturuluyor");

        }


        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getLenght() {
            return lenght;
        }

        public void setLenght(int lenght) {
                this.lenght = lenght;

        }

        public void fieldCalculater(){
            if (lenght<0 || width<0){
                System.out.println("Alan hesaplama icin Gecersiz Degerler ");
            } else {

                System.out.println("Alan = " + getLenght() * getWidth());
            }
        }

        public void circlesCalculater(){

            if (lenght<0 || width<0){
                System.out.println("Cevre Hesaplama Gecersiz Degerler ");
            } else {
                System.out.println("Cevre = " + (getLenght() + getWidth()) * 2);
            }
        }

        @Override
        public String toString() {
            return "GeometryShapes{" +
                    "width=" + width +
                    ", lenght=" + lenght +
                    '}';
        }
    }//Geometry Class


    static class  Rectangle extends GeometryShapes{

        public Rectangle(int width, int lenght) {
            super(width, lenght);
            System.out.println("Diktörtgen  Olusturuluyor");


        }

        public Rectangle(int width) {
            super(width);
            System.out.println("Diktörtgen  Olusturuluyor");

        }

        public Rectangle(){
            System.out.println("Diktörtgen  Olusturuluyor");

        }
        @Override
        public String toString() {
            return "Diktörtgen toString Calisti \n{" +
                    "  width ="  + getWidth()  +
                    ", lenghtmaps=" + getLenght() +
                    ", filed =" +getLenght()*getWidth()+
                    ",circle =" +(getWidth()+getLenght())*2+
                    '}';
        }
    }//Rectangle Class

    static class Square extends Rectangle{

        public Square(int width) {
            super(width);
            setLenght(width);
            System.out.println("Kare Olusturuluyor");
        }

        public Square(){
            System.out.println("Kare Olusturuluyor");

        }
        @Override
        public String toString() {
            return "Kare toString Calisti \n{" +
                    "  width ="  + getWidth()  +
                    ", widt  =" +  getWidth() +
                    ", filed =" +getWidth()*getWidth()+
                    ",circle =" +(getWidth()+getWidth())*2+
                    '}';
        }
    }



}
