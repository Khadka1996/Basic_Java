//print from 1 to 10 using loops

import java.util.*;

public class Loops{
  public static void main(String[] args){

     //using for loop
     //for (int i=0; i<11; i++){
     //System.out.println(i);
     //  }
//**************************************************//
    // using while loop
    // int i = 0;
    // while(i<11){
    // System.out.println(i);
    // i = i + 1;
//**************************************************//
    //using do while loop
//     int i=0;
//     do{
//     System.out.println(i);
//     i = i + 1;
//     } while (i <11); 
//   }


//**************************************************//
// sum of natural numbers
// Scanner sc = new Scanner(System.in);
//  int n = sc.nextInt();
//  int sum=0;
//  for (int i=0; i<=n; i++){
//     sum = sum + i;
//  }
// System.out.println(sum);
//   }

//**************************************************//
// Print the table of a number input by the user

Scanner scanner = new Scanner (System.in);
int n= scanner.nextInt();
for (int i=1; i<10; i++) {
   System.out.println(n*i);
}
  }}

