package veteriner_birligi;

public class ControlPanel<T> {

    public void showInformation(T object){

        System.out.println(object);
    }
    public <T extends  Customer> void showYouHaveAnimal(T customer){
        customer.showYouHaveAnimalCount();

    }
}
