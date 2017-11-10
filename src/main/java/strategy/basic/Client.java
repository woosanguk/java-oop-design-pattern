package strategy.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        taekwonV.setAttackStrategy(new MissileStrategy());
        taekwonV.setMovingStrategy(new WalkingStrategy());
        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();
        System.out.println();
        atom.setAttackStrategy(new PunchStrategy());
        atom.setMovingStrategy(new FlyingStrategy());
        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
