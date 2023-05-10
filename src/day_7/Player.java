package day_7;

import java.util.Random;

public class Player {
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public int getStamina() {
        return stamina;
    }

    public Player(){
        if (countPlayers < 6){
            countPlayers ++;
            Random random = new Random();
            stamina += MAX_STAMINA - random.nextInt(10);
            System.out.println("Players stamina = " + stamina + " :" + Player.countPlayers);
        } else {
            System.out.println("no more six players");
        }
    }
    public void run(){
        if (stamina == 90)
        return;
        stamina --;
        if (stamina == 90){
            countPlayers--;
            System.out.println("stamina : " + stamina + " players : " + Player.countPlayers);
        }
    }
    public static void info(){
        if (countPlayers < 6){
            System.out.println("the team is not complete, and plays " + countPlayers);
        } else {
            System.out.println("No vacant tables");
        }
    }


}
