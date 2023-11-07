package Mouse;

public class Mouse {
	public static void main(String[] args) {
		Comic c = new Comic("�Ϳ���","�� ����",true);
		c.info_color();
		c.info_title();
		c.info_author();
		Comic b = (Comic)new Book();
		b.info_color();
		
		DeskCalendar dc = new DeskCalendar("�����", 6);
		dc.info();
		dc.hanging();
		dc.onTheDesk();
		System.out.println();
		Calendar dc2 = new DeskCalendar("�����", 6);
		dc2.info();
		dc2.hanging();
		DeskCalendar dc3 = (DeskCalendar)new Calendar("�����", 6);
	
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
		System.out.println("å�� ������ "+title+"�Դϴ�." );
	}
	
	void info_author() {
		System.out.println("å�� ���ڴ� "+author + "�Դϴ�.");
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
			System.out.println("�� ��ȭå�� �÷���;�� ����");
		}else {
			System.out.println("�� ��ȭå�� ����̾� �� ����...");
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
		System.out.println(color + "�޷��� "+months + "�� ���� �ֽ��ϴ�.");
	}
	void hanging() {
		System.out.println(color + "�޷��� ���� �� �� �ֽ��ϴ�.");
	}
}
class DeskCalendar extends Calendar{
	DeskCalendar(String color, int months){
		super(color, months);
	}
	@Override
	void hanging() {
		System.out.println(color + "�޷��� ���� �ɱ� ���� �߰��� ���� �ʿ��մϴ�.");
	}
	void onTheDesk() {
		System.out.println(color + "�޷��� å�� ���� �� �ִ�.");
	}
}