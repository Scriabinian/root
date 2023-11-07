package Mouse;

public class Mouse {
	public static void main(String[] args) {
		Comic c = new Comic("귀여운","ㅎ ㅅㅎ",true);
		c.info_color();
		c.info_title();
		c.info_author();
		Comic b = (Comic)new Book();
		b.info_color();
		
		DeskCalendar dc = new DeskCalendar("보라색", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		System.out.println();
		Calendar dc2 = new DeskCalendar("보라색", 6);
		dc2.info();
		dc2.hanging();
		DeskCalendar dc3 = (DeskCalendar)new Calendar("보라색", 6);
	
		Car c1 = new SchoolBus();
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		Car c2 = new OpenCar();
		OpenCar oc = new SportsCar();
		 
		Bus b3 = (Bus)new Car();
		
	}
}
class Car{
	
}
class Bus extends Car{
	
}
class SchoolBus extends Bus{
	
}
class OpenCar extends Car{
	
}
class SportsCar extends OpenCar{
	
}
class Book{
	String title;
	String author;
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	Book(){};
	final void info_title() {
		System.out.println("책의 제목은 "+title+"입니다." );
	}
	
	void info_author() {
		System.out.println("책의 저자는 "+author + "입니다.");
	}
}
class Comic extends Book{
	boolean isColor;
	Comic(String title, String author, boolean isColor){
		super(title, author);
		this.isColor = isColor;
	}
	void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러얌;ㅎ ㅅㅎ");
		}else {
			System.out.println("이 만화책은 흑백이얌 ㅎ ㅅㅎ...");
		}
	}
}
class Calendar extends Book{
	String color;
	int months;
	Calendar(String color,int months){
		this.color = color;
		this.months = months;
	}
	void info() {
		System.out.println(color + "달력은 "+months + "월 까지 있습니다.");
	}
	void hanging() {
		System.out.println(color + "달력은 벽에 걸 수 있습니당.");
	}
}
class DeskCalendar extends Calendar{
	DeskCalendar(String color, int months){
		super(color, months);
	}
	@Override
	void hanging() {
		System.out.println(color + "달력을 벽에 걸기 위해 추가적 고리가 필요합니다.");
	}
	void onTheDesk() {
		System.out.println(color + "달력은 책상에 세울 수 있당.");
	}
}