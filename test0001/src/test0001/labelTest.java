package test0001;

public class labelTest {

	public static void main(String[] args){

		loop1:
			for(int x = 0; x <3; x++){

				for(int y = 0; y < 3; y++){
					System.out.println("loop1の x = " + x + ": y =" + y);

					if(x == 1 && y == 1){
						System.out.println("break文の実行");
						break loop1;
					}

				}

			}

	System.out.println("ここはloop1を抜けたところです。");
	System.out.println("break文にlabelを指定すると、繰り返し処理の外に出て処理を中断できます。");
	System.out.println("");
	System.out.println("=======================================================");
	System.out.println("");
		loop2:
			for(int x = 0; x < 3; x++){

				for(int y = 0; y < 3; y++){
					System.out.println("loop2の x = " + x + ": y =" + y );

					if(x == 1 && y == 1){
						System.out.println("continue文を実行して繰り返し処理の外に出ました");
						System.out.println("しかし、処理は中断せずそのまま継続します。");
						continue loop2;
					}

				}

			}



	}
}
