
public class Hello{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		
		a= 100+100; //�� ������� a�� ���´�.
		b= a+100; //b��� ��������� a���� ������ ������ ��. �ű⿡ 100�� ���� ���� b�� ���´�.
		c= a+b-100;
		d=a+b+c;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		a=b=c=d=100; //���� �ϳ��� �ʱ�ȭ. ������ �ִ� ���� �����Ѵ�. ������ �ʱ�ȭ
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		a=100;
		a=a+200; //�ʱ�ȭ
		System.out.println("a: "+a);
		
	}

}
