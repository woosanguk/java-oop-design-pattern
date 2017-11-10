package singleton.basic;

/**
 * Created by sanguk on 10/11/2017.
 */
public class Main {
    private static final int User_NUM = 5;
    public static void main(String args[]) {
//        User[]  users1 = new User[User_NUM];
//        for (int i = 0; i < User_NUM; i++){
//            users1[i] = new User((i + 1) + "-user");
//            users1[i].print();
//        }
//        System.out.println("");
        UserThread[]  users2 = new UserThread[User_NUM];
        for (int i = 0; i < User_NUM; i++){
            users2[i] = new UserThread((i + 1) + "-thread");
            users2[i].start();
        }
    }
}
