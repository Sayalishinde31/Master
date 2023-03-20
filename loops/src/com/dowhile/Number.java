package com.dowhile;
//Program number divisible by 2 from 1 to 50 using do while
public class Number {
	public static void main(String[] args) {
		int i=1;
		do
		{
			if(i%2==0)
			System.out.println(i);
				i++;
		}
		while(i<=50);
	}
}
