package Player;
public class Inventory {
    private boolean water;
    private boolean food;
    private boolean firewood;
    private int armorDefence;
   
   
    public boolean isWater() {
        return water;
    }
    public boolean isFood() {
        return food;
    }
    public boolean isFirewood() {
        return firewood;
    }
    public int getArmorDefence() {
        return armorDefence;
    }
    public void setWater(boolean water) {
        this.water = water;
    }
    public void setFood(boolean food) {
        this.food = food;
    }
    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }

    
}
