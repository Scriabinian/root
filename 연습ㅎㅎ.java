package day4;
import java.util.*;

public class 연습ㅎㅎ {
	public static void main(String[] args) {
		/*int num = 456;
		System.out.println((num+"").charAt(0)+"00");
	
		*/
		
		/*
		int fahrenheit = 100;
		float celcius =((int)(5/9.0*(fahrenheit-32)*100+0.5))/100.0f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("celcius:"+celcius);
		*/
		
		/*
		String s="";
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			s += i+"";
		}
		
		System.out.println(s);*/
		/*
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		 */

		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
