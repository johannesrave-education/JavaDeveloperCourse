public class Room {
    private int windows;
    private int doors;
    private Lightswitch lightswitch;
    private Table table;
    private Chair[] chairs;

    public Room(int windows, int doors, Lightswitch lightswitch, Table table, Chair[] chairs) {
        this.windows = windows;
        this.doors = doors;
        this.lightswitch = lightswitch;
        this.table = table;
        this.chairs = chairs;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public Lightswitch getLightswitch() {
        return lightswitch;
    }

    public Table getTable() {
        return table;
    }

    public Chair[] getChairs() {
        System.out.println("Number of chairs: " + chairs.length);
        return chairs;
    }
    
    public void switchLight(){
        this.lightswitch.flipSwitch();
    }
}
