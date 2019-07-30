
public class Test {

	public static void main(String[] args){

//		Person taro = new Person();
//
//		taro.name ="山田太郎";
//		taro.age=20;
//
//		System.out.println(taro.name);
//		System.out.println(taro.age);


		Person kimura = new Person();

		kimura.name = "木村次郎";
		kimura.age = 18;
		kimura.phoneNumber = "070-1111-1111";
		kimura.address = "東京都武蔵野市境";;

		System.out.println(kimura.name);
		System.out.println(kimura.age);
		System.out.println(kimura.phoneNumber);
		System.out.println(kimura.address);
		kimura.talk();
		kimura.run();
		kimura.walk();
		System.out.println("");


		Person suzuki = new Person();

		suzuki.name = "鈴木花子";
		suzuki.age = 16;
		suzuki.phoneNumber = "080-1111-1111";
		suzuki.address = "神奈川県横浜市";

		System.out.println(suzuki.name);
		System.out.println(suzuki.age);
		System.out.println(suzuki.phoneNumber);
		System.out.println(suzuki.address);
		suzuki.talk();
		suzuki.run();
		suzuki.walk();
		System.out.println("");

		Person miyamoto = new Person();

		miyamoto.name = "宮本卓弥";
		miyamoto.age = 26;
		miyamoto.phoneNumber = "090-1111-1111";
		miyamoto.address = "神奈川県平塚市";

		System.out.println(miyamoto.name);
		System.out.println(miyamoto.age);
		System.out.println(miyamoto.phoneNumber);
		System.out.println(miyamoto.address);
		miyamoto.talk();
		miyamoto.run();
		miyamoto.walk();
		System.out.println("");


		Robot aibo = new Robot();

		aibo.name = "aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();


		Robot asimo = new Robot();

		asimo.name = "asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();


		Robot pepper = new Robot();

		pepper.name = "pepper";

		pepper.talk();
		pepper.walk();
		pepper.run();






	}

}
