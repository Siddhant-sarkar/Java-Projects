package com.SarkarSiddhant;



public class Main {


    public static void main(String[] args) {
        Bank bank =new Bank("SBI");
        bank.Add_Branch("PBB");
        bank.Add_Customer("PBB","SiddhantSarkar",500);
        bank.Add_Customer("PBB","SiddhantSarkar",500);

        bank.listCustomers("PBB",true);
    }
}
