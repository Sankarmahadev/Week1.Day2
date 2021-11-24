package Week1.day2;

public class MyKid {

	public static void main(String[] args) 
	{
		MyMobile obj2=new MyMobile();
		obj2.Brandname='s';
		System.out.println(obj2.Brandname);
		obj2.makecalls();
		boolean showsms= obj2.getsms();
		System.out.println(showsms);
		///obj2.paybill(); since it is declared as private (access specifier)
		}

}
