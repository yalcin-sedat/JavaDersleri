package veteriner_birligi;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer  extends Person{
    private String adresse;
    private ArrayList<Animal> customersAnimals;



    public Customer(String name, int id,String adresse) {
        super(name, id);
        this.adresse=adresse;
        customersAnimals=new ArrayList<>();

    }

    public void addAnimal(Animal animal){
        customersAnimals.add(animal);
        System.out.println(animal+" "+getName()+ " musterisi sahiplendi");
    }


    public void showYouHaveAnimalCount(){
       for (Animal animal: customersAnimals){
           System.out.println(animal);
       }
    }
    @Override
    void whoAreYou() {
        System.out.println(this.toString() + "Ben bir Musteriyim... ");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "adresse='" + adresse + '\'' +
                '}';
    }
}
