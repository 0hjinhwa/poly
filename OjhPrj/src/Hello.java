
public class Hello{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		
		a= 100+100; //그 결과값이 a로 들어온다.
		b= a+100; //b라는 저장공간을 a저장 공간을 가지고 와. 거기에 100을 더한 값이 b로 들어온다.
		c= a+b-100;
		d=a+b+c;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
	}

}
