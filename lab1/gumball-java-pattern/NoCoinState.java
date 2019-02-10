

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        gumballMachine.coins = gumballMachine.coins + coin; 
        System.out.println("You inserted a Coin");
        
        if (gumballMachine.coins >= gumballMachine.price){
            gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
        } else {
            gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
        }
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted any Coins");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no Coin");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for Coins";
    }
}
