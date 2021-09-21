package veteriner_birligi;

public class Dog extends Animal {

    private int vaccineCount;
    private String type;
    private String genus;

    public Dog(String birthDay, boolean registered,int vaccineCount,String
                genus) {
        super(birthDay, registered);
        this.vaccineCount=vaccineCount;
        this.type="Dog (Köpek)";
        this.genus=genus;

    }

    public int getVaccineCount() {
        return vaccineCount;
    }

    public void setVaccineCount(int vaccineCount) {
        this.vaccineCount = vaccineCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    @Override
    void showInformation() {
        System.out.println(toString()+super.toString());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "vaccineCount=" + vaccineCount +
                ", type='" + type + '\'' +
                ", genus='" + genus + '\'' +
                '}';
    }
}
