# CMPE 202 - LAB #8 - Input Mask Design Patterns

### Two pattens

1. [Composite]     
- The display of screen implemented by the display of three components (CreditCardNum, CreditCardExp, CreditCardCVC);
- There are spaces displayed between different components;
- The display of CreditCardNum components contains the logic that a space will be added to display when it receives 4 or 8 or 12 digits;
- The display of  CreditCardExp components contains the logic that a "/" will be added to display when it receives 2 digits;

2. [Chain_of_Responsibility]
- Three components are also the three handlers of the digit input event;    
- When the num of digits received by CreditCardNum reaches 12, the event will be passed to the next handler which is CreditCardExp;    
- When the num of digits received by CreditCardExp reaches 4, the event will be passed to the next handler which is  CreditCardCVC;    
- When the num of digits received by CreditCardCVC reaches 3, no more handler to receive digit input.
