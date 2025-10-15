import House;
import Room;

public class Main {
    public static void main(String[] args) {
        
        House h1 = new House("Casita");
        h1.addRoom("Comedor", 78);
        
        h1.showRooms();
    }
}
