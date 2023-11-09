package day_11;
/*
public class day11_20231109 {
	public static void main(String[] args) {
		
	}
	class Car{
		String color;
		int door;
		void drive() {
			System.out.println ("드라이브중");
		}
	}
	class FireEngine extends Car{
		
	}
}
*/
public class day11_20231109{
	public static void main(String[] args) {
		//추상 클라스
		//레시피 ㅎ ㅅㅎ
		//파스타 레시피(자손)
		//스테이크 레시피 (자손)
		day11_20231109 d = new day11_20231109();
		PastaRecipe p = d.new PastaRecipe("백종원");
		p.info_();
		p.makeSource();
		p.cookingPlay();
		AudioPlayer ap = d.new AudioPlayer();
		ap.play(100);
		ap.stop();
		
	}
	abstract class Player{
		abstract void play(int pos);
		abstract void stop();
	}
	class AudioPlayer extends Player{
		AudioPlayer(){
			super();
		}
		@Override
		void play(int pos) {
			System.out.println(pos+"위치부터 실행한당.");
		}
		@Override
		void stop() {
			System.out.println("재생을 멈춥니당...");
		}
		
	}
	
	
	abstract class Recipe{
		String chef;//인스턴스 변수 ㅎ ㅅㅎ.
		//기본생성자
		Recipe(String chef){
			this.chef = chef;
		}
		Recipe(){
		}
		void info_(){
			System.out.println("이 레시피는 " +chef + "셰프님의 레시피 이당.");	
		}
		abstract void cookingPlay();
	}
	class PastaRecipe extends Recipe{
		PastaRecipe(String chef){
			super(chef);
		}
		void cookingPlay() {
			System.out.println("파스타요리를 진행합니다.");
		}
		void makeSource() {
			System.out.println("파스타 소스를 직접 만듬 ㅎ ㅅㅎ");
		}
	}
}