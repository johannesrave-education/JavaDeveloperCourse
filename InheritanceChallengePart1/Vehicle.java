public class Vehicle {
    private int speed;
    private String direction;
    
    public Vehicle(){
        this(100, "North");
    }

    public Vehicle(int speed, String direction) {
        this.speed = speed;
        this.direction = direction;
    }

    void move(){
    }

    void accelerate(){
    }

    void decelerate(){
    }
    
}
