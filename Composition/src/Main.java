public class Main {
    public static void main(String[] args) {
        Room room = new Room(3,1,new Lightswitch(),new Table(), new Chair[]{new Chair()});
        
        room.getChairs();

        room.switchLight();
        room.switchLight();
        room.switchLight();
    }
}
