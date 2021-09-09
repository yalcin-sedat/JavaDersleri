package OOP;

public class Ornek1_DaireCember {

    public static void main(String[] args) {

      Circle circle1=new Circle(4);
        System.out.printf("Cember1 in  cevresi = %.2f  \n",circle1.CircleCalculater());
        System.out.printf("Daire1 in  alani    =  %.2f "  ,circle1.FieldCalculater());

    }


    public static class Circle{

        final static  double PI=Math.PI;

        private int  radius;
        private double circle;
        private double field;

        public Circle(int r){
            this.radius=r;
        }

        public  double CircleCalculater(){

           return circle=2*PI*radius;

        }
        public  double FieldCalculater(){

          // return field=PI*radius*radius;
           return field=PI*Math.pow(radius,2);


        }

    }
}
