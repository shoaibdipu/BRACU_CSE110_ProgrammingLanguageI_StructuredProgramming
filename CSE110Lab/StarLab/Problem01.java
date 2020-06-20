/*PROBLEM 1) Number Line
 Sample input:
 6
 Sample output
 123456*/

import java.util.Scanner;

public class Problem01{
    public static void main (String[]args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter column number: ");
        int column=sc.nextInt();
        
        for (int cc=1; cc<=column; cc++){
            System.out.print(cc);
        }
    }
}