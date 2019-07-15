public class Timer {
    int seconds;
    long countSecond;
    //int seconds2 = seconds;

    void addSeconds(int seconds){
        this.seconds+=seconds;
        countSecond += seconds;
    }

    void addMinutes(int minutes){
        this.seconds+=minutes*60;
        countSecond += minutes*60;
    }

    void addHours(int hours){
        this.seconds+=hours*3600;
        countSecond +=hours*3600;
    }

    void step(){
        this.seconds++;
        countSecond ++;
    }

    String getTime(){
        int hours = this.seconds/3600;
        this.seconds = this.seconds%3600;
        int minutes = this.seconds/60;
        this.seconds = this.seconds%60;
//        int secToMin = seconds/60;
//        seconds = seconds%60;
//        int minToH = minutes/60;
//        minutes = minutes%60+secToMin;
//        hours+=minToH;
        return hours +":"+minutes+":"+ this.seconds;
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
