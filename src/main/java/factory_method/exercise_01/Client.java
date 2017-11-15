package factory_method.exercise_01;

public class Client {
    public static void main(String args[]) {
        Motor lgMotor = MotorFactory.getMotor(VendorID.LG);
        ElevatorController controller1 = new ElevatorController(1, lgMotor);
        controller1.gotoFloor(5);
        controller1.gotoFloor(3);

        Motor hyundaiMotor = MotorFactory.getMotor(VendorID.HYUNDAI);
        ElevatorController controller2 = new ElevatorController(1, hyundaiMotor);
        controller2.gotoFloor(4);
        controller2.gotoFloor(6);
    }
}
