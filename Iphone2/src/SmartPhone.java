
public class SmartPhone extends Phone implements Mp3Player, NewFunction{

	public void play(){
		System.out.println("再生しますか？");
	}

	public void stop(){
		System.out.println("停止しますか？");
	}
//
//	public void next(){
//		System.out.println("次へ進みますか？");
//	}

	public void back(){
		System.out.println("戻りますか？");
	}



}
