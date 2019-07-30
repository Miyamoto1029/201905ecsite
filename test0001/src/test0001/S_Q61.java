package test0001;

public class S_Q61 {

	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5};

		int key = 3;

		int cnt = 0;

		for (int i : array){
			if(i != key){
//				continue;
//				↑こいつがあるとそれ以降の処理をスキップしちゃうので、
//				↓に到達できないからエラーになる
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
