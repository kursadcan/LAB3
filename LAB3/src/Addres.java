
public class Addres {
	//Main attributes and they are associated with methods which  given below 
	private String StreetName;
	private String Town;
	private String City;
	//Constructor
	public Addres(String streetName, String town, String city) {
	
		this.StreetName = streetName;
		this.Town = town;
		this.City = city;
	}
	//Getters And Setters
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getTown() {
		return Town;
	}
	public void setTown(String town) {
		Town = town;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	
	//There is two methods their change depending on needed return type , second one created for to use in other classes addres display methods
	public void display(){
		System.out.println("Street :" + this.StreetName +" "+ "Town: " + this.Town + " " + "City : "+ this.City);
	}
	public String getTotalAdress() {
		return "Street :" + this.StreetName +" "+ "Town: " + this.Town + " " + "City : "+ this.City;
	}
	

}
