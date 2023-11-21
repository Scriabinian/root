package day05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CheckedExceptionExample {
	public static void main(String[] args) {
		/*
		 * 일반 예외 : 입출력 오류;(체크될 상황이 강제됨)
		 */
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("example.txt"));
			/*
			 *입출력 코드는 에러처리가 일반예외 처리.
			 */
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			
			/*
			 * finally 안에도 try-catch를 넣을 수 있당.
			 * reader입출력 버퍼가 있는 경우, 버퍼를 닫는당.
			 * reader입출력 버퍼가 없는 경우 다시 에러코드를 발생시켜서 확인한당.
			 */
			try {
				if(reader != null)reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

