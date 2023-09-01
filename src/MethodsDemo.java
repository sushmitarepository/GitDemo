
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// will create obejct of class MethodsDemo and access method getdata using object
		
		MethodsDemo d = new MethodsDemo();

		String name = d.getData();

		System.out.println(name);

		MethodsDemo2 d1 = new MethodsDemo2();

		d1.getUserData();

		getData2();


		}



		public String getData()

		{

		System.out.println ("hello world");

		return "rahul shetty";

		}



		public static String getData2()

		{

		System.out.println ("hello world");

		return "rahul shetty";

		}








}
