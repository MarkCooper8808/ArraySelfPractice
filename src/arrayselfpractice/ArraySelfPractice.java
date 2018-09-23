/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayselfpractice;

/**
 *
 * @author User
 */
public class ArraySelfPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] myStringArray = new String[5];
        System.out.println(myStringArray[2]);
        
        String[] randomArray = {"random string one","random string two"};
        System.out.println(randomArray[0]);
        
        for (int i = 0; i < 2; i++) {
            System.out.println(randomArray[i]);
        }
        
    }   
    
}
