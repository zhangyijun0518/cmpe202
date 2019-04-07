/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private NumDecorator numDecor;
    private ExpDecorator expDecor;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        numDecor = new NumDecorator(num);
        expDecor = new ExpDecorator(exp);

        screen.addSubComponent(numDecor);
        screen.addSubComponent(expDecor);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if (ch.matches("x|X") && count > 0){
            count--;
            screen.key(ch, count);
        }
        else if (ch.matches("\\d") && count < 23){
            count++;
            screen.key(ch, count);
        }
        System.err.print(count);
    }

}

