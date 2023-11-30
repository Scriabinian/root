package ㅎㅅㅎ;

import java.io.*;

public class InputStreamReader_ {
	public static void main(String[] a) {
		/*
		 * Reader -> InputStream/FileReader;
		 *파일을 읽어오는 변수;;
		 */
		
		int read = 0;
		Reader reader = null;
		//스트림 선언
		char[] buffer = new char[256];
		try {
			reader = new FileReader("src/ㅎㅅㅎ/file_korean.txt");
				while(true) {
					read = reader.read(buffer);
					if(read == -1)break;

					System.out.println(String.valueOf(buffer,0,read));
				}
		}catch(Exception e) {
			
		}
		
	}
}
