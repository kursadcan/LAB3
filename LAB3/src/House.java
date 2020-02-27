
public class House {
	///Main attributes and they are associated with methods which  given below and needed to define a home
	private String kind;
	private int NumberOfRooms;
	private Addres addres;
	private int area;
	private int price;
	
	//Constructor
	public House(String kind, int numberOfRooms, Addres addres, int area, int price) {
		this.kind = kind;
		this.NumberOfRooms = numberOfRooms;
		this.addres = addres;
		this.area = area;	
		this.price = price;
	}
	//Getters and Setters
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getNumberOfRooms() {
		return NumberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		NumberOfRooms = numberOfRooms;
	}
	public Addres getAddres() {
		return addres;
	}
	public void setAddres(Addres addres) {
		this.addres = addres;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//Display  
	public void display(){
		System.out.println("Kind :" + this.kind +" "+"Number Of Rooms :" + this.NumberOfRooms+" " +this.addres.getTotalAdress()+ " Area :"+ this.area +" Price :" +this.price);
	}
	
	
	
}
