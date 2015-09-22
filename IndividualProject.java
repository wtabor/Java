/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package individualproject;

/**
 *
 * @author willtabor
 */

import java.util.*;

public class IndividualProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Will Tabor");
        System.out.println("UFID: 1161-1459");
        
        Scanner input = new Scanner(System.in);
            System.out.print("Enter a UFID without a dash:");
                int u=input.nextInt();
                
                int f =u/1000000;
                int l=u%10000;
                
                System.out.println("First two digits of the entered UFID: "+f);
                System.out.println("Last four digits of the entered UFID: "+l);
                
                if (f>=50 && l>=50){
                    int avg= f*l/2;
                    System.out.println("Average of first two digits and last two digits= "+avg);}
                
                else if (f>=50 && l<50){
                    int firstsub=f-l;
                        int k =2;
                        int sum1=0;
                        while (k<=firstsub){
                            sum1+=k; //sum = 1 //sum 
                            k+=2;
                        }
                        System.out.println("Sum of the even numbers from 2 to larger number - smaller number = "+sum1);}
                
                else if (f<50 && l>=50){
                    int secondsub=l-f;

                        int m =2;
                        int sum2=0;
                        while (m <= secondsub){
                            sum2+=m; //sum = 1 //sum 
                            m+=2;}
                        System.out.println("Sum of the even numbers from 2 to larger number - smaller number = "+sum2);}
                
                else if (f<50 && l<50){
                    int under= f*l;
                    
                    //System.out.println(under);
                int y=under/100;
                int z=under/10;
                int t=z%10;
                int a=under%10;
                int sumunder = y+t+a;
                System.out.println("Sum of the first two digits x last two digits= "+sumunder);}
                
                
                Scanner scan = new Scanner(System.in);
                String name; 
                System.out.print("Enter your name:");
                name = scan.nextLine();
                
                
                
                switch(name){
                    case "Will": 
                        System.out.println("Will Tabor");
                        break;
                    case "Tabor":
                        System.out.println("Tabor");
                        break;
                    default:
                        System.out.println("None");
                        break; 
                }
                }
                        
                
                
                }
    
    

