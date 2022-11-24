package Location.NormalLoc;

import Location.Location;

public abstract class NormalLoc extends Location{
    
    public NormalLoc(String name) {
        super(name);
        
    }

    public abstract boolean onLocation();
}
