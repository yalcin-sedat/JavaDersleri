package OOP;

public class Ornek6_Polymorphism {

    public static void main(String[] args) {

        Animal animal1=new Animal(4);
        Dog dog1=new Dog("Golden", animal1.getFeetCount());
        Cat cat1=new Cat("Van Keidisi", animal1.getFeetCount());

        sayName(animal1);
        sayName(dog1);
        sayName(cat1);

    }

    // *******ÖNEMLI*******
    public static void sayName(Animal animal){

        animal.sayName();
    }


    /*

    //Asagidaki iki metot yerine yukaridaki method yeterli
    public static void sayName(Dog dog){
        System.out.println(" Comar ");
    }

    public static void sayName(Cat cat){
        System.out.println("Boncuk");
    }
     */
    static class Animal{
        private int feetCount;

        public Animal(int feetCount) {
            setFeetCount(4);
        }

        public int getFeetCount() {
            return feetCount;
        }

        public void setFeetCount(int feetCount) {
            this.feetCount = feetCount;
        }

        public void sayName(){
            System.out.println("*****************");
            System.out.println("Ben bir "+feetCount+"  ayakli hayvan(Animal) nesnesiyim" );
        }
    }//Animal

    static class Dog extends Animal{
        private String genus;

        public Dog(String genus,int feetCount) {
            super(feetCount);
            setGenus(genus);
        }


        public String getGenus() {
            return genus;
        }

        public void setGenus(String genus) {
            this.genus = genus;
        }

        @Override
        public void sayName(){
            System.out.println("**********************");
            System.out.println("Benim adim Comar ");
            System.out.println("Ben  "+genus+" tür  ve "+getFeetCount()+" ayakli   bir  Köpek(Dog) nesnesiyim" );

        }


    }//Dog Class

    static class Cat extends Animal{

        private String type;

        public Cat( String type,int feetCount) {
            super(feetCount);
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }


        @Override
        public void sayName() {
            System.out.println("**********************");
            System.out.println("Benim adim Boncuk ");
            System.out.println("Ben  "+type+" tür  "+getFeetCount()+" ayakli   bir  Köpek(Dog) nesnesiyim" );

        }
    }//Cat Class
}
