package com.SarkarSiddhant;

import javax.swing.text.Position;

public class ArrayList {
    private java.util.ArrayList<String> MyList = new java.util.ArrayList<String>();

    public void AddItems(String Name) {
        MyList.add(Name);
    }

    public java.util.ArrayList<String> getMyList() {
        return MyList;
    }

    public void PrintList() {
        System.out.println("You have " + MyList.size() + " Items in Your List ");
        for (int i = 0; i < MyList.size(); i++) {
            System.out.println("Item At " + i + " is " + MyList.get(i));
        }
    }

    public void Change_at(int number,String name){
        System.out.println("Changing the element at "+(number+1)+" With "+name);
        MyList.set(number,name);
    }

    public void Remove(int position){
        System.out.println("Removing The Element named "+MyList.get(position));
        String temp=MyList.get(position);
        MyList.remove(temp);
    }

    public String Find_item(String nametofind){
        int number=MyList.indexOf(nametofind);
        if(number>=0){
            return MyList.get(number);
        }
        return null;
    }

    public int Find_item_number(String Name){
        return MyList.indexOf(Name);
    }
}
