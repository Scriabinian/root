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
		/*
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		for(int i=1;i<=5;i++) {
			for(int j=5;j-i>=0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		연습ㅎㅎ i = new 연습ㅎㅎ();
		int n = i.sum(4);
		System.out.println(n);
	}


int sum(int n) {//1,4,10,20,35,56;
	 
	if(n==0) {
		return 0;
	}
	if(n==1) {
		return 1;
	}else{
		return sum(n-1)*2-sum(n-2)+n;
	}
}*/
		/*
		int target =  (int)(Math.random()*100)+1;
		do {
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
				
			int i=t>target ? -1:t<target?1:0;
			if(i==0) {
				System.out.println("right.");
				break;
			}
			else if(i<0)
				System.out.println("down.");
			else
				System.out.println("up");
		}while(true);
		*/
		
		
	}
}