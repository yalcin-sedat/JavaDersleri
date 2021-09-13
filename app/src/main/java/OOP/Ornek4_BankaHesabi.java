package OOP;

import java.util.Scanner;

public class Ornek4_BankaHesabi {
    public static void main(String[] args) {


        BankAccount ömer =new BankAccount("Ömer ",0,1453);
        BankAccount numan=new BankAccount("Numan",0,1453);
        BankAccount sedat=new BankAccount("Sedat",0,1453);
        BankAccount sefa =new BankAccount("Sefa", 400,1453);

        ömer.depositMoney(500);
        ömer.withdrawMoney(500);
        ömer.accountSummary();

        numan.depositMoney(500);
        numan.withdrawMoney(300);
        numan.accountSummary();

        sedat.depositMoney(1000);
        sedat.withdrawMoney(500);
        sedat.accountSummary();

        sefa.withdrawMoney(300);
        sefa.accountSummary();
        BankAccount.showSummary();



    }

    static class BankAccount{
        private String name;//Kisi ismi
        private int personBalance;//Kisi Bakiyesi
        private int accountNo;//Kisi Hesap no

        private static int allMoney;//Tüm para
        private static int withdrawMoneyCount;//Para cekme sayisi
        private static int depositMoneyCount;//para yatirma sayisi
        private static int accountBankCount;//Toplam acilan Banka hesap saysi


        public BankAccount(String name,int personBalance ,int accountNo) {

                this.name = name;
                this.personBalance=personBalance;
                this.accountNo = accountNo;

                allMoney+=personBalance;
                accountBankCount++;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPersonBalance() {
            return personBalance;
        }

        public void setPersonBalance(int personBalance) {
            this.personBalance = personBalance;
        }

        public int getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(int accountNo) {
            this.accountNo = accountNo;
        }

        //Para Yatirma
        public void depositMoney(int depositMoney){

            if (depositMoney>0){
                System.out.println("***************************************************");
                this.personBalance +=depositMoney;
                allMoney+=depositMoney;
                depositMoneyCount++;
                System.out.println(name+"  Kisisi "+depositMoney+" Tl  para yatirdi.");
            }else {
                System.out.println(" Gecersiz miktar !");
            }

        }
        //Para Cekme
        public void withdrawMoney(int withdrawMoney){
            this.personBalance -=withdrawMoney;
            if (personBalance >=0 && withdrawMoney>0){
                System.out.println("***************************************************");
                allMoney= allMoney-withdrawMoney;
                withdrawMoneyCount++;
                System.out.println(name+"  Kisisi "+withdrawMoney+" Tl  para cekti.");
            }else {
                System.out.println("  Yetersiz Bakiye ! ");
            }

        }

        public static void showSummary(){

            System.out.println("***************************************************");
            System.out.println("Banka hesap sayisi : "+accountBankCount);
            System.out.println("Bankadaki toplam para  : "+allMoney);
            System.out.println("Bankadaki toplam yapilan para cekme  sayisi      : "+withdrawMoneyCount);
            System.out.println("Bankadaki toplam yapilan para yatirma sayisi     : "+depositMoneyCount);
        }

        public  void accountSummary(){
            System.out.println(name+"kisisinin hesap Özeti \n Banka hesap No = "+accountNo+" \n Hesap bakiyesi = "+personBalance);

        }


    }
}
