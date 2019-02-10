import java.util.ArrayList;
public class GumballMachine
{

    private int num_gumballs;
    private int price_gumballs;
    private boolean all_quarters;
    private ArrayList<Integer> has_coins = new ArrayList<Integer>();
    private boolean accept_coin; //false if only accept quarter

    public GumballMachine( int size, int price, boolean type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.price_gumballs = price;
        this.accept_coin = type; 
        this.all_quarters = true; 
    }

    public void insertCoin( int coin )
    {   
        has_coins.add(coin);
        
        if ( coin == 5 || coin == 10 ) 
        {
            this.all_quarters = false ;   
        } 
    }
    
    public void turnCrank()
    {   int sum = 0;
        for(int i = 0; i < has_coins.size();i++){
            sum = sum + has_coins.get(i);
        }
        
    	if ( sum >= this.price_gumballs ) 
    	{
    	    if(accept_coin || all_quarters)
    	    {
    		if ( this.num_gumballs > 0 )
    		{      
    			this.num_gumballs-- ;
    			this.all_quarters = true ; // reset to initial
    			this.has_coins.clear() ;
    			System.out.println( "Thanks for your coins.  Gumball Ejected!" ) ;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
    		}
            }
            else
            {
                System.out.println( "Please insert only quarters" ) ;
            }
        }
    	else 
    	{
    		System.out.println( "Please insert encough coins" ) ;
    	}        
    }
}
