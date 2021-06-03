package com.SarkarSiddhant;

public class Main {

    public static void main(String[] args) {
        FootballPlayer messi=new FootballPlayer("Messi   ");
        BaseBallPlayer joe=new BaseBallPlayer("Joe");
        SoccerPlayer ronaldo=new SoccerPlayer("Ronaldo");

        Team<FootballPlayer> Hindus=new Team<>("Hindus");
        Hindus.Add(messi);
        Hindus.Add(new FootballPlayer("Zalatan Ibrahimovic   "));
//        Hindus.Add(joe);
//        Hindus.Add(ronaldo);

        System.out.println(Hindus.NumPlayers());

    }
}
