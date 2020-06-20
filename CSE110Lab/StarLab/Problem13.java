/*PROBLEM 13) Palindrome
Sample input:
5
Sample output
123454321 
*/

import java.util.Scanner;

public class Problem13{
    public static void main(String[]args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number");
       int num=sc.nextInt(); 
       
       for(int i=1; i<=num; i++){
           System.out.print(i);
       }
       for(int i=(num-1); i>=1; i--){
           System.out.print(i);
       }
    }
}
