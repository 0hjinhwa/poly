import java.util.Scanner; //��ġ ����

public class Page176 {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in); // new: �޸𸮿� �ö󰣴�. �̰� ������ �Է��� �ȵ�
		int a;
		
		System.out.println("���� �Է�");
		a=s.nextInt(); // ���� ���·� �Է¹ްڴ�. 
		
		if(a>=90)
			System.out.println("A");
		else
			if(a>=80)
				System.out.println("B");
			else
				if(a>=70)
					System.out.println("C");
				else
					if(a>=60)
						System.out.println("D");
					else
						System.out.println("F");
		
		System.out.println(" �����Դϴ� \n");
		
	}
}
