import java.util.Random;

public class NotEnoughCoinState implements State {
    GumballMachine gumballMachine;
 
    public NotEnoughCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        gumballMachine.coins = gumballMachine.coins + coin;
        System.out.println("You inserted a Coin");
        if (gumballMachine.coins >= gumballMachine.price){
            gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
        }
        
    }
 
    public void ejectCoin() {
        System.out.println("Coins returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You don not have enough Coins...");
        
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for more coins";
    }
}
