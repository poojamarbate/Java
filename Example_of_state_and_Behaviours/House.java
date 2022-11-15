public class House {
    String address;
    String color;
    double area;

    void openDoor() {
        System.out.println("door openDoor");
    }

    void closeDoor() {
        System.out.println("door closeDoor");
    }

    public static void main(String[] args) {
        House house = new House();
        house.openDoor();
    }

}
