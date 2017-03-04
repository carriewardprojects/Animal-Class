
public class Dog extends Animal {
	
	int age;
	
	//constructor
	public Dog(int dogAge){
		age = dogAge;
	}
	
	public void bark(){
		System.out.println("Spike likes treats! woof-woof!");
	}
	
	public void run(int yards){
		System.out.println("Spike ran " + yards 
				+ " yards! Spike is so fast!");
	}
	
	public int getAge(){
		return age;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Spike! Who's a good Dog? You are!");
		
		//create new instance
		Dog spike = new Dog(5);
		spike.bark();
		spike.run(15);
		
		int spikeAge = spike.getAge();
		System.out.println("Spike is " + spikeAge + " years old.");
		
		spike.vetVisit();
		
	}

}