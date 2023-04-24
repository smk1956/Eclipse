package tut03_TypeConv;

public class TypeConv {
	
	public static void main(String[] args) {
		//큰 수를 작은 타입에 저장하면 데이터 끝이 잘림
		//작은 수를 큰 타입에 저장하면 정상 저장
		//예) byte < char < int < float < double
		//형 변환(type Conversion)
		byte b = 127;
		int a = b; //왼쪽 = 오른쪽 : 오른쪽 값을 왼쪽에 대입
		           //왼쪽 == 오른쪽 : 같다
				   //equals 문자열 같다
				   //왼쪽 != 오른쪽 : 같지 않다.
		System.out.println(a);
		System.out.println("----------------------");
		
		//int(4) < float(4) < double(8)
		float f = 5.8f;
		int i = (int)f;
		System.out.println(i);
		System.out.println((double)i);
	}
}
