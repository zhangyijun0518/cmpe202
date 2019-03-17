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


           3/16/2019 15:17:29    

               FIVE GUYS                
  Order Number: 2 

  1     LBB                       5.59  
       {{{{ BACON }}}} 
       LETTUCE
       TOMATO 
       ->| G ONION                 
       ->| JALA Grilled                                                                                                  
  1   LTL CAJ                     2.79  
                                        
      Sub. Total:                $8.38  
      Tax:                       $0.75  
      Total:                     $9.13  
                                        
      Cash                      $20.00  
      Change                    $10.87  
  Register: 1     Tran Seq No:   57845  
  Cashier: Sakda* S.                    
    **********************************       
     Don't throw away your receipt!!!        

    Help Five Guys and you could win!                                   
----------------------------------------

Packaging Slip:
----------------------------------------
  Order Number: 2                      
           3/16/2019 15:17:29           
               FIVE GUYS 

  Sandwich# 1                            
  1     LBB                       5.59  
       LETTUCE
       TOMATO 
       ->| G ONION                                                      
       ->| JALA Grilled                                      
       {{{{ BACON }}}}                   
  1   LTL CAJ                     2.79  
  Register: 1     Tran Seq No:   57845  
  Cashier: Sakda* S.                    
----------------------------------------
