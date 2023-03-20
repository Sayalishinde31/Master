package com.dowhile;

public class Dowhile {
	public static void main(String[] args) {
		int i=25;
	
		{
			do
			{
				if(i%5==0)
				System.out.println(i);
				i++;
			}
			while(i<=50);
			
		}
	}
}
