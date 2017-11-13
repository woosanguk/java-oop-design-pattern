package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class Client {
    public static void main(String args[]) {
        String vendorName = "Samsung";
        VendorID vendorID;
        if (vendorName.equalsIgnoreCase("LG")) {
            vendorID = VendorID.LG;
        } else if (vendorName.equalsIgnoreCase("Samsung")) {
            vendorID = VendorID.SAMSUNG;
        } else {
            vendorID = VendorID.HYNDAI;
        }

        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();

        motor.move();
    }
}
