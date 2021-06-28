package edu.dp.knapsack;
/**
 * @author Manoj Ravikumar
 * 
 * if there coins of 1,2,3,5 and value of 6 can be achieved using Dynamic Programming Language
 * 
 * <pre>
 * 		coins[] = {1,2,3,5}
 * 		value = W = 6
 * 		j = {0,1,2,3,4,5,W}
 * 		
 * 
 * 		if ( i == 0 )
 * 			if ( j % coins[0] == 0 )
 * 				A[0][j] = j / coins[0] 
 * 		if ( j < coins[i] )
 * 			A[i][j] = A[i-1][j]
 * 		if ( j >= coins[i] )
 * 			A[i][j] = min ( A[i-1][j] ,  1 + A[i][j-coins[i]] )
 *
 * 		for example,
 * 			A[3][5] means we are using all 4 coins to derive 5 rupees,
 * 				=> min ( A[2][5], 1 + A[3][5-coins[3]] )	
 * 				=> min ( A[2][5], 1 + A[3][5-5] )	
 * 				=> min ( A[2][5], 1 + A[3][0] )
 *  			=> min ( 2, 1 + 0)
 *  			=> min ( 2, 1)
 *  			=> 1
 * 
 * </pre>
 * 
 * <table>
 * 	<tr>	<td>A[i][j]</td>	<td>|</td><td>&nbsp;</td>	<td>0</td>	<td>1</td>	<td>2</td>	<td>3</td>	<td>4</td>	<td>5</td>	<td>6</td>	</tr>
 * 	<tr>	<td>----------</td> <td>|</td><td>&nbsp;</td>	<td>---</td><td>---</td><td>---</td><td>---</td><td>---</td><td>---</td><td>---</td></tr>
 *  <tr>	<td>coins[0]=1</td>	<td>|</td><td>&nbsp;</td>	<td>0</td>	<td>1</td>	<td>2</td>	<td>3</td>	<td>4</td>	<td>5</td>	<td>6</td>	</tr>
 *  <tr>	<td>coins[1]=2</td>	<td>|</td><td>&nbsp;</td>	<td>0</td>	<td>1</td>	<td>1</td>	<td>2</td>	<td>2</td>	<td>3</td>	<td>3</td>	</tr>
 *  <tr>	<td>coins[2]=3</td>	<td>|</td><td>&nbsp;</td>	<td>0</td>	<td>1</td>	<td>2</td>	<td>1</td>	<td>2</td>	<td>3</td>	<td>2</td>	</tr>
 *  <tr>	<td>coins[3]=5</td>	<td>|</td><td>&nbsp;</td>	<td>0</td>	<td>1</td>	<td>2</td>	<td>1</td>	<td>2</td>	<td>1</td>	<td>2</td>	</tr>
 * </table>
 * 
 * */
public class MinCoinChangeProblem {
	public static int min(int a,int b) {
		return a<b?a:b;
	}
	public static void minValue(int[][] arr, int[] coins, int value) {
		int selectedDenomination = -1;
		if(value == 0 || coins[0] > value) {
			return;
		}
		int remValue = 0;
		for(int i=coins.length-1; i>=0; i--) {
			if(selectedDenomination>0) {
				if(selectedDenomination != arr[i][value]) {
					int selectedCoin 	= coins[i+1];
					remValue		= value - selectedCoin;
					System.out.println(" f("+value+")="+selectedCoin+" ");
					break;
				}
			}
			selectedDenomination = arr[i][value];
		}
		minValue(arr,coins, remValue);
		return;
	}
	public static int[] coinChange(int[] coins, int value) {
		int[][] arr = new int[coins.length][value+1];
		int[]ret	= new int[coins.length];
		
		if(coins[0] > value) {
			return ret;
		}
		for (int i=0; i<coins.length; i++) {
			arr[i][0] = 0;
			for(int j=0; j<=value; j++) {
				if(i==0) {
					if (j % coins[i] == 0)
						arr[i][j] = (j / coins[i]);
				}
				else if(j < coins[i]) {
					arr[i][j] = arr[i-1][j];
				}
				else {
					arr[i][j] = min (arr[i-1][j], 1 + arr[i][j-coins[i]]);
				}
				if (j == value) {
					ret[i] = arr[i][j];
				}
			}
		}
		
		System.out.println("\n-------------------Remainders -----------------");
		minValue(arr,coins,value);
		
		return ret;
	}
	
	
	public static void main(String[] args) {
		int coins[] = {1,2,5,10,20,50,100,200,500,1000};
//		coins = new int[]{1,2,4,10};
		System.out.println("Coins ::: "+java.util.Arrays.toString(coins));
		for(int v : new int[] {239, 562, 9129}) {
			System.out.println("\n\n============== Value is "+v+" ===================");
			System.out.println("\n"+java.util.Arrays.toString(coinChange(coins,v)));
			System.out.println("=====================================================");
		}
		System.out.println("over");
	}
}
