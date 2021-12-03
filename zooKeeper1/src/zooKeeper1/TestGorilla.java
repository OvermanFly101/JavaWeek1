package zooKeeper1;

public class TestGorilla {

	public static void main(String[] args) {
		Mammal mammal1 = new Mammal();
		Gorilla KingKong = new Gorilla();
		//Display's default energy level of the Mammal class
		System.out.println("The default energy level for a mammal is: " + mammal1.displayEnergy());
		//Gorilla threw something...
		KingKong.throwSomething("barrel");
		KingKong.eatsBananas();
		KingKong.climb();
		
		Gorilla QueenKong = new Gorilla();
		QueenKong.throwSomething("chair");
		QueenKong.throwSomething("luggage");
		QueenKong.throwSomething("wedding ring");
		QueenKong.eatsBananas();
		QueenKong.eatsBananas();
		QueenKong.climb();
		

	}

}
