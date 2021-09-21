package veteriner_birligi;

abstract public class Animal {
    private String birthDay;
    private  boolean registered;

    public Animal(String birthDay, boolean registered) {
        this.birthDay = birthDay;
        this.registered = registered;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    abstract void showInformation();

    @Override
    public String toString() {
        return "Animal{" +
                "birthDay='" + birthDay + '\'' +
                ", registered=" + registered +
                '}';
    }
}
