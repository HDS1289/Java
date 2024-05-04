package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();
		
//		Cabinet<C> cabinet: ==> bound mismatch
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		cabinet1.getLastVal(arr1);
		cabinet1.getLastVal(arr2);
//		cabinet1.getLastVal(arr3); A 이하이여야 하므로 C type은 들어갈 수 없다.
		cabinet2.getLastVal(arr2);
//		cabinet2.getLastVal(arr1); // cabinet2의 타입은 B type으로 결정되었다.
		
//		cabinet1.getFinalVal(arr1); A type은 C 이하가 아니므로 들어갈 수 없다.
//		cabinet2.getFinalVal(arr2);
		cabinet1.getFinalVal(arr3); // parameter가 C이하이므로 들어갈 수 있다.
		cabinet2.getFinalVal(arr3);
		cabinet1.getFinalVal(arr4);
		cabinet2.getFinalVal(arr4);
	}
}
