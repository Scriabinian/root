package day09;

import javax.swing.*;

public class IO_blocking {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 입력하시오"); // 입력 패널을 열게 한당;;
		/*for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/
		ThreadEx1 th1 = new ThreadEx1();
		ThreadEx2 th2 = new ThreadEx2();
		th1.setPriority(1);//최소우선순위;
		th2.setPriority(9);//최대우선순위;
		System.out.println("Priority of th1(-):"+th1.getPriority());
		System.out.println("Priority of th1(*):"+th2.getPriority());
		th1.start();
		th2.start();
	}
	
}

class ThreadEx1 extends Thread{
	public void run() {
		for(int i=0;i<400;i++) {
			System.out.print("-");
		}
	}
}
class ThreadEx2 extends Thread{
	public void run() {
		for(int i=0;i<400;i++) {
			System.out.print("*");
		}
	}
}