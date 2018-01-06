package saksfifth.framework.utils;

public class Helper {

    /**   delay for a certain time**/
    public static void delayFor(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}