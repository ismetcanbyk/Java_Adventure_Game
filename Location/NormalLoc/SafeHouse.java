package Location.NormalLoc;

import Player.Inventory;
import Player.Player;

public class SafeHouse extends NormalLoc {

    public SafeHouse(String name) {
        super(name);

    }

    @Override
    public boolean onLocation() {

        return true;
    }

    public void regeneration(int saveHealth, Player p, Inventory inv) {

        System.out.println("\nHoşgeldin " + p.getName());

        p.setHealthy(saveHealth);
        System.out.println("Can yenilendi ! Canınız : " + p.getHealthy());

        System.out.println("Paranız : " + p.getMoney());

        System.out.println("Hasarınız : " + p.getDamage());

        System.out.println("Armor :" + inv.getArmorDefence());
        System.out.println("---Envanter---");
        System.out.println("Su :" + inv.isWater() + "\tYemek :" + inv.isFood() + "\ttahta :" + inv.isFirewood());

    }

}
