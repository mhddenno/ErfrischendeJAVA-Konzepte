package org.designPattern;
import java.util.*;

public class AdapterDesignPattern {
	public AdapterDesignPattern (){
		
	}
	public void showDifference() {
		Integer[] arr=new Integer[] {1,2,3};
		List<Integer> list=Arrays.asList(arr);
		
		System.out.println(arr);
		System.out.println(list);
	}
}
