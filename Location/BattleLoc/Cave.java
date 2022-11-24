package Location.BattleLoc;

import Obstacle.Zombie;
import Player.Inventory;
import Player.Player;

public class Cave extends BattleLoc {

    Zombie pubZombie;
    public boolean fight;

    public Cave(String name) {
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

        Zombie z1 = new Zombie(1, 3, 10, 4, randNum);
        pubZombie = z1;
    }

    @Override
    public void combat(Player p, Inventory inv) {

        int totalObsHealth;
        int playerTotal = p.getHealthy();
        int obsTotal;

        totalObsHealth = pubZombie.getObsPiece() * pubZombie.getHealth();

        while (p.getHealthy() > 0 && pubZombie.getHealth() > 0) {

            obsTotal = totalObsHealth - p.getDamage();
            System.out.println("\n" + p.getName() + " vurdu.");
            System.out.println("Zombilerin canı : " + totalObsHealth);
            totalObsHealth = obsTotal;

            if (totalObsHealth <= 0) {
                pubZombie.setHealth(0);
                p.setMoney(p.getMoney() + (pubZombie.getObsPiece() * 4));
                fight = false;
            }

            playerTotal = p.getHealthy() + inv.getArmorDefence() - pubZombie.getDamage();
            System.out.println("\nZombiler Vurdu ");
            System.out.println("Senin canın : " + p.getHealthy());
            p.setHealthy(playerTotal);

            if (playerTotal <= 0) {
                p.setHealthy(0);
                System.out.println("Öldün çık");
                fight = true;

            }
        }

        if (fight == false) {
            System.out.println("\n-----Tebrikler----");
            System.out.println("\nZombiler öldü");
            System.out.println("Yemek ve " + pubZombie.getObsPiece() * 4 + " para Kazandınız");
            System.out.println("\n");

        }

    }

    public boolean checkFinish() {
        return this.fight;
    }

    public void awards(Inventory i) {

        i.setFood(true);

    }

}
