

public class GumballMachine {
 
    State soldOutState;
    State noCoinState;
    State hasEnoughCoinState;
    State soldState;
    State notEnoughCoinState;
 
    State state = soldOutState;
    int count = 0;
    int coins = 0; 
    int price;
    boolean accept_coin;  //false if only accept quarter
 
    public GumballMachine(int nums, int price, boolean type) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasEnoughCoinState = new HasEnoughCoinState(this);
        notEnoughCoinState = new NotEnoughCoinState(this); 
        soldState = new SoldState(this);

        this.count = nums;
        this.price = price;
        this.accept_coin = type;
        if (nums > 0) {
            state = noCoinState;
        } 
    }
 
    public void insertCoin(int coin) {
        if (accept_coin || coin == 25 ){
            state.insertCoin(coin);
        } else {
            System.out.println("You can only insert Quarter...");
        }
    }
 
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
            coins = coins - price;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasEnoughCoinState() {
        return hasEnoughCoinState;
    }
    
    public State getNotEnoughCoinState() {
        return notEnoughCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
