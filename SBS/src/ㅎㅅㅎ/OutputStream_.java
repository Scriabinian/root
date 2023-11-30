package ㅎㅅㅎ;

import java.io.*;

public class OutputStream_ {
	public static void main(String[] a ) {
		InputStream in = null;//읽어 온당.
		OutputStream out = null;//립력한다.;;
		try {
			out = new FileOutputStream("src/ㅎㅅㅎ/write.txt", true);//true:이어쓰기옵션 false : 새로만든다.
			out.write('H');
			out.write('E');
			out.write('L');
			out.write('L');
			out.write('O');
			out.write(' ');
			out.write('W');
			out.write('O');
			out.write('R');
			out.write('L');
			out.write('D');
			
			in= new FileInputStream("src/Image/토깽이.jpg");//복사할 사진 파일을 읽어온당.
			//읽어온 파일을 복사한다.->쓰고 저장한다.
			out = new FileOutputStream("src/Image/토깽이_.jpg");
			//byte[] buffer = new byte[512];
			//파일을 복사할 시간 단위를 만들어서 얼마나 걸리는지 알아본다.
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			int read = 0;
			while((read = in.read())!=-1) {
				out.write(read);
			}
			long end = System.currentTimeMillis();
			//종료초 - 시작초
			double time = (double)(end-start);
			System.out.println(time+"초");
			System.out.println("이미지 읽기 종료");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
