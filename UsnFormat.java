package com.Test;

import java.util.*;
public class UsnFormat {
	public static String usn(String str) {
		String s = "";
		@SuppressWarnings("unused")
		Double d = null;
		boolean b = true;
		if(str.length()<4) {
			return "invalid";
		}else {
		try {
			 d = Double.parseDouble(str);
			}catch(Exception e) {
				b=false;
			}
		if(b) {
		String t="",p="";
		int li =2;
		for(int i =0;i<str.length();i++){
			if(b){
			if(str.charAt(i)=='.') {
			b=false;
			continue;}
			t+=str.charAt(i);
			}else if(!b&&li>0) {
				p+=str.charAt(i);
				li--;
			}
		}
		int r = t.length()%3;
		if(r==0){
		for(int l=0;l<t.length()-3;l+=3){
			s=s+t.substring(0+l, 3+l-r)+",";
		}}
		if(r==1) {
		for(int l=0;l<t.length()-3;l+=3) {
			s=s+t.substring(0+l, 3+l-r-1)+",";
			r=0;
		}}
		if(r==2) {
		for(int l=0;l<t.length()-3;l+=3) {
			s=s+t.substring(0+l, 3+l-r+1)+",";
			r=0;
		}}
		s+=t.substring(t.length()-3, t.length());
		if(p.length()<=0) {
			return s;
		}else {
		String o = dble(p);
		return s+o;}}
		return "invalid input";
		}	
	}
	public static String dble(String d){
		String f =".";
		if(d.length()>2) {
		if(Character.getNumericValue(d.charAt(1))>=5) {
			int j = Character.getNumericValue(d.charAt(1)+1);
			f=f+d.substring(0,1)+j;
		}else {
		int j = Character.getNumericValue(d.charAt(1));
		f=f+d.substring(0,1)+j;
		}
		return f;
	}return "."+d;
}
	   
	static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Enter the value...");
	String in =sc.nextLine();
	String res = usn(in);
	System.out.println(res);
	System.gc();
}
}
