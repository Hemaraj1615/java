package com.polymorphism;

public class PolyMethodoverloading {
	static int add( int first ,int second) {
		return first+second;
	}
     static double add( double first , double second) {
    	 return first+second;
     }
     static char add( char first , char second) {
    	 return (char)(first+second);
     }
      static String add(String first , String second) {
    	  return first.concat(second);
      }
      static float add(float first ,float second) {
    	  return first+second;
    	  
      }
      public static void main(String[] args) {
    	  System.out.println("adding two integers :" + add(2,3));
    	  System.out.println("adding two doubles :" + add(5.8,3.6));
    	  System.out.println("adding two characters :" + add("h","a"));
    	  System.out.println("adding two string :" + add("hema","raj"));
    	  System.out.println("adding two float :" + add(2f,3f));
      }
      }