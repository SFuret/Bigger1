/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity1_biggerof3;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Act1_Biggerof3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int big;
                 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();
        
        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();
        
        
        System.out.println("Write the thrid number");
        int variable_3 = scanner.nextInt();
               
        
        if((variable_1 > variable_2) && (variable_1 > variable_3)){
            big= variable_1;
            
            System.out.println("The biggest number is: " + big);            
        }
        
        if((variable_2 > variable_1) && (variable_2 > variable_3)){
            big= variable_2;
            System.out.println("The biggest number is:" + big );        
            
        }
        
        if((variable_3 > variable_2) && (variable_3 >  variable_1)){
            big= variable_3;
            System.out.println("The biggest number is:" + big);  
            
    }
} 

    
}
