# CMPE 202 - LAB 6 - Five Guys Burger Design Patterns

### Design Patterns Used

- [Composite]: Items in order are implemented by using Composite Pattern;
- [Decorator]: Decorated the output format of different toppings according to different position; 
- [Strategy]: Used different print strategy in Receipt and Packing Slip. 

### Demo Output

```
Receipt:
----------------------------------------
               FIVE GUYS                
            BURGER AND FRIES            
            STORE # CA-1294             
         5353 ALMADEN EXPY N60          
           SAN JOSE, CA 95118           
            (P) 408-274-9300            


          03/16/2019 05:40:29           

               FIVE GUYS                
  Order Number: 3
  1     LBB                       5.99
       {{{{ BACON }}}}
       LETTUCE
       TOMATO
       ->|G ONION
       ->|JALA Grilled
  1   LTL CAJ                     2.79
      Sub. Total:                 8.78
      Tax:                        0.79
      Total:                      9.57

      Cash $20                  $20.00
      Change                    $10.43
  Register:1     Tran Seq No:    57845
  Cashier: Sakda* S.
  ************************************  
    Don't throw away your receipt!!!    

   Help Five Guys and you could win!    
----------------------------------------


Packing Slip:
----------------------------------------
  Order Number: 3
          03/16/2019 05:40:29           
               FIVE GUYS                


  Sandwich# 1
  1     LBB                       5.99
       LETTUCE
       TOMATO
       ->|G ONION
       ->|JALA Grilled
       {{{{ BACON }}}}
  1   LTL CAJ                     2.79
  Register:1     Tran Seq No:    57845
  Cashier: Sakda* S.
----------------------------------------