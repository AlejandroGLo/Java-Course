package OOP;


class Product{
    private int itemNum;
    private String name;
    private double price;
    private int quantity;

    public Product(int itemno){
        itemNum = itemno;
    }
    public Product(int itemno, String name){
        itemNum = itemno;
        this.name=name;
    }
    
    public Product(int itemno, String name, double p, int q){
        itemNum = itemno;
        this.name=name;
        setPrice(p);
        setQuantity(q);
    }

    public int getItemNum(){
        return itemNum;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setPrice(double p){
        this.price=p;
    }
    public void setQuantity(int q){
        this.quantity=q;
    }
}

public class Challenge2 {
    public static void main(String args[]){
        Product productInfo = new Product(0, null, 0, 0);
        productInfo.setPrice(49.99);
        productInfo.setQuantity(10);

        System.out.println("Product Price: " + productInfo.getPrice());
        System.out.println("Product Quantity: " + productInfo.getQuantity());
    }
    
}
