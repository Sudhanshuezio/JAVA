class Room {
  int length;
  int width;

  public Room(int length, int width) {
	this.length = length;
	this.width = width;
	this.area();
  }

  public Room() {
	this(10,20);
  }

  public void area() {
	System.out.println(length * width);
  }
}