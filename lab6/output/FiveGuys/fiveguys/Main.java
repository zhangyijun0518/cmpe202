package fiveguys;

public class Main
{
    public static void main(){
        BuildOrder order = new BuildOrder();
        
        Burger burger = new Burger("  LBB  ",5.99);
        burger.addToppings(new Toppings("BACON",Position.Bottom));
        burger.addToppings(new Toppings("LETTUCE",Position.Top));
        burger.addToppings(new Toppings("TOMATO",Position.Top));
        burger.addToppings(new Toppings("G ONION",Position.onMeat));
        burger.addToppings(new Toppings("JALA Grilled",Position.onMeat));
        
        Fries fries = new Fries("LTL CAJ", 2.79);
        
        order.addItem(burger);
        order.addItem(fries);
        
        order.paid(20.00);
        
        ReceiptPrint rp = new ReceiptPrint(order);
        PackingSlipPrint psp = new PackingSlipPrint(order);
        
        System.out.println("Receipt:");
        System.out.println(rp.print());
        System.out.println("\nPacking Slip:");
        System.out.println(psp.print());
    }
}
