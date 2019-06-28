package techgig;

/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {
	  int totle=0;
	//Write code here
	// int input[]= readvalues();
	 int inputcomb[][] = createCombination(readvalues());
	  for (int i = 0; i < inputcomb.length; i++) {
		 totle+= createsquare(inputcomb[i][0], inputcomb[i][1]);
	  }
	  System.out.println("Totle");
	 System.out.println(totle);
   }

   public static int [] readvalues(){
      Scanner in =new Scanner(System.in);
      int input[] = new int[4];
         for(int i=0;i<input.length;i++){
            input[i]=in.nextInt();
         }
         	System.out.println( "length : "+ input.length);
         for (int i = 0; i < input.length; i++) {
        	 System.out.println( "value = "+ input[i]);
         }
      return input;
   }
   public static int[][] createCombination(int input[]){
      int combinationInput [][] = new int[4][2];
      combinationInput[0][0]=input[0];
      combinationInput[1][0] =input[0];
      combinationInput[2][0] =input[1];
      combinationInput[3][0] =input[1];

      combinationInput[0][1]=input[2];
      combinationInput[1][1] =input[3];
      combinationInput[2][1] =input[2];
      combinationInput[3][1] =input[3];
      
      
      System.out.println( "length"+ combinationInput.length);
       for (int i = 0; i < combinationInput.length; i++) {
		for (int j = 0; j < 2; j++) {
			 System.out.print(combinationInput[i][j]+" , ");
		}
		 System.out.println( "   ");
       }

      return combinationInput;
   }
   
 //return the number of square generated form the value
   public static int  createsquare(int inpRow, int inpCol){
	   int count= 0;
      int row = inpRow;
      int col = inpCol;
     while(true) { 
      if(row == col) {
    	  count++;
    	  break;
      }
      else if(row >col){
    	  count++;
    	  row = row-col;
      }else{
    	  count++;
    	  col=col-row;
      }
     }
     return count;
     
   }
   
   
}
