
public class Test {

	public static void main(String[] args){

		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);


		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person saburo = new Person("saburo");
		System.out.print(saburo.name);
		System.out.print(" ");
		System.out.println(saburo.age);

		Person i = new Person(25);
		System.out.print(i.name);
		System.out.print(" ");
		System.out.println(i.age);

		Person hanako = new Person(17, "hanako");
		System.out.print(hanako.age);
		System.out.print(" ");
		System.out.println(hanako.name);




	}

}
