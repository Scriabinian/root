package day6;

public class object_equals {
	public static void main(String[] args) {
		/*
		 * 리터럴 String 참조하는 변수 2개;
		 *  String 객체에 값을 담아서 참조하는 변수 1개.
		 */
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		System.out.println("str1 vs str2 : "+str1==str2);
		System.out.println("str2 vs str3 : "+str2==str3);
		System.out.println("str2 vs str3 : "+str2.equals(str3));
		/*
		 * 각 문자열 변수가 위치값을 출력;
		 */
		System.out.println("str1 해시코드 : "+System.identityHashCode(str1));
		System.out.println("str2 해시코드 : "+System.identityHashCode(str2));
		System.out.println("str3 해시코드 : "+System.identityHashCode(str3));
		
		String str4 =  new String("abc");
		String str5 =  new String("abc");
		
		System.out.println("str4 vs str5 :"+str4==str5);
		System.out.println("str4 vs str5 : "+str4.equals(str5));//인스턴스의 값을 비교(String 객체);
		//hash코드 값 출력 : 오버라이딩 된 객체의 식별값;
		System.out.println(str4.hashCode());
		
		System.out.println(str5.hashCode());
		
		//identityHashCode(Object obj) : 오버라이딩 되지 않는 객체의 주소값.
		System.out.println(System.identityHashCode(str4));		
		System.out.println(System.identityHashCode(str5));
		//객체를 생성한다.
		Car_String car = new Car_String("소나타","현대");
		System.out.println(car.toString());
	}
}
