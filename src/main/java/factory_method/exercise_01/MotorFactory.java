package factory_method.exercise_01;

public class MotorFactory {
    public static Motor getMotor(VendorID vendorID){
        Motor motor = null;
        switch (vendorID){
            case LG:
                motor = new LGMotor();
                break;
            case HYUNDAI:
                motor = new HyundaiMotor();
                break;
        }
        return motor;
    }
}
