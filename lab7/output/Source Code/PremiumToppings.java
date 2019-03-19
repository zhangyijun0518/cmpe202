public class PremiumToppings extends LeafDecorator  //changed name
{
    private String[] options ;
    
    
    public PremiumToppings( String d )
    {
        super(d) ;
    }
    
    // premium topping +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0)
            this.price += options.length * 1.00 ;
            
        for ( int i = 0; i<options.length; i++ )
        {   
            if ( "Marinated Tomatoes".equals(options[i]) ) {
                this.price += 2.00 ;  //added
            }
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}