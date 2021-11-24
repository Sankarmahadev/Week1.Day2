package Week1.day2;

public class MyMobile {
        boolean sms;
	    char Brandname;
		short cost;
		public void makecalls()
		{
			System.out.println("making calls");

		}
		public boolean getsms()
		{
		   sms=true;                       
		   return sms;
	    }
		private void paybills()
		{
		System.out.println("pay bill");
		}
		
		public void bill(int a ,int b)
		{
			int bill= a+b;
			System.out.println("yourbill"+ bill);
		}
		public static void main(String[] args) {
	
			MyMobile obj=new MyMobile();
			obj.makecalls();
			obj.getsms();
			obj.paybills();
			obj.bill(2,8);
			obj.cost=8;
			System.out.println(obj.cost);
}
		}
