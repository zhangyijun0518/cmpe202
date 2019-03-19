  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
      //  order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
      //  order.addChild(new Leaf("The Purist", 8.00 ));
        
        // first burger
        CustomBurger customBurger1 = new CustomBurger( "\nBuild Your Own Burger" ) ;
        // choose burger
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // cheese free
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapello Jack"} ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        //  premium cheese 
        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions( pco ) ;
        pc.wrapDecorator( c ) ;
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.00
        PremiumToppings p = new PremiumToppings( "Premium Topping Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // Bun
        Bun bun = new Bun( "Bun Options" ) ;
        String[] buno = { "Ciabatta(Vegan)" } ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( p ) ;
         // side
        Side side = new Side( "Side Options" ) ;
        String[] sideo = { "Shoestring Fries" } ;
        side.setOptions( sideo ) ;
        side.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( side ) ;
        customBurger1.addChild( b ) ;
        customBurger1.addChild( c ) ;
        customBurger1.addChild( pc ) ;
        customBurger1.addChild( s ) ;
        customBurger1.addChild( t ) ;
        customBurger1.addChild( p ) ;
        customBurger1.addChild( bun ) ;
        customBurger1.addChild( side ) ;
        
        // second burger
        CustomBurger customBurger2 = new CustomBurger( "\nBuild Your Own Burger" ) ;
        // choose burger
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        // cheese free
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta"} ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        //  premium cheese 
        PremiumCheese pc2 = new PremiumCheese("Premium Cheese Options");
        String[] pco2 = { "Fresh Mozzarella" } ;
        pc2.setOptions( pco2 ) ;
        pc2.wrapDecorator( c2 ) ;
        // 1 sauce free, extra +.75
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( pc2 ) ;
        // toppings free/////////
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts"} ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        // premium topping +1.00
        PremiumToppings p2 = new PremiumToppings( "Premium Topping Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        // Bun
        Bun bun2 = new Bun( "Bun Options" ) ;
        String[] buno2 = { "Gluten-Free Bun" } ;
        bun2.setOptions( buno2 ) ;
        bun2.wrapDecorator( p2 ) ;
         // side
        Side side2 = new Side( "Side Options" ) ;
        String[] sideo2 = { "Shoestring Fries" } ;
        side2.setOptions( sideo2 ) ;
        side2.wrapDecorator( bun2 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( side2 ) ;
        
        
        // Add 2 Custom Burgers to the Order
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/