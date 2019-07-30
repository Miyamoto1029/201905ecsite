package test0001;

public class continueTest {

	public static void main(String[] args){

		int y = 0;
		for(int i = 1; i <= 30; i++){

			if((i % 3) == y) {
				System.out.println("☠iは" + y +"なので処理をスキップします☠");
				continue;
			}
			System.out.println("i =" + i);
		}
		System.out.println("for文の後の処理");

	}
}
