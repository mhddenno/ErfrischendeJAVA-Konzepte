package org.refreshing.training;
import java.util.*;
/*https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem*/
public class Solve {
	private static final Scanner scanner=new Scanner(System.in);
	
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
        /*
         * Write your code here.
         */
        //Initializing an order for the hash map values
        int order=1;
        //sorting the array in a reverse order
        Arrays.sort(scores);
        //Build a hash map to map oreder and value
        Map<Integer,Integer> myMap=new HashMap<Integer,Integer>();
        //Building the hash map
        for(int i=scores.length-1;i>=0;i--){
            if(!myMap.containsValue(scores[i])){
                myMap.put(order,scores[i]);
                order++;
            }
        }
        //Array for the results and its counter
        int[] results=new int[alice.length];
        int resultCount=0;
        //Compare the alice's values with the oredered hash maps key's if alice has a value greater print it
        System.out.println(alice.length);
        for(int i=0;i<alice.length;i++){
        System.out.println(alice[i]);
        }
        for(int i=0;i<alice.length;i++){
        	for(int j=myMap.size();j>=1;j--){
            	if(myMap.get(j)<alice[i]){
            		if(j==1) {
                        results[resultCount]=1;
                        resultCount++;
                        break;
            		}
                	continue;
                }
                else {
                	if(myMap.get(j)==alice[i]) {
                        results[resultCount]=j;
                        resultCount++;
                        break;
                	}
                    results[resultCount]=j+1;
                    resultCount++;
                    break;
                }
            }
        }
    return results;
    }
	
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

