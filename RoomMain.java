public class RoomMain {
    public static void main(String args[]) {
	Room r1 = new Room();
	Room r2 = new Room();
	//r1.area();
	//r2.area();
	r1.length = 50;
	r2.width = 60;
	r1.area();
	r2.area();
	r2 = r1;
	r1.length = 70;
	r2.width = 80;
	r1.area();
	r2.area();
    }
}