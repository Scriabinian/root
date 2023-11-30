package ㅎㅅㅎ;

import java.net.*;

public class InetAddress_ {
	public static void main(String[] args) {
		//-ip주소 얻기;;
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 : "+local.getHostAddress());
			System.out.println("내 컴퓨터 IP 이름 : "+local.getHostName());
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP 주소"+remote.getHostAddress());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
