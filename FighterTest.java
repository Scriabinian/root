package day12;

public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100,200);		
		Unit2 u = new Fighter();
		u.stop();
		Fightable fb = new Fighter();
		fb.attack(new Fighter());
		f.getFightable().move(300,400);
		Fightable nf = f.getFightable();
	}
}
abstract class Unit2{
	int x,y;
	abstract void move(int x,int y);
	void stop() {
		System.out.println("멈춘당 ㅎ ㅅㅎ");
	}
}
interface Fightable{
	public void move(int x,int y);
	public void attack(Fightable f);
}
class Fighter extends Unit2 implements Fightable{
	public void move(int x,int y) {
		System.out.println("["+x+"] , ["+y+"]");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
}