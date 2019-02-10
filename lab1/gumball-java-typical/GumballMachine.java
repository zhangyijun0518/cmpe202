import java.util.ArrayList;
public class GumballMachine
{

    private int num_gumballs;
    private int price_gumballs;
    //private boolean all_quarters;
    private int sum_coins = 0;
    private boolean accept_coin; //false if only accept quarter

    public GumballMachine( int size, int price, boolean type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.price_gumballs = price;
        this.accept_coin = type; 
     //   this.all_quarters = true; 
    }

    public void insertCoin( int coin )
    {   
        if (this.accept_coin || coin == 25){
            this.sum_coins = this.sum_coins + coin;
        } else {
         //   this.all_quarters = false ; 
            System.out.println("Please insert only quarters...");
        } 
    }
    
    public void turnCrank()
    {   
        if ( this.sum_coins >= this.price_gumballs ) 
        {
            if ( this.num_gumballs > 0 )
            {      
                this.num_gumballs-- ;
              //  this.all_quarters = true ; // reset to initial
                this.sum_coins = sum_coins - this.price_gumballs ;
                System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert encough coins" ) ;
        }        
    }
}
