import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
    }
}

class BillsBurger{
    private Bread bread;
    private Meat meat;
    private ArrayList<Extra> extras = new ArrayList<>();
    
    public BillsBurger() {
    }

    public BillsBurger(Bread bread, Meat meat) {
        this.bread = bread;
        this.meat = meat;
    }
    
    public void addExtra(Extra extra){
        if (extras.size()<4) {
            extras.add(extra);
            System.out.println("Adding " + extra.toString() + " for "+extra.getPrice()+"€ to your Burger.");
        }
    }

    public double getTotal(){
        double total = bread.getPrice() + meat.getPrice();
        for (Extra extra: extras){
            total += extra.getPrice();
        }
        System.out.println("The total price of your burger is "+total);
        return total;
    }
    
    public void printIngredients(){
        
    }
}

class BillsHealthyBurger extends BillsBurger{
    Extra[] extras = new Extra[6];   

    public BillsHealthyBurger() {
        super();
    }
}

class BillsBurgerDeluxe extends BillsBurger{
    Fries fries = new Fries();
    Drink drink = new Drink();
    Extra[] extras = new Extra[]{fries, drink};
    public BillsBurgerDeluxe(){}
}


abstract class FoodItem {
    private double price = 2.0d;
    
    public FoodItem(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    };
}

class Bread extends FoodItem{

    public Bread(double price) {
        super(1.0d);
    }
}

class Meat extends FoodItem{

    public Meat() {
        super(3.0d);
    }
}

abstract class Extra extends FoodItem{
    
    public Extra(double price) {
        super(price);
    }
}

class Tomato extends Extra{
    public Tomato(double price) {
        super(0.50d);
    }
}

class Lettuce extends Extra{
    public Lettuce(double price) {
        super(0.50d);
    }
}

class Cheese extends Extra{
    public Cheese(double price) {
        super(1.50d);
    }
}

class Mustard extends Extra{
    public Mustard(double price) {
        super(0.50d);
    }
}

class Ketchup extends Extra{
    public Ketchup(double price) {
        super(0.50d);
    }
}

class Fries extends Extra{
    public Fries() {
        super(2.50d);
    }
}

class Drink extends Extra{
    public Drink() {
        super(2.50d);
    }
}