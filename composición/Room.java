public class Room {
    private String name;
    private double area;

    Room(String name, double area){
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return this.name;
    }

    public double getArea() {
        return this.area;
    }
}
