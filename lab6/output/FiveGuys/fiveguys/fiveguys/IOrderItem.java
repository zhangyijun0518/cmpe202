package fiveguys.fiveguys;

public interface IOrderItem {

    String getDescription();

    default Integer getQuantity() { return null; };

    default Double getPrice() { return null; };

}
