public class Car extends Vehicle {
    int gear;

    public Car() {
    }

    public Car(int speed, String direction){
        super(speed, direction);
    }
    
    void pushGasPedal(){
        super.accelerate();
    }
    
    void pushBrake (){
        super.decelerate();
    }
    
    void changeGear(int gear){
        this.gear = gear;
    }
}
