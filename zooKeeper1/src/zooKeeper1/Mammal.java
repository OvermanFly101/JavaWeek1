package zooKeeper1;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public int getEnergy(){
		return this.energyLevel;
	}
	
	public int displayEnergy(){
		System.out.println("Energy level is: " + this.energyLevel );
		return this.energyLevel;
	}
	
	public void setEnergy(int energy){
		this.energyLevel = energy;
	}
}
