public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.step(); //0:0:1
        timer.step(); //0:0:2
        timer.step(); //0:0:3
        timer.addSeconds(12); //0:0:15
        timer.addMinutes(3); //0:3:15
       // timer.addHours(2);

        String time = timer.getTime();
        long  sec = timer.getSeconds();
        System.out.println("Zmierzony czas: " + time); //Zmierzony czas 0h:3m:15s
        System.out.println("Ilosc sekund: "+ sec);
    }
}