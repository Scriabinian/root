package day09;

//Runnable
class WhiteFlag implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("백기 올려");
		}
	}

}

class MyTask extends Thread implements Runnable {
	public MyTask() {
		setName("my-task-1");// 클래스 사용할 스레드이름을 정의할 수 있으다;;
	}

	public void run() {
		String threadName = Thread.currentThread().getName();
		while (true) {
			System.out.println("threadName");
		}
	}
}

public class Thread_ {

	public static void main(String[] args) {
		// Runnable 이용해 스레드 만들기
		Thread write = new Thread(new WhiteFlag());
		write.start();// 스레드가 시작된당.
		// 2.익명 클래스를 람다식 표현
		Runnable blueWrite = () -> {
			while (true) {
				System.out.println("청기 올려");
			}
		};

		Thread whiteFlag = new Thread(blueWrite);
		whiteFlag.start();

		// 3.스레드 이름을 부여한 멀티 스레드 만들기.
		Thread MyTask = new Thread(new MyTask());
		MyTask.start();
		// 스레드 동기화 처리.
	}

}
