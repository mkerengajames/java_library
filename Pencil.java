public class Pencil{
	
	
	String color;
	int length;
	double price;
	
	public Pencil(){
		color = "white";
		length = 0;
		price = 0;
	}
	
	public void changeValues(String newColor, int newLength, double newPrice){
			color = newColor;
			length = newLength;
			price = newPrice;
	}
	
	
	public void display(){
		System.out.println(color);
		System.out.println(length);
		System.out.println(price);
	}
	
	
	
	public static void main(String[] args){
		Pencil bic = new Pencil();
		bic.changeValues("blue", 10, 1000);
		bic.display();
		
		System.out.println("  ");
		
		Pencil cello = new Pencil();
		cello.changeValues("green", 20, 2000);
		cello.display();
		

		
	}
}