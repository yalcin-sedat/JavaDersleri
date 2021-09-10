package OOP;

import java.util.Arrays;

public class Ornek2_Ogrenci {

    public static void main(String[] args) {


        Student allStundent[]=new Student[100];

        for(int i=0;i<100;i++){
            int randomId=(int)(Math.random()*5000);
            int randomNote=(int)(Math.random()*100);

            Student newStundent=new Student(randomId,randomNote);
            allStundent[i]=newStundent;

        }


        studentSort(allStundent);
        for (int i=0; i<100 ; i++){
            allStundent[i].stundetInformation();
        }

    }

    private static void studentSort(Student[] allStundent) {

        for (int i=0;i<allStundent.length-1;i++){

            int lowCount=allStundent[i].getNote();
            int lowIndex=i;

            for (int j=i+1;j<allStundent.length;j++){
                if (lowCount>allStundent[j].getNote()){
                    lowCount=allStundent[j].getNote();
                    lowIndex=j;
                }
            }

            if (lowIndex!=i){
                allStundent[lowIndex]=allStundent[i];
                allStundent[i].setNote(lowCount);
            }
        }
    }


    public static class Student{

        private int id;
        private int note;

        public Student(int id, int note) {
            this.id = id;
            this.note = note;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getNote() {
            return note;
        }

        public void setNote(int note) {
            this.note = note;
        }

        public void stundetInformation(){
            System.out.println("Ogrenci ID = "+id+" Ögrenci Notu = "+note);
        }
    }
}
