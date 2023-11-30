package ㅎㅅㅎ;

import java.io.*;

public class Person_ implements Serializable{//씨리얼 코드가 빌요하다.
	private static final long serialVersionUID = 1L;
	private String myName;
	private Object myAge;
	public Person_(String string, int i) {
		this.setMyNameMyAge(myName,myAge);
	}
	private void setMyNameMyAge(String myName2, Object myAge2) {
		this.myAge = myAge;
		this.myName = myName;
			
	}

}
