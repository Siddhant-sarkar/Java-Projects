package com.SarkarSiddhant;

public class EnhancedPlayer {
    private String Fullname;
    private int Hitpoints =100;
    private String weapon;

    public EnhancedPlayer( int health, String weapon) {
        this("Siddhant Sarkar",25,"Leviathan Axe");


    }

    public EnhancedPlayer(String fullname,int hitpoints,String weapon){
        this.Fullname=fullname;
        this.Hitpoints=hitpoints;
        this.weapon=weapon;
    }
    public void loseHealth(int damage){
        this.Hitpoints -=damage;
        if (this.Hitpoints <=0){
            System.out.println("Player Knocked Out");
        }
    }

    public int healthRemaining(){
        return this.Hitpoints;
    }
}
