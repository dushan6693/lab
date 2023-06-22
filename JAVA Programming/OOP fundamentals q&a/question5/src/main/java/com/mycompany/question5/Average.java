package com.mycompany.question5;

public class Average {
    public double average(int[] arr){
        int avg=0;
       
        for(int x=0;x<arr.length;x++){
            int cal;
            avg += arr[x];
        }
        return avg/20.0;
    }
}
