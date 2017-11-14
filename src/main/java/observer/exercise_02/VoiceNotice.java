package observer.exercise_02;

/**
 * Created by sanguk on 14/11/2017.
 */
public class VoiceNotice implements Observer {
    private ElevatorController controller;
    public VoiceNotice(ElevatorController controller){
        this.controller = controller;
    }
    public void update() {
        System.out.println("VoiceNotice : " + this.controller.getCurFloor());
    }
}
