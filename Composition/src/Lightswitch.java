public class Lightswitch {
    private boolean switched;

    public Lightswitch() {
        this(false);
    }

    public Lightswitch(boolean switched) {
        this.switched = switched;
    }
    
    public void flipSwitch(){
        this.switched = !this.switched;
        System.out.println("Light switched is "+ isSwitched());
    }

    public boolean isSwitched() {
        return switched;
    }
}
