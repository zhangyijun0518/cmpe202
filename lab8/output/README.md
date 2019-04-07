# CMPE 202 - LAB #8 - Input Mask Design Patterns

### Three pattens

1. [Composite]     
- The display of screen implemented by the display of three components (CreditCardNum, CreditCardExp, CreditCardCVC);
- There are spaces displayed between different components;

2. [Chain_of_Responsibility]
- Three components are also the three handlers of the digit input event;    
- When the num of digits received by CreditCardNum reaches 12, the event will be passed to the next handler which is CreditCardExp;    
- When the num of digits received by CreditCardExp reaches 4, the event will be passed to the next handler which is  CreditCardCVC;    
- When the num of digits received by CreditCardCVC reaches 3, no more handler to receive digit input.

   [Chain_of_Responsibility] - reverse
- Reverse the handlers in chain to handle the backspace input event; 
   
- When the num of digits the digit in CreditCardCVC become 0, the backspace event will be passed to the prev handler which is  CreditCardExp; 
- When the num of digits in CreditCardExp become 0, the backspace event will be passed to the prev handler which is CreditCardNum;   


3. [Decorator]
- Decorate the display of CreditCardNum component with the logic that a space will be added to display when it receives 4 or 8 or 12 digits;
- Decorate the display of CreditCardExp component with the logic that a "/" will be added to display when it receives 2 digits;
