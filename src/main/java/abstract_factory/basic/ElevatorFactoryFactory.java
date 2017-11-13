package abstract_factory.basic;

/**
 * Created by sanguk on 13/11/2017.
 */
public class ElevatorFactoryFactory {
    public static ElevatorFactory getFactory(VendorID vendorID){
        ElevatorFactory factory = null;
        switch (vendorID){
            case LG:
                factory = LGElevatorFactory.getInstance();
                break;
            case HYNDAI:
                factory = HyundaiElevatorFactory.getInstance();
                break;
            case SAMSUNG:
                factory = SamsungElevatorFactory.getInstance();
                break;
        }
        return factory;
    }
}
