package zooKeeper1;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		super(); 
		this.energyLevel = 100;
	}
	
	public int throwSomething(String anObject) {
		System.out.println("The gorilla threw a " + anObject + ".");
		int gorillaLevel = this.energyLevel - 5;
		return gorillaLevel;
	}
	public void eatsBananas() {
		System.out.println("BANANA GOOD! ME ENERGIZED! 10+");
		this.energyLevel += 10;
	}
	
	public int climb() {
		System.out.println("CLIMB..CLIMB..need more bananas. Me so tired. -_-");
		this.energyLevel -= 10;
		return this.energyLevel;
	}
}
