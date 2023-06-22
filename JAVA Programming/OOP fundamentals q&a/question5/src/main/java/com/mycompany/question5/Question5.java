package com.mycompany.question5;
import java.util.Scanner;
public class Question5 {

    public static void main(String[] args) {
       int[] arr = new int[20];
       Scanner scanner=new Scanner(System.in);
       
        for(int x=0;x<20;x++){
            arr[x]= scanner.nextInt();
            
            if(arr[x]==-1){
                System.out.println("Data getting stoped !");
                break;
            }
        }
       Average average = new Average();
       
     
      
        System.out.println(average.average(arr));
        
    }
    
}

