package Character;

public abstract class GameChar {
    public int id;
    public String name;
    public int damage;
    public int health;
    public int money;

    GameChar(int id, String name, int damage, int health, int money) {
        this.id=id;
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.money=money;
    }

}
