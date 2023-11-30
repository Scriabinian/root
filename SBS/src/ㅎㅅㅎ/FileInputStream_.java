package ㅎㅅㅎ;

import java.io.*;

public class FileInputStream_ {
	public static void main(String[] args) {
		/*
		 * InputStream(입출력 최상위객체)-FileInputStream : 파일에서 바이트 단위로 자료를 읽는 기본 스트림
		 * 파일을 읽어올 변수
		 */
		int read = 0;
		byte[] buffer =  new byte[5];
		//스트림 선언
		InputStream in = null;
		//파일 읽는당.
		try {
			in = new FileInputStream("src/ㅎㅅㅎ/my_file.txt");//메모장의 경로로 스트림을 받아 들인다.
			while(true) {//무한 반복을 사용해서 버퍼를 읽어보장.
				read = in.read(buffer);
				//파일이 끝나는 지점 -1
				if(read == -1) {
					break;
				}

				System.out.println(new String(buffer ,0,read));	
			}
		}catch(Exception e) {
			System.out.println("Error : "+e.getStackTrace());
		}finally {//예외처리 종료된 시점에 처리를 한당.
			try {
				if(in!=null)in.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		//파일의 끝지점 -1 반환 --> 파일을 닫는당.
	}
}
