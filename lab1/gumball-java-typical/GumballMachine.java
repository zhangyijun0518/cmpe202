public class GumballMachine
{

    private int num_gumballs;
    private int cost_gumballs;
    private boolean all_quarters;
    private Arraylist has_coins = new ArrayList();
    private boolean accept_coin;

    public GumballMachine( int size, int price, boolean type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.cost_gumballs = price;
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
    {
    	if ( this.has_coins.sum() < this.cost_gumballs ) //array not empty
    	{
    	    if(accept_coin || all_quarters)
    	    {
    		if ( this.num_gumballs > 0 )
    		{      // sum of array == cost
    			this.num_gumballs-- ;
    			this.all_quarters = true ; //remove all for arrary
    			this.has_coins.empty() ;
    			System.out.println( "Thanks for your coin.  Gumball Ejected!" ) ;
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
