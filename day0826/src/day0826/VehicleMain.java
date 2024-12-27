//package day0826;
//
//class Vehicle{
//	private String make;
//	private String model;
//	private int year;
//	private static int vehicleCount = 0;
//	
//	public Vehicle(String make, String model, int year) {
//		this.make=make;
//		this.model=model;
//		this.year=year;
//		vehicleCount++;
//	}
//	
//	public String getInfo() {
//		return "Vehecle :"+make+" "+model;
//	}
//	public String getInfo(boolean detail) {
//		if(detail) {
//			return "상세정보 > make : "+make+", model : "+model+", year : "+year;
//		}else {
//			return getInfo();
//		}
//	}
//	
//	public VehicleCount() {
//		
//	}
//	
//	public String getMake() {
//		return make;
//	}
//	public void setMake(String make) {
//		this.make = make;
//	}
//	public String getmodel() {
//		return model;
//	}
//	public void setmodel(String model) {
//		this.model = model;
//	}
//	public int getYear() {
//		return year;
//	}
//	public void setYear(int year) {
//		this.year = year;
//	}
//	
//	public static int getVehicleCount() {
//		this.getVehicleCount=getVehicleCount;
//	}
//}
//
//class Truck extends Vehicle{
//	private double ton;
//	
//	public Truck(String make, String model, int year,double ton) {
//		this.ton=ton;
//	}
//	
//	public String getInfo(boolean detail) {
//		if(detail) {
//			return super.getInfo(true)+", ton : "+ton;
//		}else {
//			return getInfo();
//		}
//	}
//}
//public class VehicleMain {
//	public static void main(String[] args) {
//		Vehicle car = new Vehicle("제네시스", "g80", 2022);
//		Truck truck = new Truck("기아", "봉고차", 2024, 1.5);
//		
//		System.out.println(car.getInfo());
//		System.out.println(truck.getInfo());
//		System.out.println(car.getInfo(true));
//		System.out.println(truck.getInfo(true));
//		System.out.println("전체 차량수 : ",Vehicle.getVehicleCount());
//	}
//}
