
public class Point {
	//Main attributes and they are associated with methods which  given below 
	private int x;
	private int y;
	//Constructor
	public Point(int x , int y){
		this.x=x;
		this.y=y;
	}
	//Getters And Setters
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//Display
	public void display(){
		System.out.println("Coor x: " + this.x +" "+ "Coor y :" + this.y);
	}
		
	
}
