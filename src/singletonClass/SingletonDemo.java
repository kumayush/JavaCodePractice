package singletonClass;

public class SingletonDemo {
public int i;
public static	SingletonDemo singledemo_instance=null;
	private SingletonDemo() {
		i=10;
	}
	
	public static SingletonDemo getInstance() {
		if (singledemo_instance==null) {
			singledemo_instance=new SingletonDemo();	
		}
		return singledemo_instance;
	}
	
	public static void main(String args[]) {
		SingletonDemo one=	SingletonDemo.getInstance();
		one.i=100;
		SingletonDemo two=	SingletonDemo.getInstance();
		two.i=300;
		 System.out.println("Print Value of i using object one :" + one.i);

         System.out.println("Print Value of i using object two :" + two.i);

         if (one == two) {

               System.out.println("one and two both objects are same");
	}

}
}
