package com.SarkarSiddhant;

import java.util.ArrayList;


public class Branch {
  

    private String BranchName;
    private ArrayList<Customers>Customer_ArrayList;

    public Branch(String Name){
        this.BranchName=Name;
        this.Customer_ArrayList=new ArrayList<>();

    }
    public String getName(){
       return  this.BranchName;
    }

    public ArrayList<Customers> getCustomer_ArrayList() {
        return Customer_ArrayList;
    }

    /****
     * This method adds an new customer to the
     * Arraylist with initial ammount
     */
    public boolean Add_Customer(String customer_name,double Initial_Amount){
        if (if_Exists_Customers(customer_name)==null){
            this.Customer_ArrayList.add(new Customers(customer_name,Initial_Amount));
            return true;
        }
        System.out.println("Customer already Exists");
        return false;
    }

    /****
     *This uses String to Identify if Customer
     * Already present
     * returns the object if present
     * return null if not present
     */
    public Customers if_Exists_Customers(String name){
        for (int i = 0; i < Customer_ArrayList.size(); i++) {
            if (Customer_ArrayList.get(i).getName().equals(name)){
                return Customer_ArrayList.get(i);
            }
        }
        return null;
    }
    /*****
     *This method takes the name
     * and finally the ammount
     * and update the Tranaction (Arraylist) wiht that amount
     ****/
    public boolean Do_Transaction(String Customer_Name,double TransactionAmount){
        Customers existing = if_Exists_Customers(Customer_Name);
        if (if_Exists_Customers(Customer_Name)!=null){
            existing.Add_Transaction(TransactionAmount);
            return true;
        }
        return false;
    }

}
