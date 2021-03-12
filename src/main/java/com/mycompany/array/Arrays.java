/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.array;

/**
 *
 * @author prudvi
 */
public class Arrays {
    public static double getLowest(double[] total){
        double lowNum =20;
        for(int i =0; i<total.length; i++){
           if(total[i]< lowNum){
               lowNum= total[i];
           }         
        }
        return lowNum;
    }
     public static double getHighest(double[] total){
        double HighNum =0;
        for(int i =0; i<total.length; i++){
           if(total[i]> HighNum){
               HighNum= total[i];
           }
          
        }  
        return HighNum;
    }
    public static double getTotal(double[] total){
        double sum =0;
        for(int i=0; i<total.length; i++){
            sum +=total[i];
            
        }
        return sum;
    }
    public static double getAverage(double[] total){
        double average =0;
        double total_number=0;
        for(int i =0; i<total.length; i++){
            total_number += total[i]; 
        }
        average = total_number/total.length;
        return average;
    }
    public static void main(String[] args) {
        double[]  total  = {1.5, 2.2,3.5,4.6};
        System.out.println("The Lowest number of all the numbers is: " + getLowest(total));  
        
        System.out.println("The Highest number of all the numbers is: " + getHighest(total));
        
        
        System.out.println("The sum of all the numbers is: " + getTotal(total));
        
         System.out.println("The Average of all the number is : " + getAverage(total));
       
                
    }
    
}
