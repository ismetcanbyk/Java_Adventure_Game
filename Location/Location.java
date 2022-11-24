package Location;


public abstract class Location {
    
    String name ;
    

   public Location(String name ){
        this.name=name;
    }

    public abstract boolean onLocation();

   

    
    
}
