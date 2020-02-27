import java.util.ArrayList;
import java.util.Scanner;

public class RealEstate {
	//These are main attributes of a real estate 
	private String agent_name;
	private Addres agent_addres;
	private ArrayList<House> homesList;
	//Constuctor
	public RealEstate(String agent_Name,Addres agent_adress,ArrayList<House> houses){
		this.agent_name = agent_Name;
		this.agent_addres=agent_adress;
		this.homesList = houses;
	}
	//This Insertion Sort Algorithm created for better organisate to homes and display them by the order which make sense to user
	public static void insertion_sort_homes(ArrayList<House> houses){
		int n = houses.size();
		for (int i = 0; i < houses.size(); i++) {
		House key = houses.get(i);
		
		int j = i-1;
		while(j>=0 && houses.get(j).getPrice()>key.getPrice()){
			houses.set(j+1, houses.get(j));
			j = j-1;

		}
		houses.set(j+1, key);
		}
		}
	//We add house in this method by try catch checks 
	public void addHouse(){
		try{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Input House Kind :");
		String kind = scn.nextLine();
		System.out.println("Please Input Number Of Rooms :");
		int numbOfRooms = Integer.parseInt(scn.nextLine());
		System.out.println("Please Input House's Street Name: ");
		String streetName = scn.nextLine();
		System.out.println("Please Input House's Town Name: ");
		String townName = scn.nextLine();
		System.out.println("Please Input House's City Name: ");
		String cityName = scn.nextLine();
		System.out.println("Please Input House's Area: ");
		int areOfHome = Integer.parseInt(scn.nextLine());
		System.out.println("Please Input House's price: ");
		int priceOfHome = Integer.parseInt(scn.nextLine());
		Addres newHomeAdd = new Addres(streetName, townName, cityName);
		House newHouse = new House(kind, numbOfRooms, newHomeAdd, areOfHome, priceOfHome);
		this.homesList.add(newHouse);
		//here sorted after new element added
		insertion_sort_homes(this.homesList);
		
		
		
		}
		//this catch gives to user an error message according his input
		catch(Exception e){
			System.out.println("New Home Adding Process Failed Because Of Unfitting Input");
		}
		
	}
	//Display all houses and check whether home exits in system or not.
	public void displayAllHouses(){
		
		if(homesList.size()==0){
			System.out.println("There is no houses");
		}
		else{
			for (int i = 0; i < homesList.size(); i++) {
				System.out.println("House "+(i+1)+" :");
				homesList.get(i).display();
			}
		}
		
		
	}
	//Search between interval and this method and write it to screen by the order to make more meaningful output
	public void searchByPrice(int lowerBound,int upperBound){
		boolean flag = false;
		if(lowerBound <= upperBound ) {
		for (int i = 0; i < homesList.size(); i++) {
			if(homesList.get(i).getPrice()>= lowerBound && homesList.get(i).getPrice()<=upperBound){
				homesList.get(i).display();
				flag = true;
			}
		}
		}
		else {
			System.out.println("Upper Bound Must Be Bigger Than Lower Bound");
		}
		if(!flag) {
			System.out.println("No Such An Estate Found Between Your Price Interval");
		}
	}
	//Getter and setter
	public int numberOfHouses(){
		return homesList.size();
	}

	public String getAgent_name() {
		return agent_name;
	}

	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}

	public Addres getAgent_addres() {
		return agent_addres;
	}

	public void setAgent_addres(Addres agent_addres) {
		this.agent_addres = agent_addres;
	}

	public ArrayList<House> getHomesList() {
		return homesList;
	}

	public void setHomesList(ArrayList<House> homesList) {
		this.homesList = homesList;
	}
	

}
