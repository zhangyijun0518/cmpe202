

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine_1 = new GumballMachine(5,25,false);
		GumballMachine gumballMachine_2 = new GumballMachine(5,50,false);
                GumballMachine gumballMachine_3 = new GumballMachine(5,50,true);
		
                System.out.println(gumballMachine_1);

		gumballMachine_1.insertCoin( 25 );
		gumballMachine_1.turnCrank();

		System.out.println(gumballMachine_2);

		gumballMachine_2.insertCoin( 25 );
		gumballMachine_2.turnCrank();
		gumballMachine_2.insertCoin( 25 );
		gumballMachine_2.insertCoin( 10 );
		gumballMachine_2.turnCrank();
		
		System.out.println(gumballMachine_3);
		gumballMachine_3.insertCoin( 10 );
		gumballMachine_3.insertCoin( 10 );
		gumballMachine_3.insertCoin( 25 );
		gumballMachine_3.insertCoin( 5 );
		gumballMachine_3.turnCrank();

		System.out.println("test_end");
	}
}
