/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment.pkg11;

/**
 *
 * @author willtabor
 */
public class Assignment11 {

    public static void main(String[] args) {

        String language[] = {"English","Thai","French","Japanese","German","Russian","Chinese","Ganda","Dutch","Persian","Hindi","Korean"};
        //int language1[] = (String)language;
        
        String stress[] = new String[language.length];
     
        for(int i=0;i<stress.length;i+=2){
            stress[i] = language[i*4];}
        
        for(int i=1;i<stress.length;i+=2){
            stress[i] = language[i*4];}
        
        
        String syllable[] = new String[language.length];
     
        for(int i=2;i<syllable.length;i+=2){
            syllable[i] = language[i*2];}
        
        String moral[] = new String[language.length];
     
        for(int i=3;i<language.length;i++){
            moral[i] = language[i+=4];}
        

        System.out.println(stress[0]+"\t\t"+syllable[0]+"\t\t"+moral[0]);
        System.out.println(stress[1]+"\t\t"+syllable[1]+"\t\t"+moral[1]);
        System.out.println(stress[2]+"\t\t"+syllable[2]+"\t\t"+moral[2]);
        System.out.println(stress[3]);
        System.out.println(stress[4]);
        System.out.println(stress[5]);
    //}
        
        
        //System.out.println(myArray[1]);
        
        //int[] myOdd = new int[4];
        
        //for(int i=0;i<myOdd.length;i++){
            //myOdd[i] = myArray[i*2];
            //System.out.println(myOdd[i]);
        //}
        
        
        
        //char[] letterGrade1 = {'A','C','D','A','B','C','A'};
        
        //System.out.println(letterGrade1[0]);
        
        //char[] letterGrade2 = new char[letterGrade1.length];
        
        //letterGrade2 = letterGrade1;
        
        //for(int i = 0; i < letterGrade2.length;i++)
        //{

        //System.out.print(letterGrade2[i]+" ");}
        
        //for(int i = 0; i < letterGrade2.length;i++)
        //{

        //System.out.print(letterGrade1[i]+" ");}

        }
    }
    

