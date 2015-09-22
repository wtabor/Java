/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment.pkg9;

/**
 *
 * @author willtabor
 */
public class Assignment9 {
    

    public static void main(String[] args) {
        
System.out.println("The maximum of 3 and 8 is " + function(3, 8));
System.out.println("The average of 3.0 and 8.0 is " + function(3.0, 8.0));
System.out.println("The minimum of 3, 8, and 10 is " + function(3, 8, 10));
System.out.println("The average of 3, 8, 10 and 12 is " + function(3, 8, 10, 12));
        
}
public static double function (int num1, int num2) {
    int result;
    if (num1>num2){
        result = num1;}
    else {
        result = num2;}
    return result; 
}
public static double function (double num1, double num2) {
return (num1+num2)/2.0;
}
public static double function (int num1, int num2, int num3) {
int result;
    if (num1<=num2 && num1<=num3){
        result = num1;}
    else if (num2<=num3 && num2<=num1){
        result = num2;}
    else {
        result = num3;}
    return result;}
public static double function (int num1, int num2, int num3, int num4){
    return (num1+num2+num3+num4)/4.0;}
}
    
    
