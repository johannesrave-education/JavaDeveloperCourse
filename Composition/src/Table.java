public class Table {
    private int legs;

    public Table() {
        this.legs = 4;
    }
    
    public void breakLeg(){
        legs = legs > 0 ? legs-1 : 0;
    }
}
