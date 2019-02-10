

public class Main {

	public static void main(String[] args) {
	GumballMachine gumballMachine_1 = new GumballMachine(1,25,false);
        GumballMachine gumballMachine_2 = new GumballMachine(4,50,false);
        GumballMachine gumballMachine_3 = new GumballMachine(5,50,true);
        
        System.out.println("------------------------------------------");
        System.out.println("GumballMachine NO.1 testing....");
        System.out.println(gumballMachine_1);

        gumballMachine_1.insertCoin(25);
        gumballMachine_1.insertCoin(25);
        gumballMachine_1.turnCrank();    //test successful case
        gumballMachine_1.turnCrank();   //test out of Gumballs case

        System.out.println(gumballMachine_1);
        System.out.println("End of first testing....");
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.println("GumballMachine NO.2 testing....");
        System.out.println(gumballMachine_2);

        gumballMachine_2.insertCoin(25);
        gumballMachine_2.insertCoin(10); //test only accept Quarter case
        gumballMachine_2.turnCrank();   // test not enough coins case
        
        
        System.out.println(gumballMachine_2);
        System.out.println("End of second testing....");
        System.out.println("------------------------------------------");
        
        System.out.println("------------------------------------------");
        System.out.println("GumballMachine NO.3 testing....");
        System.out.println(gumballMachine_3);
        
        //test successful case with not only Quarter
        gumballMachine_3.insertCoin(25);
        gumballMachine_3.insertCoin(10);
        gumballMachine_3.insertCoin(25);
        gumballMachine_3.turnCrank();   

        System.out.println(gumballMachine_3);
        System.out.println("End of third testing....");
        System.out.println("------------------------------------------");
	}
}
