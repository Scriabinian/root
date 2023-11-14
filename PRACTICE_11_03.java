package day12;

public class PRACTICE_11_03 {
	public static void main(String[] args) {
		Speaker s1 = new RedSpeaker();
		Person p1 = new Person(s1);
		p1.turnOn();
		
		Speaker s2 = new BlueSpeaker();
		Person p2 = new Person(s2);
		p2.turnOn();
	}
}

class Person{
	Speaker speaker;
	Person(Speaker speaker){
		this.speaker = speaker;
	}
	void turnOn() {
		System.out.println(speaker.getName()+"가 켜졌슴니당");
	}
}
abstract class Speaker{
	abstract String getName();
}
class RedSpeaker extends Speaker{
	String getName() {
		return "빨간 스피커";
	}
}
class BlueSpeaker extends Speaker{
	String getName() {
		return "퍄란 스피커";
	}
}