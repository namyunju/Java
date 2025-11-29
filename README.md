# Java

<details>
<summary>자바 코드 구조</summary>
  
- 클래스 블록과 메서드 블록
- 하나의 클래스 블록 안에 여러 메서드 블록이 존재
  
## 클래스 블록
- 클래스명은 소스 파일의 이름과 일치해야 함.
- public class 클래스명 { 메서드 블록 }

```java
public class Sample {
  public static void main(String[] args) {
    System.out.println("Hello java");
  }
}
```
- 클래스명은 Sample.
- 접근제어자는 public. 어디서든 이 클래스에 접근 할 수 있음.

## 메서드 블록
[public / private / protected] [static] (반환 자료형) 메서드명(매개변수) {명령문}
- 메서드의 접근 제어자 public, private, protected
  - 셋 중 하나가 오거나 아무것도 오지 않을 수 있다.
- static
  - 메서드에 static 키워드가 붙으면 클래스 메서드가 되어 객체를 만들지 않아도 '클래스명.메서드명' 형태로 호출 가능
- 반환 자료형 void: 메서드 실행된 후 반환되는 값의 자료형을 의미. 반환값이 없다면 void. 이 항목은 반드시 존재해야 함.

## 속성과 생성자
```java
public class Sample{
  /* 속성 */
  private String message;

  /* 생성자 */
  public Sample(String message) {
    this.message = message;
  }
}
```
- 속성: 클래스의 상태를 나타내는 변수, 클래스 내부에 선언.
- 생성자: 클래스 인스턴스를 생성할 때 실행되는 메서드, 주로 속성을 초기화.

</details>

<details>
<summary>변수와 자료형</summary>
자료형: int, long, double, boolean, char, String, StringBuffer(변경 가능 문자열), List, Map, Set

## StringBuffer
StringBuffer 객체를 생성하고 문자열을 생성하는 예제
```java
StringBuffer sb = new StringBuffer(); // StringBuffer 객체 sb 생성
sb.append("hello");
sb.append(" ");
sb.append("jump to java");

String result = sb.toString(); // toString 
System.out.println(result); // hello jump to java 출력
```
- StringBuffer 자료형은 append 메서드를 사용하여 문자열을 계속해서 추가할 수 있음.
- toString() 메서드를 사용하면 StringBuffer를 String 자료형으로 변경할 수 있음.

### String과의 차이
```java
String result = "";
result += "hello";
result += " ";
result += "jump to java";
System.out.println(result); // hello jump to java 출력됨
```
- 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다르다.
- StringBuffer의 경우 StringBuffer 객체를 한 번 생성하지만, String은 매 연산마다 새로운 String 객체를 생성하므로 총 4개의 String 자료형 객체가 만들어짐.
- String 자료형은 값이 한 번 생성되면 변경할 수 없다. 또 다른 String 객체를 생성하여 반환할 뿐.
>> 문자열 추가 변경 작업 많으면 StringBuffer, 적으면 String 사용하는 것이 유리.

### 여러 가지 메서드
- insert
  - 특정 위치에 원하는 문자열을 삽입
  - sb.insert(0, "hello "); 0번째 위치에 문자열을 삽입
 
- delete
  - 특정 범위의 문자를 삭제
  - sb.delete(6,11); 6번째부터 10번째 까지 문자 삭제
 
- substring
  - sb.substring(0,4); 0번째부터 3번째까지 문자만
</details>
