package genericsExample;

public class GenericClass<T> {
 T abc;
 void add (T abc) {
	 this.abc=abc;
 }
 T get(){
	 return this.abc;
 }
 
	public static void main(String[] args) {
		GenericClass<Integer> obj1=new GenericClass<Integer>();
		obj1.add(5);
		System.out.println(obj1.get());
		GenericClass<String> obj2=new GenericClass<String>();
		obj2.add("ayush");
		System.out.println(obj2.get());
	}

}
