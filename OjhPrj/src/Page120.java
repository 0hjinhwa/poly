
public class Page120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="IT CookBook 입니다."; //메모리 올릴때 할당 받겠다. str1로. 저장된건 오른쪽 내용
		String str2="10"; //문자열 처리할때 쓴다 " "<문자열이다.
 		String str3="20";
		
		str1="java입니다."; // 날리고 값을 바꾸기. 이미 앞에서 가져다 만들어놨기 때문에 수정하는거라 안 붙임
		
		System.out.printf("%s \n",str1);
		System.out.printf("%s \n",str2+str3);
		
		int num1=Integer.parseInt(str2); //int함수 를 사용해서 데이터타입을 바꿔줌
		int num2=Integer.parseInt(str3);
		System.out.println("더하기 결과:"+(num1+num2));
	}
}
