package fixtures;

import fixtures.Room;
import fixtures.Fixture;

public class Room extends Fixture {
	private Room[] exits = new Room[4];
	private Fixture[] items = new Fixture[5];

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	public Room getExit(String direction) { 
		int index = 0;
		
		direction = direction.toUpperCase();
		switch (direction) {
		case "NORTH":
			index = 0;
			break;
		case "SOUTH":
			index = 2;
			break;
		case "WEST":
			index = 3;
			break;
		case "EAST":
			index = 1;
			break;			
		}
		
		
		if (index >= this.exits.length || this.exits[index] == null) {
			System.out.println("There is no room in that direction");
			
		
			return this;
		}
		
		return this.exits[index];
	}
	
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
}