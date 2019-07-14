public class Time {

    int showHour( int lenght1, int lenght2, int lenght3){
        int hour = (lenght1+lenght2+lenght3)/60;
        int min = (lenght1+lenght2+lenght3)%60;
        //System.out.println("You will need: " + hour +"h " + min +"min");
        return hour;
    }

    int showMin( int lenght1, int lenght2, int lenght3){
        int min = (lenght1+lenght2+lenght3)%60;
        //System.out.println("You will need: " + hour +"h " + min +"min");
        return min;
    }
}
