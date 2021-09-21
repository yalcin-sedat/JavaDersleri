package veteriner_birligi;

import java.util.ArrayList;

public class Veterinary extends Person {


    private String schoolLeaver;
    private int workTime;
    private ArrayList<Customer> customers;
    private int custumerCount;

    public Veterinary(String name, int id,String schoolLeaver,int workTime) {
        super(name, id);
        this.schoolLeaver=schoolLeaver;
        this.workTime=workTime;
        customers=new ArrayList<>();
        custumerCount=0;


    }
    public void addCustomers(Customer customer){
        customers.add(customer);
        custumerCount++;
    }
    public void customersList(){
        for (Customer customer: customers){
            customer.whoAreYou();
        }
    }

    @Override
    void whoAreYou() {
        System.out.println(toString()+" Ben bir Veterinerim..");
    }

    @Override
    public String toString() {
        return super.toString()+"Veterinary{" +
                "schoolLeaver='" + schoolLeaver + '\'' +
                ", workTime=" + workTime +
                '}';
    }
}
