
public class Page120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="IT CookBook �Դϴ�."; //�޸� �ø��� �Ҵ� �ްڴ�. str1��. ����Ȱ� ������ ����
		String str2="10"; //���ڿ� ó���Ҷ� ���� " "<���ڿ��̴�.
 		String str3="20";
		
		str1="java�Դϴ�."; // ������ ���� �ٲٱ�. �̹� �տ��� ������ �������� ������ �����ϴ°Ŷ� �� ����
		
		System.out.printf("%s \n",str1);
		System.out.printf("%s \n",str2+str3);
		
		int num1=Integer.parseInt(str2); //int�Լ� �� ����ؼ� ������Ÿ���� �ٲ���
		int num2=Integer.parseInt(str3);
		System.out.println("���ϱ� ���:"+(num1+num2));
	}
}
