package com.rj.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteCount {
	public static int read(String path){
		int count=0;
	 try{
		 BufferedReader in= new BufferedReader(new FileReader(path+"count.txt"));
		 String s= in.readLine();
		 if(s!=null){
			 count=Integer.parseInt(s);
		 }
		 in.close();
	 }catch (Exception e){
		 e.printStackTrace();
	 }
	 return count;
	}
	
   public static void write(String path,String content){
	   try{
		   BufferedWriter out=new BufferedWriter(new FileWriter(path+"count.txt"));
		   out.write(content);
		   out.flush();
		   out.close();
	   }catch(Exception e){
		   e.printStackTrace();
	   }
   }
   

}
