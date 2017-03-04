
public class Cat extends Animal {
	
	int age;
	char color;
	
	//constructor
	public Cat(int catAge){
		age = catAge;
	}
	
	public Cat (char catFur){
		catFur = color;
	}
	
	public void meow(){
		System.out.println("Vixen likes treats! meow-meow!");
	}
	
	public void run(int yards){
		System.out.println("Vixen ran " + yards 
				+ " yards! Vixen is so fast!");
	}
	
	public int getAge(){
		return age;
	}
	
	public char getColor(){
		return color;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Vixen! Who's a good Cat? You are!");
		
		//create new instance
		Cat vixen = new Cat(5);
		vixen.meow();
		vixen.run(15);
		//vixen.color("black");
		
		int vixenAge = vixen.getAge();
		System.out.println("Vixen is " + vixenAge + " years old.");
		
		vixen.vetVisit();
		
	}

}