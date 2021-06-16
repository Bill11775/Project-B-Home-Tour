package game;

import fixtures.Room;

public class RoomManager {
	private Room startingRoom;
	
	private Room[] rooms;
	
	public RoomManager(int roomCount) {
		super();
		rooms = new Room[roomCount];
	}
	
	public void init() {
		Room room1 = new Room(
				"The foyer",
				"a small foyer",
				"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + "\n"
						+ "The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor." + "\n"
						+ "To the north is a small room, where you can see a piano.");
		this.rooms[0] = room1;
		
		Room room2 = new Room(
			"The Library",
			"a cozy library",
			"This square room has the west and south walls completely covered with built-in bookshelves, the bottoms of which are storage cabinets.The floor is covered in a large persian rug, atop which three antique parlor chairs arranged in front of the bookshelves. A small cocktail table sits between the chairs, hosting a stack of books. A piano sits against the north wall, and windows to the east let in the morning sun. The foyer is visible to the south.\"");
		this.rooms[1] = room2;
		
		Room room3 = new Room(
				"The Dining Room",
				"a long dining room",
				"10 chairs and 10 foot dining table");
		this.rooms[2] = room3;
		
		Room room4 = new Room(
				"The Living Room",
				"a living room",
				"couches and chimney");
		this.rooms[3] = room4;
		
		this.startingRoom = room1;
		
		
		room1.setExits(room3, 2);
		room1.setExits(room2, 3);
		
		room2.setExits(room1, 1);
		room2.setExits(room4, 3);
		
		room3.setExits(room1, 0);
		
		room4.setExits(room2, 1);
	}
	
	public Room getRoom(int index) {
		return rooms[index];
	}
	
	public Room getRoom(String roomName) {
		int index = 0;
		for (int i = 0; i < rooms.length; i++) {
			if (roomName.toUpperCase() == rooms[i].getName().toUpperCase()) {
				
				return getRoom(i);
			}
		}
		
		
		return null;
	}
	
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
}