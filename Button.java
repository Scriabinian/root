package Scriabinian;

public class Button {
	//내부적으로 인터페이스를 만든당 ㅎ ㅅㅎ.
	public static interface OnClickListener{
		//추상 메서드...
		void onClick();
	}
	//다형성 객체를 주입받을 수 있는 변수를 만든당.
	private OnClickListener onClickListener;
	public void SetOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
		
	}
	public void click() {
		this.onClickListener.onClick();
	}
	//객체를 주입하는 Setter메서드를 만들것;
}
