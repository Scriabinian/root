package day12;
import java.util.*;
import java.lang.*;

class Product{
	
}
class Video extends Product{
	String s;

	public String toString() {
		return "Video";
	}
}
class Audio extends Product{
	String s;
	public String toString() {
		return "Audio";
	}

}
class Buyer{
	void buy(Product p) {
		System.out.println(p);
	}
}
public class day12_20231114 {
	
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		buyer.buy(new Video());
		buyer.buy(new Audio());
	}
}
