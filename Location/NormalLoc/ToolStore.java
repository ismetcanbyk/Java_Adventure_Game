package Location.NormalLoc;

import java.util.*;

import Player.Inventory;
import Player.Player;

public class ToolStore extends NormalLoc {

    public int selectSec;
    public int selectWep;
    Scanner inp = new Scanner(System.in);

    public ToolStore(String name) {
        super(name);

    }

    @Override
    public boolean onLocation() {

        return true;
    }

    public void store(Player p, Inventory inv) {

        System.out.println("---Mağazaya Hoşgeldiniz---");
        System.out.println("1)Zırhlar");
        System.out.println("2)Silahlar");
        System.out.println("0)Çıkış");

        System.out.print("Gitmek istediğiniz bölümü seçin :");
        selectSec = inp.nextInt();

        storeSection(selectSec, p, inv);
    }

    public void storeSection(int selectSec, Player p, Inventory inv) {
        switch (selectSec) {
            case 0:

                break;
            case 1:
                System.out.println("----Zırhlar----");
                System.out.println("1)Basit Zırh -> \t Koruma: 3 \t Fiyat: 12 ");
                System.out.println("2)Orta Zırh -> \t\t Koruma: 5 \t Fiyat: 18");
                System.out.println("3)Gelişmiş Zırh -> \t Koruma: 8 \t Fiyat: 23");
                System.out.println("4)Çıkış");
                selectWep = inp.nextInt();
                selectArm(selectWep, p, inv);
                break;
            case 2:
                System.out.println("-----Silahlar----");
                System.out.println("1)Tabanca -> \t Hasar: 2 \t Fiyat: 10");
                System.out.println("2)Tüfek -> \t Hasar: 6 \t Fiyat: 17");
                System.out.println("3)Bomba -> \t Hasar:12 \t Fiyat: 25");
                System.out.println("4)Çıkış");
                selectWep = inp.nextInt();
                selectWep(selectWep, p);
                break;
            default:
                System.out.println("Hatalı giriş !");
                break;
        }
    }

    public void selectWep(int selectWep, Player p) {
        switch (selectWep) {
            case 1:
                if (p.getMoney() >= 10) {
                    p.setDamage(p.getDamage() + 2);
                    p.setMoney(p.getMoney() - 10);
                    System.out.println("Silah alındı.");
                } else {
                    System.out.println("Yetersiz Para !");
                }
                break;
            case 2:
                if (p.getMoney() >= 17) {
                    p.setDamage(p.getDamage() + 6);
                    p.setMoney(p.getMoney() - 17);
                    System.out.println("Silah alındı.");
                } else {
                    System.out.println("Yetersiz Para !");
                }
                break;
            case 3:
                if (p.getMoney() >= 25) {
                    p.setDamage(p.getDamage() + 12);
                    p.setMoney(p.getMoney() - 25);
                    System.out.println("Silah alındı.");
                } else {
                    System.out.println("Yetersiz Para !");
                }
                break;
            case 4:

                break;

            default:
                System.out.println("Hatalı Giriş !");
                break;
        }

    }

    public void selectArm(int selectWep, Player p, Inventory inv) {
        switch (selectWep) {
            case 1:
                if (p.getMoney() >= 12) {
                    inv.setArmorDefence(3);
                    p.setMoney(p.getMoney() - 12);
                    System.out.println("Zırh alındı.");
                } else {
                    System.out.println("Yetersiz Para !");
                }
                break;
            case 2:
                if (p.getMoney() >= 18) {
                    inv.setArmorDefence(5);
                    p.setMoney(p.getMoney() - 18);
                    System.out.println("Zırh alındı.");
                } else {
                    System.out.println("Yetersiz Para !");
                }
                break;
            case 3:
                if (p.getMoney() >= 23) {
                    inv.setArmorDefence(8);
                    p.setMoney(p.getMoney() - 23);
                    System.out.println("Zırh alındı.");
                } else {
                    System.out.println("Yetersiz Para !");
                }
                break;
            case 4:

                break;

            default:
                System.out.println("Hatalı Giriş !");
                break;
        }
    }

}
