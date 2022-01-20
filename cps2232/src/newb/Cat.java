/*
 * Kean University
* Spring 2022
* Course: CPS*2232 – Data Structures
* Author: Your Full Name, course, section
* Homework (or Lab): 1, task 1, 2, 3, ....
* Program Description: *************************************************************************/

package newb;

enum Color2{
	
	WHITE,CREAM,FAWN,CINNAMON, CHOCOLATE, RED, LILAC, BLUE, BLACK, LAVENDER
	
}

public class Cat {
	
	private String name;
	private double age;
	private Color2 color;
	private String type;
	private static int numberOfCats;
	
	Cat(){
		
	}

	Cat(String name) {
		
		this.name = name;
	}

	Cat(String name, double age, Color2 color, String type) {
		
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
	}
	
	Cat(String name, String breed){
		
		this.name = name;
		System.out.println(breed);
		
	}
	
	
	
	public static int getNumberOfCats() {
		return numberOfCats;
	}

	String eat() {
		
		return "favorite food";

	}
	
	boolean play(String toy) {
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println(numberOfCats);
		Cat myCat1 = new Cat();
		Cat myCat2 = new Cat(Color2.LILAC, "Feral");
		Cat myCat3 = new Cat("Cutie", );
		
	}

}
