/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package indvidualproject2;

/**
 *
 * @author willtabor
 * 
 *
 */

import java.util.*;

public class IndvidualProject2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = 1;
        
        String [] name=new String[7];
        char [] finalGrade=new char[7];
        double [] average=new double[7];
        int [] midterm=new int[7];
        
        for(x=0;x<=6;x++){
            System.out.println("Student " + (x+1));
            System.out.print("Enter Students Name: " );
            String n = input.next();
            name[x]=n;
            
            System.out.print("Enter Midterm 1 Score: ");
            int midterm1=input.nextInt();
            System.out.print("Enter Midterm 2 Score: ");
            int midterm2=input.nextInt();
            int midtermHigh= function(midterm1,midterm2);
            midterm[x]=midtermHigh;
            
            System.out.print("Enter Final Grade: ");
            int finalScore = input.nextInt();
            char f = function(finalScore);
            finalGrade[x]=f;
            
            double averageGrade = function(midterm1,midterm2,finalScore);
            average[x] = averageGrade;
        }
        System.out.println("\n");
        System.out.println("Name \t Final \t Midterm \t Average");
        
        for(int a=0;a<7;a++){
            System.out.println(name[a] + "\t"+ finalGrade[a] +"\t"+ midterm[a]+ "\t\t" + average[a]);
        }
    }
    public static char function(int num1) {
    if (num1 >= 90){
        return 'A';}
        else if ( num1 >= 80 && num1 < 90){
            return 'B';}
        else if ( num1 >= 70 && num1 < 80){
            return 'C';}
        else { 
            return 'F'; }
}  
public static int function(int num1, int num2){
    if (num1 > num2){
    return num1;}
    else{
            return num2;}
}
public static double function(int num1, int num2, int num3){
    return((num1 + num2 + num3)/3.0);}
}    