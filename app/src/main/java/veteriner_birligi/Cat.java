package veteriner_birligi;

public class Cat extends Animal{

    private  String type;
    private  String genus;

    public Cat(String birthDay, boolean registered,String genus) {
        super(birthDay, registered);
        this.type="Cat (Kedi)";
        this.genus=genus;
    }

    @Override
    void showInformation() {

        System.out.println(toString()+"Kayitli mi =  "+isRegistered()+ "   Dogum Tarihi =  "  +getBirthDay());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", genus='" + genus + '\'' +
                '}';
    }
}
