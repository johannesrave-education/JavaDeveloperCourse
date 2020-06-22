import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        BillsBurger burger = new BillsBurger();


        burger.addExtra("bacon");
        burger.addExtra("lettuce");
        burger.addExtra("roquefort");
        burger.addExtra("bacon");
        burger.addExtra("lettuce");
        burger.addExtra("mustard");
        burger.addExtra("cheese");
        burger.addExtra("ketchup");
        burger.getTotal();
        
        BillsHealthyBurger illusionaryBurger = new BillsHealthyBurger();

        illusionaryBurger.addExtra("bacon");
        illusionaryBurger.addExtra("lettuce");
        illusionaryBurger.addExtra("roquefort");
        illusionaryBurger.addExtra("bacon");
        illusionaryBurger.addExtra("lettuce");
        illusionaryBurger.addExtra("mustard");
        illusionaryBurger.addExtra("cheese");
        illusionaryBurger.addExtra("ketchup");
        illusionaryBurger.addExtra("fries");
        illusionaryBurger.addExtra("drink");
        illusionaryBurger.addExtra("eternal youth");
        illusionaryBurger.getTotal();
        
        BillsBurgerDeluxe deluxeBurger = new BillsBurgerDeluxe();
        deluxeBurger.getTotal();
        
    }
}

class BillsBurger{
    private final Bread bread;
    private final Meat meat;
    protected final Map<String,Double> options;
    private ArrayList<String> extras;
    protected int numberOfExtras;

    public BillsBurger(Bread bread, Meat meat) {
        this.bread = bread;
        this.meat = meat;
        this.extras = new ArrayList<String>();
        this.numberOfExtras = 4;
        System.out.printf("\n***\n%s burger on %s bread ordered.\n", 
                this.meat.getName(), this.bread.getName());

        options = Map.of(
                "tomato", .50d,
                "lettuce", .50d,
                "cheese", 1.00d,
                "bacon", 1.50d,
                "mushroom", 1.00d,
                "fries", 2.50d,
                "drink", 1.50d,
                "mustard", .50d,
                "ketchup", .50d
        );
        
        printPrices();
    }
    
    public BillsBurger() {
        this(new Bread("wheat"), new Meat("kangaroo"));
    }
    
    public void printPrices(){
        System.out.println("\nPrices for extras to add to your burger:");
        String format = "%-20s  %5s €\n";
        for (Map.Entry<String,Double> extra: options.entrySet()){
            System.out.printf(format, extra.getKey(), extra.getValue());
        }
    }

    public void addExtra(String extra){
        System.out.printf("\nYou would like to add %s to your burger:", extra);
        System.out.println();
        
        if (numberOfExtras<=extras.size()){
            System.out.printf("You have added the maximum of 4 extras already.\n");
        } else if (!options.containsKey(extra.toLowerCase())){
            System.out.printf("Unfortunately, %s isn't on our menu.\n", extra);
        } else if (extras.contains(extra.toLowerCase())){
            System.out.printf("You have already added %s to your burger.\n", extra);
        } else {
            System.out.printf("%s added to order for %s €\n", extra, options.get(extra));
            extras.add(extra.toLowerCase());
        }
    }

    public double getTotal(){
        System.out.println("\nPrices for base burger and extras:");
        
        String format = "%-15s  %5s €\n";
        
        double total = bread.getPrice() + meat.getPrice();
        System.out.printf(format, "base burger", total);
        for (String extra:extras){
            System.out.printf(format, extra, options.get(extra));
            total += options.get(extra);
        }
        
        System.out.println("The total price of your burger is "+total+"€.");
        return total;
    }
    
}

class BillsHealthyBurger extends BillsBurger{
    public BillsHealthyBurger() {
        super(new Bread("rye"), new Meat("kangaroo"));
        numberOfExtras = 6;
    }
}

class BillsBurgerDeluxe extends BillsBurger{
    public BillsBurgerDeluxe(){
        super(new Bread("wheat"), new Meat("elephant"));
        addExtra("fries");
        addExtra("drink");
        numberOfExtras = 2;
    }
}


abstract class FoodItem {
    
    private final String name;
    private final double price;
    
    public FoodItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return this.price;
    }
}

class Bread extends FoodItem{

    public Bread(String name) {
        super(name, 1.0d);
    }
}

class Meat extends FoodItem{

    public Meat(String name) {
        super(name, 3.0d);
    }
}