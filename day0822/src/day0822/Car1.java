package day0822;

public class Car1 {

	String color;
	String gearType;
	int door;
	
	Car1(){
		color = "white";
		gearType = "auto"; 
	    door = 12;
	}
	
	Car1(String color){
		this.color = color;
		this.gearType = "auto";
		this.door = 4;
	}
	
	Car1(String color,String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car1(Car1 c){
		this(c.color, c.gearType, c.door);
	}
}
