//특수문자중에 $,_ 는 사용할 수 없음
package java_20190715;
//클래스명의 첫글자는 대문자
//두단어가 합친 경우에는 camel case
public class IdentifierDemo {
	public static void main(String[] args) {
		int age = 10;
		String name = "hello";
		//첫글자로 숫자 사용할 수 없음
		String fatherName = "John";
		//공백을 사용할 수 없음
		String motherName = "Michell";
		//예약어는 변수(식별자)로 사용할 수 없음
		String oid = "empty";
		//자바는 유니코드를 지원하기 때문에 한글도 식별조로 사용
		//가능하지만 안쓰는게 좋음
		String 이름 = "성영한";
		System.out.println(이름);
	}
}
