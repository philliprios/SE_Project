
package Classes;

public class Item {
    private int itemId;
    private String name;
    private double price;
    private double quantity;
    private double amount;
    private int store_id;
    public int item_no;
    
    public Item(){
        this.itemId = 0;
    }
    public Item(int id){
        setItemId(id);
    }
    
    public void setItemId(int id){
       itemId = id;
    }
    
    public int getItemId(){
        return itemId;
    }
} 