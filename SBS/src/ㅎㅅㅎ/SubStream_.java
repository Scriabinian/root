package ㅎㅅㅎ;

import java.io.*;

public class SubStream_ {
	public static void main(String[] args) {
		/*
		 * 1)성능 향상 보조 스트림.
		 * input
		 * 기반 스트림
		 * 보조 스트림
		 */
		FileInputStream readFile = null;
		BufferedInputStream bis = null;
		
		/*
		 * output
		 * 기반스트림
		 * 보조스트림
		 */
		FileOutputStream writeFile = null;//기반스트림
		BufferedOutputStream bos = null;//보조 스트림
		System.out.println("보조 스트림 시작");
		try {
			readFile = new FileInputStream("src/Image/토깽이.jpg");//파일의 위치에서 스트림을 시작한다라는 경로를 만든다.(기반)
			writeFile = new FileOutputStream("src/Image/토깽이_sub.jpg");
			//보조스트림으로 결합한당.
			bis = new BufferedInputStream(readFile);//파일을 읽 어옴
			bos = new BufferedOutputStream(writeFile);//파일을 씀.
			//현재 시간을 초 단위로 나타낸당.
			
			while(bis.read() != -1) {
				bos.write(bis.read());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
