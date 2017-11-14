package command.exercise_01;

/**
 * Created by sanguk on 14/11/2017.
 */
public class TV {
    private boolean powerOn = false;
    private boolean muteOn = false;

    public void power(){
        powerOn =! powerOn;
        if(powerOn){
            System.out.println("Power ON");
        }else {
            System.out.println("Power OFF");
        }
    }

    public void mute(){
        muteOn =! muteOn;
        if(muteOn){
            System.out.println("Mute ON");
        }else {
            System.out.println("Mute OFF");
        }
    }
}
