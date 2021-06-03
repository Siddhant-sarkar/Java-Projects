package com.SarkarSiddhant;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts>Numberlist;
    private String name;
//constructor
    public MobilePhone(String name) {
        this.name = name;
        Numberlist=new ArrayList<Contacts>();
    }
//Contacts Printer
    public void Contacts_Printer(){
        if (Numberlist.size()==0){
            System.out.println("No Contacts To Display");
        }
        else{
            for (int i=0;i<Numberlist.size();i++){
                System.out.println("Name of Contact : "+Numberlist.get(i).getName());
                System.out.println(" Number Of the Contact : "+Numberlist.get(i).getNumber());
                System.out.println();
                System.out.println();
            }
        }
    }
//ifExists
    public int Check(String Name){
        String temp;
       for (int i=0;i<this.Numberlist.size();i++){
           Contacts contact=this.Numberlist.get(i);
           if (contact.getName().equals(Name)){
               return i;
           }
       }
       return -1;
    }
    public int Check(Contacts contact){
        return this.Numberlist.indexOf(contact);
    }
//Contacts Creator
    public void Contact_Add(String Name, String NUmber){
        Contacts temp=new Contacts(Name,NUmber);
        Numberlist.add(temp);
}
//Edit Contact
    public void EditContact(String Number,String Name){
        Numberlist.get(Check(Name)).setNumber(Number);
        Numberlist.get(Check(Name)).setNumber(Name);

    }
//Remove Contact
    public void Remove(String name){
        Numberlist.remove(Check(name));
    }

}
