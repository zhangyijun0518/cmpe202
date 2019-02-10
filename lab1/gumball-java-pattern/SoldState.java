

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertCoin(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank");
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0 ) {
            if (gumballMachine.coins <= 0){
                gumballMachine.setState(gumballMachine.getNoCoinState());
            } else if (gumballMachine.coins >= gumballMachine.price){
                gumballMachine.setState(gumballMachine.getHasEnoughCoinState());
            } else {
                gumballMachine.setState(gumballMachine.getNotEnoughCoinState());
            }
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


