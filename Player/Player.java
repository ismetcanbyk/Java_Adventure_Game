package Player;

import Character.Archer;
import Character.Knight;
import Character.Samurai;

public class Player {

    private int damage;
    private int healthy;
    private int money;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void selectChar() {
        System.out.println("------------------------");
        System.out.println("Karakter id:1\t : Samuray \t Hasar : 5 \t Sağlık : 21 \t Para : 15");
        System.out.println("Karakter id:2\t : Okçu \t Hasar : 7 \t Sağlık : 18 \t Para : 20");
        System.out.println("Karakter id:3\t : Şovalye \t Hasar : 8 \t Sağlık : 24 \t Para : 5");
    }

    public void selectLoc() {
        System.out.println("------------------------");
        System.out.println("1)Ev -->\t Özellikleri : Can yenilenir. \t\t\t Adress : 1");
        System.out.println("2)Mağaza -->\t Özellikleri : Silah ve kalkan alınır. \t\t Adress : 2");
        System.out.println("3)Mağara -->\t Canavar: (1-3)Zombi \t Ödül : Loot + Food \t Adress : 3");
        System.out.println("4)Orman -->\t Canavar: (1-3)Vampir \t Ödül : Loot + Wood \t Adress : 4");
        System.out.println("5)Nehir -->\t Canavar: (1-3)Ayı \t Ödül : Loot + Water \t Adress : 5");
        System.out.println("0)ÇIKIŞ ");
        System.out.println("");
    }

    public void createChar(int charNum) {
        switch (charNum) {
            case 1:
                Samurai samurai = new Samurai(1, "Samuray", 5, 21, 15);
                System.out.println("Seçilen karakter :  Samuray");
                this.damage = samurai.damage;
                this.healthy = samurai.health;
                this.money = samurai.money;
                break;
            case 2:
                Archer archer = new Archer(2, "Okçu", 7, 18, 20);
                System.out.println("Seçilen karakter :  Okçu");
                this.damage = archer.damage;
                this.healthy = archer.health;
                this.money = archer.money;
                break;
            case 3:
                Knight knight = new Knight(3, "Şovalye", 8, 24, 5);
                System.out.println("Seçilen karakter :  Şovalye");
                this.damage = knight.damage;
                this.healthy = knight.health;
                this.money = knight.money;
                break;
            default:
                System.out.println("Hatalı giriş !");
                System.exit(0);
                break;
        }
    }

}
