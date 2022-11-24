package Location;

import Location.BattleLoc.Cave;
import Location.BattleLoc.Forest;
import Location.BattleLoc.River;
import Location.NormalLoc.SafeHouse;
import Location.NormalLoc.ToolStore;
import Player.Inventory;
import Player.Player;

public class GoLoc {
    
    public static boolean checkStat;
    
    static Inventory inv = new Inventory();

    public static  void goLoc(int locAdress ,Player player1, int saveHealth, boolean gameFinish){
        
        switch (locAdress) {
            case 0:
            System.exit(0);
            break;
            case 1:
                SafeHouse h1 = new SafeHouse("can");
                h1.regeneration(saveHealth, player1,inv);
                break;
                
            case 2:
                ToolStore store = new ToolStore("mağaza");
                store.store(player1,inv);
                
                break;
            case 3:
                Cave c = new Cave("mağara");
                c.createObs();
                c.combat(player1,inv);
                checkStat=c.checkFinish();
                c.awards(inv);
                break;
                
            case 4:
                Forest f = new Forest("orman");
                f.createObs();
                f.combat(player1,inv);
                checkStat=f.checkFinish();
                f.awards(inv);
                break;
            case 5:
                River r = new River("nehir");
                r.createObs();
                r.combat(player1,inv);
                checkStat=r.checkFinish();
                r.awards(inv);
                break;
        
            default:
                System.out.println("Hatalı giriş !");
                break;
        }

        
       }

       public static void checkGame(){
        if(inv.isFood() == true && inv.isFirewood()==true && inv.isWater()==true){
            System.out.println("---KAZANDIN---");
            System.exit(0);
        }
       }
      
}
