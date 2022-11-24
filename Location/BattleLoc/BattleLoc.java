package Location.BattleLoc;


import Location.Location;
import Player.Inventory;
import Player.Player;



public abstract class BattleLoc extends Location {
   
   
   
    BattleLoc(String name) {
        super(name);
        
    }

    public abstract boolean onLocation();

    public abstract void combat(Player p,Inventory inv);

    public abstract void createObs();

    public static void test(Player p){
      
    }
   
}
