package Order;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Order {
    private String orderId;
    private String customerName;
    private Map <String, Integer> items = new HashMap<>();
    private BigDecimal totalAmount = BigDecimal.ZERO;

    public Order(String orderId, String customerName){
        this.orderId = orderId;
        this.customerName = customerName;
    }
    public void addItem(String itemName, int quantity, BigDecimal pricePerItem){
        if(quantity > 0){
            items.put(itemName, quantity);
            totalAmount = totalAmount + (pricePerItem * quantity);
        }
    }
    public void removeItem(String itemName, int quantity, BigDecimal pricePerItem){


    }
    public BigDecimal getTotalAmount(){
        return totalAmount;
    }

    public boolean hashItem(String itemName){
        items.contains("itemName");
            return true;
        }
    public void applyDiscount(BigDecimal percentage){

    }
    public String getOrderSummary(){
        return order;
    }
}
