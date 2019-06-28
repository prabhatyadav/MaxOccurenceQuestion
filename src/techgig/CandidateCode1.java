package techgig;
/* Read input from STDIN. Print your output to STDOUT*/


import java.util.*;
public class CandidateCode1 {
   public static void main(String args[] ) throws Exception {
   int totle=0;
	//Write code here
 CandidateCode cc = new CandidateCode();
	 int inputcomb[][] = cc.createCombination(cc.readvalues());
	  for (int i = 0; i < 4; i++) {
		 totle+= cc.createsquare(inputcomb[i][0], inputcomb[i][1]);
	  }
	 System.out.print(totle);
   }

   public  int [] readvalues(){
      Scanner in =new Scanner(System.in);
      int input[] = new int[4];
         for(int i=0;i<4;i++){
            input[i]=in.nextInt();
         }
      return input;
   }
   public  int[][] createCombination(int input[]){
      int combinationInput [][] = new int[4][2];
      combinationInput[0][0]= input[0];
      combinationInput[1][0] =input[0];
      combinationInput[2][0] =input[1];
      combinationInput[3][0] =input[1];

      combinationInput[0][1]=input[2];
      combinationInput[1][1] =input[3];
      combinationInput[2][1] =input[2];
      combinationInput[3][1] =input[3];

      return combinationInput;
   }

   public  int  createsquare(int row, int col){
	   int count= 0;
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
