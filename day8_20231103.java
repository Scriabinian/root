package day8;

public class day8_20231103 {
	public static void main(String[] args) {
		/*@getter/setter : 캡슐화 관련 -> 멤버필드 : private
		 *private : 클래스 내부에서만 접근하는 제어자.
		 */
		day8_20231103 a = new day8_20231103();
		Person as = a.new Person();
		as.setAge( 30);
		System.out.println("kim의 나이는 "+as.getAge());
		Book b = a.new Book(1,100,"SBS아카데미컴퓨터아트학원","제목없음","멘토시리즈");
		System.out.println("b1.title : "+b.title);
		System.out.println("b1.series : "+b.series);
		System.out.println("b1.page : "+b.page);
		
		Book ab= a.new Book();
		Book asc = a.new Book("신데렐라", 170);
		Book asb = a.new Book(5,"노인과 바다 ㅎ ㅅㅎ");
		Car car = a.new Car();
		Car car2 = a.new Car(car);
		/*
		 * @상속 : 자식 클래스가 부모클래스에 의존하는 객체(다중상속 허용하지 않음)
		 * 
		 */
		SmartTv tv = a.new SmartTv();
		tv.captionOnOff();
		System.out.println("caption = "+tv.caption);
	
	}
	class Person1{
		String name;
		int age;
		Person1(String name, int age){
			this.name = name;
			this.age = age;
			
		}
	}
	class Customer extends Person1{
		int memberID;
		Customer(String name, int age){
			super(name, age);
			day8_20231103 a = new day8_20231103();
			Person1 as = a.new Person1(name, age);
			
		}
	}
	class Tv{ 
		int channel;
		boolean power;
		void power(){power = !power;}
		void channelUp() {channel++;}
		void channelDown() {
			channel--;
		}}
	class SmartTv extends Tv{
		boolean caption;
		void displayCaption(String txt) {
			if(caption) {
				System.out.println(txt);
				}
			}
		void captionOnOff(){{
			caption = !caption;
		}
		}}
	
	class Car{
		String color;
		String gearType;
		int door;
		Car(){
			this("하얀색", "자동", 4);
		}
		Car(String color,String gearType, int door){
			this.color = color;
			this.gearType = gearType;
			this.door = door;
		
			}
		Car(Car c){
			color = c.gearType;
			gearType = c.gearType;
			door = c.door;
		}
		}
	
	
	class Book{
		String brand;
		int series;
		String color;
		String title;
		int page;
		static int width= 200;
		static int height = 500;
		Book(){
			
			this.title = "제목없음";
			this.page = 100;
			this.series = 1;
			
		}
		Book(String t, int p){
			this.title = t;
			this.page = p;
			this.series = 1;
		}
		Book(int p , String t){
			this.page = p;
			this.title = t;
			this.series = 5;
		}
		Book(int s, int p, String b, String t, String c){
			this.brand = b;
			this.color = c;
			this.title = t;
			this.page = p;
			this.series = s;
		}
	}
	
	class Person{
		private int age;
		void setAge(int num) {
			if(num<=0) {
				System.out.println("잘못된 숫자를 입력했습니당. 1 이상의 정수를 입력하세요.");
			}else{
				age = num;//간접 return;
			}
		}
		int getAge() {
			return age;
		}
		Person(int...a){
			
		}
	}
		
}
