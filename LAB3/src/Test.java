import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	//Second Problems Solution Method
	public static double EcludianDistanceProblem(){
		Point pnt1 = new Point(2,1);
		Point pnt2 = new Point(6,4);
		return Math.sqrt(Math.pow((pnt1.getY()-pnt2.getY()),2)+ Math.pow((pnt1.getX()-pnt2.getX()),2)) ;
	}
	//Third Problems Solution Method
	public static void ClockProblem(){
		Clock clk1 = new Clock("14:50");
		Clock clk2 = new Clock("01:40");
		clk1.convert();
		clk2.convert();
	}
	
	//Fourth Problems Solution Method
	public static void RealEstateProblem(){
		//Here we prepare needed object froms associated classes.
		Scanner scn = new Scanner(System.in);
		ArrayList<House> houses = new ArrayList<House>();
		//An example Real Estate Object
		Addres realEstate = new Addres( "217 Street","Buca", "Ýzmir");
		RealEstate DeuRealEstate = new RealEstate("Kursadcan AKAY Real Estate" ,realEstate,houses);
		//This while cycle runs program periodic until user request has been exit.
		while(true) {
			//Needed main output to inform user
			System.out.println("Please Choose The Operation And Enter");
			System.out.println("1-Add House ");
			System.out.println("2-Display All Houses");
			System.out.println("3-Search By Price");
			System.out.println("4-Exit");
			System.out.println("-----------------------------------");
			//Taking operation request from user 
			int userOp= scn.nextInt();
			 
			//Making related operations
			if(userOp == 1) {
				DeuRealEstate.addHouse();
			}
			else if(userOp==2) {
				DeuRealEstate.displayAllHouses();
			}
			else if(userOp==3) {
				System.out.println("Plese Input Your Price Interval By The Order Of Lower And Upper Bounds");
				System.out.print("Lower Bound: "); 
				int userPriceLowerBound = scn.nextInt();
				System.out.print("Upper Bound: "); 
				int userPriceUpperBound = scn.nextInt();
				DeuRealEstate.searchByPrice(userPriceLowerBound, userPriceUpperBound);
				
			}
			else if(userOp==4) {
				
				System.out.println("Programme Ended.");
				break;
			}
			else {
				
				System.out.println("Wrong Operation Request ");
			}
						
		}
		scn.close();
		
		
	}
	public static void main(String[] args) {
		
		//SECOND PROBLEM
		 //System.out.println(EcludianDistanceProblem());
		//
		//THIRD PROBLEM
		 //ClockProblem();
		 //
		 //FOURTH PROBLEM
		 RealEstateProblem();
		 //
		 
		 
		 
		 
		 
		 
		
	}

}
