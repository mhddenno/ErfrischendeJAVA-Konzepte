package org.refreshing.training;
import java.util.*;

public class Solve {
	private static final Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[]=new int[] {100,100,50,40,40,20,10};
		//5 25 50 120
		int alice[]=new int[] {5,25,50,120};
		
		int result[]=Solve.climbingLeaderboard(scores, alice);
		for(int i : result) {
			System.out.println(i);
		}
		
		
	}
	
}
