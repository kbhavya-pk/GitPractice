package com.prok.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iteration {
	
	    public static void main(String a[]){
	         
	        List<String> myList = new ArrayList<String>();
	        myList.add("Java");
	        myList.add("Unix");
	        myList.add("Oracle");
	        myList.add("C++");
	        myList.add("Perl");
	        Iterator<String> itr = myList.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	            System.out.println("Made a changes");
	    }
	}

}
