package game;

import fixtures.Room;

public class Player {
	
	private Room currentRoom;
    
    public void setRoom(Room cr){
        currentRoom = cr;
    }
    
    public Room getRoom(){
        return currentRoom;
    }
}
