package ㅎㅅㅎ;

import java.io.*;

public class ObjectSerial_ {
	public static void main(String[] args) {
		Person_ p1 = new Person_("SBS",10);
		Person_ p2 = new Person_("SBS2",20);
		FileOutputStream out = null;
		ObjectOutputStream oos = null;
		try {
			out = new FileOutputStream("src/ㅎㅅㅎ/object_data.dat");
			oos = new ObjectOutputStream(out);
			oos.writeObject(p1);
			oos.writeObject(p2);
			System.out.println("파일 객체 스트림 완성");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
