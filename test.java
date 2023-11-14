package day12;
abstract class interI{
	void inter() {
		System.out.println("ㅎ ㅅㅎ ㅅㅎ");
	}
}
interface interF{
	abstract void inter();
	
}
interface interG{
	abstract void inter();
}
class interH extends interI implements interF, interG{
	public void inter() {
		System.out.println("ㅎ ㅅㅎ");
	}
}
public class test {
	public static void main(String[] args) {
		interH h = new interH();
		h.inter();
	}
}
