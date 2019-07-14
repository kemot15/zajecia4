public class Timer {
    int seconds;
    int minutes;
    int hours;
    long countSecond;

    void addSeconds(int seconds){
        this.seconds+=seconds;
        getSeconds();
    }

    void addMinutes(int minutes){
        this.minutes+=minutes;
    }

    void addHours(int hours){
        this.hours+=hours;
    }

    void step(){
        this.seconds++;
    }

    String getTime(){
        int secToMin = seconds/60;
        seconds = seconds%60;
        int minToH = minutes/60;
        minutes = minutes%60+secToMin;
        hours+=minToH;
        return hours +":"+minutes+":"+seconds;
    }

    long getSeconds(){
        return countSecond;
    }


//    String getTime() - która zwraca czas w formacie HH:mm:ss, gdzie HH to godziny, mm to minuty, a ss to sekundy,
//    long getSeconds() - która zwraca łączną liczbę sekund, którą zmierzył dany stoper.

//    addSeconds(int seconds) - która dodaje do aktualnie odmierzonego czasu wskazaną liczbę sekund,
//    addMinutes(int minutes) - która dodaje do aktualnie odmierzonego czasu wskazaną liczbę minut,
//    addHours(int hours) - która dodaje do aktualnie odmierzonego czasu wskazaną liczbę godzin,
//    step() - która dodaje do aktualnie odmierzonego czasu jedną sekundę.
}
