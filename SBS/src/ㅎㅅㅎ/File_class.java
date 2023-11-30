package ㅎㅅㅎ;

import java.io.*;

public class File_class {

	public static void main(String[] args) {
		File f = new File("src/Image/토깽이.jpg");//파일을 긁어온당;;
		if(f.exists()) {//파일의 존재를 확인.
			System.out.println("length : " +f.length() );
			System.out.println("Can Read : "+f.canRead());//canRead : 읽기가 가능한지 알아보는것;
			System.out.println("getName : "+f.getName());//화일의 확장명과 이름을 볼 수 있으다.
			System.out.println("getParent : "+f.getParent());//경로를 볼 수 있 으다.
			System.out.println("getPath : " + f.getPath());//풀 경로를 알 수 있으다;;
			
		}
		
	}
}
