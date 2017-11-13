package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class MotorFactory {
    public static Motor createMotor(VendorID vendorID){
        Motor motor = null;
        switch (vendorID){
            case LG:
                motor = new LGMotor();
                break;
            case HYNDAI:
                motor = new HyundaiMotor();
                break;
        }
        return motor;
    }
}
