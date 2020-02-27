
public class Clock {
	//Main attributes and they are associated with methods which  given below 
	private int min;
	private int hour;
	public Clock(String userTimeInput){
		//Splittind and cheking before set them as min and hour
		try{
			String[] userElements = userTimeInput.split(":");
			this.hour= Integer.parseInt(userElements[0]);
			this.min= Integer.parseInt(userElements[1]);
		}
		catch(Exception e){
			System.out.println("Unexpected User Input");
		}
			
		
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	//Converting them depending on their magnitude to decide AM or PM form
	public void convert(){
	
		if(this.hour==0 || this.hour==24){
			System.out.println("12:"+this.min + "AM");
		}
		else if(this.hour==12){
			System.out.println("12:"+this.min + "PM");
		}
		else if(this.hour>12 ){
			System.out.println(this.hour%12 +":" + this.min +"PM");
		}
		else{
			System.out.println(this.hour +":"+ this.min+"AM");
		}
	}
	
}
