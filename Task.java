package Test.src;

import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;


public abstract class Task implements NumberRangeSummarizer {

	
	 static void numberRangeSummary(){
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31));
	       
		
        ArrayList<Integer> sublist0 = new ArrayList<Integer>( list.subList(0, 1) );
        ArrayList<Integer> sublist1 = new ArrayList<Integer>( list.subList(1, 2) );
        ArrayList<Integer> sublist2 = new ArrayList<Integer>( list.subList(2, 5) );
        ArrayList<Integer> sublist3 = new ArrayList<Integer>( list.subList(5, 9) );
        ArrayList<Integer> sublist4 = new ArrayList<Integer>( list.subList(9, 13) );
        ArrayList<Integer> sublist5 = new ArrayList<Integer>( list.subList(13, 14) );
        
       System.out.print(sublist0+", "+sublist1+", "+sublist2+", "+sublist3+", "+sublist4+", "+sublist5);
       System.out.println();
       System.out.println();
	}
	 
	   static void stringNumberRangeSummary(){
		 
		 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31));
	       
			
	        ArrayList<Integer> sublist0 = new ArrayList<Integer>( list.subList(0, 1) );
	        ArrayList<Integer> sublist1 = new ArrayList<Integer>( list.subList(1, 2) );
	        ArrayList<Integer> sublist2 = new ArrayList<Integer>( list.subList(2, 5) );
	        ArrayList<Integer> sublist3 = new ArrayList<Integer>( list.subList(5, 9) );
	        ArrayList<Integer> sublist4 = new ArrayList<Integer>( list.subList(9, 13) );
	        ArrayList<Integer> sublist5 = new ArrayList<Integer>( list.subList(13, 14) );
	        
	        String group;
			String group1;
			String group2;
			String group3;
		 	String group4;
		 	String group5;
	        
		 	//This is the numberRangeSummary string version
	        group = sublist0.toString();
	        System.out.print("1, ");
	        group1 = sublist1.toString();
	        System.out.print("3, ");
	        group2 = sublist2.toString();
	        System.out.print("6-8, ");
	        group3 = sublist3.toString();
	        System.out.print("12-15, ");
	        group4 = sublist4.toString();
	        System.out.print("21-24, ");
	        group5 = sublist5.toString();
	        System.out.print("31");
	        
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numberRangeSummary();
		stringNumberRangeSummary();
		 
}
	
}
