package veteriner_birligi;

public class Main {

    public static void main(String[] args) {

        createFirstObject();
    }

    private static void createFirstObject(){
        System.out.println("*******Cat*********");
        Cat cat =new Cat(" 02:04:2004   ,",true,"   Van Kedisi");
        Cat cat2=new Cat(" 02:03:2000   ,",false,"  Mus  Kedisi");
        Cat cat3=new Cat(" 02:03:2000   ,",true,"   Alman  Kedisi");

        cat.showInformation();
        cat2.showInformation();
        cat3.showInformation();

        System.out.println(cat);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println("*******Dog*********");
        Dog dog =new Dog("04:05:2000",true,2,"Comar ");
        Dog dog2 =new Dog("04:05:2090",false,2,"Comar 2 ");
        Dog dog3 =new Dog("04:05:1999",true,2,"Comar 3");

        dog.showInformation();
        dog2.showInformation();
        dog3.showInformation();

        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(dog3);

        System.out.println("*******Customer*********");
        Customer customer =new Customer("Omer",12345,"Bismarkstrße 49");
        Customer customer2=new Customer("Yavuz",555555,"Bismarkstrße 34");
        Customer customer3=new Customer("Sedat",122222222,"Bismarkstrße 1453");
        System.out.println(customer);
        System.out.println(customer2);
        System.out.println(customer3);

        customer.whoAreYou();
        customer2.whoAreYou();
        customer3.whoAreYou();

        customer.addAnimal(cat);
        customer2.addAnimal(dog);
        customer3.addAnimal(cat);


        System.out.println("*******Veterinary*********");
        Veterinary veterinary=new Veterinary("Numan",2345,"Ludwigshafen",4);
        Veterinary veterinary2=new Veterinary("Hasan",33333,"Manheim",4);
        Veterinary veterinary3=new Veterinary("Ali",44444,"Mus",4);

        veterinary.addCustomers(customer);
        veterinary2.addCustomers(customer2);
        veterinary3.addCustomers(customer3);

        veterinary.customersList();
        veterinary2.customersList();
        veterinary3.customersList();

        System.out.println(veterinary);
        System.out.println(veterinary2);
        System.out.println(veterinary3);

        veterinary.whoAreYou();
        veterinary2.whoAreYou();
        veterinary3.whoAreYou();


        System.out.println("********Kontrol Paneli**********");
        ControlPanel<Animal> animalControlPanel=new ControlPanel();
        animalControlPanel.showInformation(cat);
        animalControlPanel.showInformation(dog2);

        ControlPanel<Customer> customerControlPanel=new ControlPanel<>();
        customerControlPanel.showInformation(customer);

        customerControlPanel.showYouHaveAnimal(customer3);


    }

}
