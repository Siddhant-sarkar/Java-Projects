package com.SarkarSiddhant;

import java.util.ArrayList;

public class Bank {
    private String Bankname;
    private ArrayList<Branch>Bank_ArrayList;

    public Bank(String name) {
        this.Bankname = name;
        this.Bank_ArrayList=new ArrayList<Branch>();
    }

  public boolean Add_Branch(String Name){
       if (if_Exists_Branch(Name)==null){
           this.Bank_ArrayList.add(new Branch(Name));
           return true;
       }
       return false;
  }

  public boolean Add_Customer(String Branch_Name,String Customer_Name,double Init_Amount){
        if(if_Exists_Branch(Branch_Name)!=null){
            Branch Existing =if_Exists_Branch(Branch_Name);
            return Existing.Add_Customer(Customer_Name,Init_Amount);
        }
        return false;
  }

  public boolean Add_Customer_Transaction(String Branch_Name,String Customer_Name,double Init_Amount){
      if(if_Exists_Branch(Branch_Name)!=null){
          Branch Existing =if_Exists_Branch(Branch_Name);
          return Existing.Do_Transaction(Customer_Name,Init_Amount);
      }
      return false;
  }
    /*****
     *This method give back the object
     * of Branch Class with the same name
     * As Present in the Bank_Arraylist
     * returns null if not found
     */
    public Branch if_Exists_Branch(String Name){
       for (int i = 0; i < Bank_ArrayList.size(); i++) {
           Branch temp=Bank_ArrayList.get(i);
           String tempNAMe=temp.getName();
           if (temp.getName().equals(Name)){
               return Bank_ArrayList.get(i);
           }
       }
       return null;

        // for(int i=0; i<this.Bank_ArrayList.size(); i++) {
        //     Branch checkedBranch = this.Bank_ArrayList.get(i);
        //     if(checkedBranch.getName().equals(Name)) {
        //         return checkedBranch;
        //     }
        // }
        // return null;
    }



    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = if_Exists_Branch(branchName);
        if(branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customers> branchCustomers = branch.getCustomer_ArrayList();
            for(int i=0; i<branchCustomers.size(); i++) {
                Customers branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                if(showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTrasactions();
                    for(int j=0; j<transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }
}
