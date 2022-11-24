import java.util.*;

import Location.GoLoc;
import Player.Player;

public class Game {

    String inpName;
    int charId;
    int locAdress;
    public int saveHealth;
    public boolean gameFinish = false;
    Scanner inp = new Scanner(System.in);

    public void start() {
        System.out.println("Oyuna hoşgeldiniz ");

        System.out.print("\nİsminizi girin : ");
        inpName = inp.next();
        Player player1 = new Player(inpName);

        System.out.println("\n \n \tKarakterler");
        player1.selectChar();

        System.out.print("\nKarakter idsini girin : ");
        charId = inp.nextInt();
        player1.createChar(charId);
        saveHealth = player1.getHealthy();

        System.out.println("\n \t Lokasyonlar");

        player1.selectLoc();

        while (gameFinish == false) {
            System.out.print("Gitmek istediğiniz lokasyonun adresini girin : ");
            locAdress = inp.nextInt();
            GoLoc.goLoc(locAdress, player1, saveHealth, gameFinish);

            gameFinish = GoLoc.checkStat;
            GoLoc.checkGame();
        }

        if (gameFinish == true) {
            System.out.println("Yenildin !!!");
        }

    }

}
