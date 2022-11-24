package Obstacle;

public class Obstacle {
    private int obstacleNum;
    private int damage;
    private int health;
    private int money;
    private int obsPiece;

    public Obstacle(int obstacleNum, int damage, int health, int money, int obsPiece) {
        this.obstacleNum = obstacleNum;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.obsPiece = obsPiece;
    }

    public void setObstacleNum(int obstacleNum) {
        this.obstacleNum = obstacleNum;
    }

    public int getObstacleNum() {
        return this.obstacleNum;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getObsPiece() {
        return obsPiece;
    }

    public void setObsPiece(int obsPiece) {
        this.obsPiece = obsPiece;
    }
}
