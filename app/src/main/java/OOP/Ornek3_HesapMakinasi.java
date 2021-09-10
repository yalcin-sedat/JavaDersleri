package OOP;

public class Ornek3_HesapMakinasi {

    public static void main(String[] args) {

        System.out.println("Topla : "+Calculator.total(50,100));
        System.out.println("Cikar : "+Calculator.minus(100,50));
        System.out.println("Carp  : "+Calculator.multiplication(10,20));
        System.out.println("Böl   : "+Calculator.division(70,0));
    }

    static class Calculator{
        public static int total(int ...parameter){

            int sum=0;
            for (int i:parameter ){
                sum=sum+i;
            }
            return sum;
        }

        public static int minus(int...parameter){

            int minus = parameter[0];

            for (int i=1;i<parameter.length;i++ ){
                minus=minus- parameter[i];
            }
            return minus;
        }

        public static int multiplication(int ...parameter){

            int multi=1;
            for (int i:parameter ){
                multi=multi*i;
            }
            return multi;
        }

        public static int division(int ...parameter){

            //Eksiklikler var ,düzeltilecek
            int div = parameter[0];
            for (int i=1;i<parameter.length;i++){
                if (parameter[i]!=0) {

                    div=div/parameter[i];
                }else {
                    System.out.println("Parametrelerden biri 0 oldugundan TANIMSIZ !");


                }
            }
            return div;

        }
    }
}
