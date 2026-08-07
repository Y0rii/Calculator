import java.util.Scanner;
public class Calculator { 
    public static void main(String [] args) {

     int totall=0;
     boolean Cont=true;

    //welcoming massage
     System.out.println("Welcome!");
     
 
   while(Cont){

     Scanner sc=new Scanner (System.in);
     System.out.print("Enter the opration:");
     String x=sc.next();


     for (int i=0 ; i<x.length() ; i++){
     char j=x.charAt(i);

   
     switch (j){
      //
     case '-':
     int num1=Integer.parseInt(x.substring(0,i));
     int num2=Integer.parseInt(x.substring(i+1));

     //checking if num 2 is larger than 1
     if(num1<num2){
     int temp=num1;
     num1=num2;
     num2=temp;
     }
     totall=num1-num2;
     break;

     //
     case '+':
     num1=Integer.parseInt(x.substring(0,i));
     num2=Integer.parseInt(x.substring(i+1));
     totall=num1+num2;
     break;

    //
     case '/':
     num1=Integer.parseInt(x.substring(0,i));
     num2=Integer.parseInt(x.substring(i+1));

    //checking divide by zero error 
     if(num2==0){
     System.out.println("Error: can not divide by zero!");
     return;
     }
     totall=num1/num2;
     break;

    //
     case '*':
     num1=Integer.parseInt(x.substring(0,i));
     num2=Integer.parseInt(x.substring(i+1));
     totall=num1*num2;
     break;
   }
 }

 System.out.println(totall);
 //
 System.out.print("Do you want to continue? (true/false):");
 boolean answer=sc.nextBoolean();
 if(!answer){
  Cont=false; 
   }
 System.out.println("-----------------------------");

  } 
 }
}   

