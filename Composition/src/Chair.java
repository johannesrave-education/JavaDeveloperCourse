public class Chair {
    private int legs;

    public Chair() {
        this.legs = 4;
    }

    public void breakLeg(){
        legs = legs > 0 ? legs-1 : 0;
    }
}
