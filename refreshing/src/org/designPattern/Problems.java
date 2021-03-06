package org.designPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problems {
	public static int[] climbingLeaderboard(int[] scores, int[] alice) {
		 /*
         * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
         */
        //Initializing an order for the hash map values
        int order=1;
        int trackIndex;
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
        //Initiazlie trackIndex
        trackIndex=myMap.size();
        for(int i=0;i<alice.length;i++){
        	for(int j=trackIndex;j>=1;j--){
        		trackIndex=j;
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
	//Recursion
	public static int fibonaci(int n) {
		if(n==2)
			return 1;
		else 
			if(n==1)
				return 1;
			else
				if(n>2) {
					return fibonaci(n-1)+fibonaci(n-2);
				}
		return -1;
	}
	
	//Recursion + Dynamic Programming
	static int temp;
	static HashMap<Integer,Integer> memory=new HashMap<Integer,Integer>();
	public static int fibonaciWithMemorizing(int n) {
		//System.out.println(memory.size());
		if(n==2)
			return 1;
		else 
			if(n==1)
				return 1;
			else
				if(n>2) {
					if(!memory.containsKey(n)) {
						temp=fibonaciWithMemorizing(n-1)+fibonaciWithMemorizing(n-2);
						memory.put(n,temp);
					}
						return memory.get(n);
					
				}
		return -1;
	}
	
}
