package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
;   public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }

    private static String getDurationString(long minutes, long seconds){
        if (minutes < 0 || (seconds <0) || (seconds>59)){
            return INVALID_VALUE_MESSAGE;
        }

        long hr = minutes/60;
        long remainingMinutes = minutes % 60;

        String hoursString = hr + "h ";
        if (hr < 10 ){
            hoursString = "0"+ hoursString;
        }
        String minString = remainingMinutes + "m ";
        if (remainingMinutes < 10 ){
            minString = "0"+ minString;
        }
        String secString = seconds + "s ";
        if (seconds < 10 ){
            secString = "0"+ secString;
        }
        return hoursString + minString  + secString ;


//        int totalSeconds = (minutes * 60) + seconds;
//        int hr = totalSeconds / 3600;
//        int min = (totalSeconds % 3600)/60;
//        int sec = (totalSeconds % 3600) % 60;
//
//        System.out.println(hr+"h " + min+"m " + sec+"s" );
//        return hr;
    }
    private static String getDurationString(long seconds){
        if (seconds <0 ){
            return INVALID_VALUE_MESSAGE;
        }
        long min = seconds / 60;
        long remainingSec = seconds % 60;

        return getDurationString(min, remainingSec);
    }
}
