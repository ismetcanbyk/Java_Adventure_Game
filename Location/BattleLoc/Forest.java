package Location.BattleLoc;

import Obstacle.Vampire;
import Player.Inventory;
import Player.Player;

public class Forest extends BattleLoc {

    Vampire pubVampire;
    public boolean fight;

    public Forest(String name) {
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

        Vampire v1 = new Vampire(2, 4, 14, 7, randNum);
        pubVampire = v1;
    }

    @Override
    public void combat(Player p, Inventory inv) {
        int totalObsHealth;
        int playerTotal = p.getHealthy();
        int obsTotal;

        totalObsHealth = pubVampire.getObsPiece() * pubVampire.getHealth();

        while (p.getHealthy() > 0 && pubVampire.getHealth() > 0) {

            obsTotal = totalObsHealth - p.getDamage();
            System.out.println("\n" + p.getName() + " vurdu.");
            System.out.println("Vampirlerin canı : " + totalObsHealth);
            totalObsHealth = obsTotal;

            if (totalObsHealth <= 0) {
                pubVampire.setHealth(0);
                p.setMoney(p.getMoney() + (pubVampire.getObsPiece() * 7));
                fight = false;
                break;
            }

            playerTotal = p.getHealthy() + inv.getArmorDefence() - pubVampire.getDamage();
            System.out.println("\nVampirler vurdu");
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
            System.out.println("\nVampirler öldü");
            System.out.println("Tahta ve " + pubVampire.getObsPiece() * 7 + " para Kazandınız");
            System.out.println("\n");
        }

    }

    public boolean checkFinish() {
        return this.fight;
    }

    public void awards(Inventory i) {

        i.setFirewood(true);

    }

}
