package abstract_factory.basic;


/**
 * Created by sanguk on 13/11/2017.
 */
public class DoorFactory {

    public static Door createDoor(VendorID vendorID) {
        Door door = null;
        switch (vendorID){
            case LG:
                door = new LGDoor();
                break;
            case HYNDAI:
                door = new HyundaiDoor();
                break;
        }
        return door;
    }
}
