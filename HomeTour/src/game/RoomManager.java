package game;

import fixtures.Room;

public class RoomManager {
	public RoomManager() {
		this.init();
		this.fillRoomManager();
		this.fillExits();
	}
	
    Room startingRoom;
    Room[] rooms = new Room[7];
    //Map instead?
    public void init(){
        Room Foyer = new Room(
		"The Foyer",
		"a small foyer",
		"The small entryway of a neo-colonial house. A dining room is open to the north-west, where a large table can be seen." + "\n"
		+ "The hardwood floor leads west into the family room, next to a staircase that leads up to a second floor." + "\n"
		+ "To the north is a wall with an obscure painting, to the east is an office.");
		rooms[0] = Foyer;
        this.startingRoom = Foyer;
    }
    
    public void fillRoomManager() {
    	Room FamilyRoom = new Room("Family Room","This room is where the family sits","With two couches and a chair - this room has plenty of space for the whole family to come together for a game of cards or two");
    	rooms[1] = FamilyRoom;
    	Room DiningRoom = new Room("Dining Room","This room is where the family eats","Six chairs and a table with an extra leaf - bring on the cookouts and all the friends");
    	rooms[2] = DiningRoom;
    	Room Kitchen = new Room("Kitchen","This is the kitchen", "With plenty of counter space and an island there's never a shortage of prep space");
    	rooms[3] = Kitchen;
    	Room LivingRoom = new Room("Living Room","The room where people live","This is where the real living happens");
    	rooms[4] = LivingRoom;
    	Room Bathroom = new Room("Bathroom","Half Bathroom","Just enough space to poop");
    	rooms[5] = Bathroom;
    	Room Office = new Room("Office","For the paranoid businessman", "Placed at the front of the house, this office is perfect for those who need to get work done and keep an eye on who is approaching the house");
    	rooms[6] = Office;
    }
    
    public void fillExits() {
    	//foyer 0
    	rooms[0].setExits(rooms[0], rooms[6], rooms[0], rooms[1]);
    	//family room 1
    	rooms[1].setExits(rooms[2], rooms[0], rooms[1], rooms[1]);
    	//dining room 2
    	rooms[2].setExits(rooms[2], rooms[3], rooms[1], rooms[2]);
    	//kitchen 3
    	rooms[3].setExits(rooms[3], rooms[4], rooms[3], rooms[2]);
    	//living room 4
    	rooms[4].setExits(rooms[4], rooms[4], rooms[5],rooms[3]);
    	//bathroom 5
    	rooms[5].setExits(rooms[4], rooms[5], rooms[6], rooms[5]);
    	//office 6
    	rooms[6].setExits(rooms[5], rooms[6] ,rooms[6], rooms[0]);
    }
}
