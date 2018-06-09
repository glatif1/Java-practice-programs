package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(3650));
        System.out.println(getDurationString(59,9));

    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes< 0 || (seconds< 0 || seconds > 59))
            return "Invalid menu";
        else{
            double hours = minutes/60;
            double remainingMin = minutes -(hours*60);
            return hours+"h "+remainingMin+"m "+seconds+"s";
        }

    }

    public static String getDurationString(int seconds){
        if(seconds < 0)
            return "Invalid menu";
        else{
            int min = seconds/60;
            int remainingSec = seconds-min*60;
            return getDurationString(min,remainingSec) + "";
        }

    }


}
