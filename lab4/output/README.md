# CMPE 202 - LAB 4 - Din Tai Fung Design Patterns

### CRC Cards

See [Din Tai Fung - CRC Cards.png]()

{
    
    Used State Pattern & Chain of Responsibility Pattern;   
    
}

###State Pattern: 
TableState represent the states of each Table
ReservationState represent the states of each Reservation

###Chain of Responsibility Pattern
ReservationHandler as Handler interface
Each Reservation Object will be the implementation of Handler
WaitList is the chain of Handlers
