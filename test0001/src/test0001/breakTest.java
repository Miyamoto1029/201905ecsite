package test0001;

public class breakTest {

	public static void main(String[] args){

		for( int i = 1; ; i++){

			if(i == 14){
				break;
			}
			System.out.println("i =" + i);
		}
	System.out.println("for文の後の処理");
	}
}
