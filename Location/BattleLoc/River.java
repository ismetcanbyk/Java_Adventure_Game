package Location.BattleLoc;

import Obstacle.Bear;
import Player.Inventory;
import Player.Player;

public class River extends BattleLoc {

    Bear pubBear;
    public boolean fight;

    public River(String name) {
        super(name);

    }

    @Override
    public boolean onLocation() {

        return true;
    }

    @Override
    public void createObs() {
        int randNum;
        randNum = (int) (Math.random() * 4);

        if (randNum == 0 || randNum == 4) {
            randNum = 1;
        }

        Bear b1 = new Bear(3, 7, 20, 12, randNum);
        pubBear = b1;
    }

    @Override
    public void combat(Player p, Inventory inv) {
        int totalObsHealth;
        int playerTotal = p.getHealthy();
        int obsTotal;

        totalObsHealth = pubBear.getObsPiece() * pubBear.getHealth();

        while (p.getHealthy() > 0 && pubBear.getHealth() > 0) {

            obsTotal = totalObsHealth - p.getDamage();
            System.out.println("\n" + p.getName() + " vurdu.");
            System.out.println("Ayıların canı : " + totalObsHealth);
            totalObsHealth = obsTotal;

            if (totalObsHealth <= 0) {
                pubBear.setHealth(0);
                p.setMoney(p.getMoney() + (pubBear.getObsPiece() * 12));
                fight = false;
                break;
            }

            playerTotal = p.getHealthy() + inv.getArmorDefence() - pubBear.getDamage();
            System.out.println("\nAyılar vurdu");
            System.out.println("Senin canın : " + p.getHealthy());
            p.setHealthy(playerTotal);

            if (playerTotal <= 0) {
                p.setHealthy(0);
                System.out.println("Öldün çık");
                fight = true;
                break;
            }
        }

        if (fight == false) {
            System.out.println("\n-----Tebrikler----");
            System.out.println("Ayılar öldü");
            System.out.println("Su ve " + pubBear.getObsPiece() * 12 + " para Kazandınız");
            System.out.println("\n");
        }

    }

    public boolean checkFinish() {
        return this.fight;
    }

    public void awards(Inventory i) {

        i.setWater(true);

    }

}
