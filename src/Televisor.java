public class Televisor {
    boolean power;

    void turnOn (){
        power = true;
    }

    void turnOff (){
        power = false;
    }

    void showStatus (){
        System.out.println("Status TV: " + power);
    }
}
