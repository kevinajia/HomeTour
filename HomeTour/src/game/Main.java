package game;

import game.Player;
import java.util.Scanner;
import fixtures.Room;
import game.RoomManager;

public class Main {
	
	public static void main(String[]args){
    	RoomManager MyHouse = new RoomManager(); 
        Player player1 = new Player();
        player1.setRoom(MyHouse.startingRoom);
        System.out.println(player1.getRoom());
        System.out.println(player1.getRoom().getExits());
        String[] input;
       
       
       do {
    	   input = collectInput();
    	   parse(input, player1);   
    	   printRoom(player1);
    	   System.out.println(player1.getRoom().getExits());
       }while(player1.getRoom().getName()!= "Quit");
      
}
    private static void printRoom(Player player){
        System.out.println("Room: " + player.getRoom().getName());
        System.out.print("Short Description: " + player.getRoom().getShortDescription() + "\n");
        System.out.print("Long Description: " + player.getRoom().getLongDescription() + "\n");
    }
    
    private static String[] collectInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What would you like to do?"
        + " (ex:'go [direction]', 'quit' to exit ");
        String uI = userInput.nextLine().toUpperCase();
        String[] cI = uI.split(" ");
        return cI ; 
    }
    
    
    private static void parse(String[] command, Player player){
    	Room Quit = new Room("Quit", "Quit","Quit");
    	Quit.setExits(Quit, Quit, Quit, Quit);
        switch(command[0]){
            //movement
            case "GO":
                player.setRoom(player.getRoom().getExit(command[1]));
                break;
            case "HEAD":
                player.setRoom(player.getRoom().getExit(command[1]));
                break;
            case "MOVE":
                player.setRoom(player.getRoom().getExit(command[1]));
                break;
            case "WALK":
                player.setRoom(player.getRoom().getExit(command[1]));
                break;
            case "QUIT":
            	player.setRoom(Quit);
            	break;
                
            default: System.out.println(command[0] + " is not a command!\n");
        }
    }

}
