package fixtures;

import java.util.HashMap;

public class Room extends Fixture{
	
	HashMap<String, Room> exits = new HashMap();
    public Room(){
        super("EmptyRoom", "Room is empty.","This room is barren; void of all furniture, or any other signs of life.");
        HashMap<String, Room> exits = new HashMap();
    }
     
    public Room(String n, String sd, String ld){
        super(n,sd,ld);
        HashMap<String, Room> exits = new HashMap();
    }
    
    public void setExits(Room eNorth, Room eEast, Room eSouth, Room eWest){
    	exits.put("North", eNorth);
    	exits.put("East", eEast);
    	exits.put("South", eSouth);
    	exits.put("West", eWest);
    }
    
   
    public String getExits(){
    	String prompt = "Exits: ";
    	String north = new String( "");
    	String east = new String( "");
    	String south = new String( "");
    	String west = new String( "");
    	
    	// If exit is the same room, Say there is no exit there
    	if( exits.get("North").equals(this)  ) {
    		north = "\nNorth: None";
    	}else {north = "\nNorth: " + exits.get("North").getName();
    		}
    		
    	if( exits.get("East").equals(this)  ) {
    		east = "\nEast: None";
    	}else {east = "\nEast: " + exits.get("East").getName();
    		}
    	
    	if( exits.get("South").equals(this)  ) {
    		south = "\nSouth: None";
    	}else {south = "\nSouth: " + exits.get("South").getName();
    		}
    	
    	if( exits.get("West").equals(this)  ) {
    		west = "\nWest: None";
    	}else {west = "\nWest: " + exits.get("West").getName();
    		}
    	
    	return (prompt + north + east + south + west );
}
    
    public Room getExit(String direction){
    	switch(direction){
    		case "NORTH":
    		return this.exits.get("North");
    		
    		case "EAST":
    		return this.exits.get("East");
    		
    		case "SOUTH":
    		return this.exits.get("South");
    		
    		case "WEST":
    		return this.exits.get("West");
    		
    		default:
    		System.out.println("Not an option");
    	}
    	return this;
    	
    }
    
    
    @Override
    public String toString() {
    	return (getName() + "\n" + getShortDescription() + "\n" + getLongDescription());
    }
}
