import java.util.Scanner;

public class Page238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int a,b;
		
		while(true) { //�� ���� �����̴�.
			System.out.println("���� ù��° �� �Է�");
			a=s.nextInt();
			System.out.println("���� �ι�° �� �Է�");
			b=s.nextInt();
			
			System.out.println(a+"+"+b+"="+(a+b));
			
			//�հ谡 10���� ũ�� ������
			if((a+b)>10) {
				break;
			}
		}
	}
}
