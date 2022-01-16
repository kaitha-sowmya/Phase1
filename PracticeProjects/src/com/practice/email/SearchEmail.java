package com.practice.email;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchEmail {
	   public static void main(String[] args){
		   String mail;
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("enter the mail to search");
	    	  mail=sc.next();
	      ArrayList <String> al = new ArrayList<String>();
	      //Instantiating an ArrayList object
	      al.add("karthik@abc.com");
	      al.add("vibha@abc.com");
	      al.add("lexi@abc.com");
	      al.add("freya@abc.com");
	      al.add("rosa@abc.com");
	      al.add("mendy@abc.com");
	      al.add("rory@abc.com");
	      
	      
	      for (String m: al){
	    	  
	         if (m.contains(mail)){
	               System.out.println(m+"exists");
	               
	         }
	         else {
	        	 System.out.println("enter a valid mail or mail does not exist");
	        	 break;
	         }
	        	 
	      }
	   }
	}
