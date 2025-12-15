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

<details><summary>LinkedList</summary>
데이터를 빈번하게 삽입, 삭제할 때 효율적인 자료 구조

- java.util 패키지에 포함되어 있음
- 기본적으로 이중 연결리스트 Doubly Linked List로 구현되어 있음.
- 사용 방법
```
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();

LinkedList<Integer> numbers = new LinkedList<>();
```

- 리스트 중간에서 요소 삽입, 삭제 시 O(1)의 시간이 소요
- 특정 인덱스 접근 시 순차 탐색 O(n)의 시간이 소요

주요 메서드
- add(idx, element) : 특정 인덱스에 요소 삽입
- get(idx) : 특정 인덱스 요소 반환
- remove(idx) : 특정 인덱스 요소 제거
- addFirst(element), addLast(element)
- removeFirst(), removeLast()
- getFirst(), getLast()
- poll() : 가장 앞 요소 제거 및 반환
- peek() : 가장 앞 요소 반환 (제거X)
</details>

<details><summary>주요 패키지</summary>

## java.util
다양한 자료구조와 유틸리티 클래스를 제공

### 주요 자료구조 (Collections)
- ArrayList
  - 동적 배열
  - 데이터 저장 및 인덱스 접근 빠름 O(1)
  - 삽입 삭제 느림 O(n)

- LinkedList
  - 연결리스트
  - 큐 Queue나 덱 duque 구현에 사용
  - 데이터 삽입/삭제 빠름 O(1)
  - 데이터 특정 인덱스 접근 느림 O(n)

- HashMap
  - 키 - 값 쌍 저장
  - 키를 이용한 탐색/삽입/삭제 매우 빠름 O(1)
  - 빈도 수 계산, 매핑 등에 필수

- HashSet
  - 중복 허용하지 않는 집합
  - 중복 제거에 사용
  - 특정 요소 존재 여부 확인 빠름 O(1)

- PriorityQueue
  - 우선순위 큐 (힙 구조)
  - 데이터가 우선순위에 따라 정렬됨
  - 최솟값 또는 최댓값 추출에 빠름 O(logn)
  - 다익스트라, 힙 정렬에 필수

- ArrayDeque
  - 덱 
  - 양쪽 끝에서 삽입/삭제가 가능한 큐
  - 스택과 큐 모두 구현할 수 있어 유리


### 유틸리티 클래스
- Scanner
  - 적은 양의 데이터 빠르고 간단하게 읽을 수 있음

- StringTokenizer
  - 문자열 분리
  - BufferedReader로 읽은 한 줄의 문자열을 공백 등 구분자로 쪼갤 때 사용

- Collections
  - 컬렉션 조작 헬퍼
  - Collections.sort(), 최댓값 최솟값 찾기 등 사용

- Arrays
  - 배열 조작 헬퍼
  - 배열의 정렬 Arrays.sort() 
  - 검색, 복사 등에 사용


## java.io
외부 소스에서 데이터를 읽고 쓰는 통로(스트림) 관리

대량 데이터 입력 받을 때 속도 개선 위해 필수

- BufferedReader
  - Scanner보다 훨씬 빠름
  - 콘솔/파일 입력 시 대량의 데이터 효율적 처리

- InputStreaReader
  - 바이트 스트림을 문자 스트림으로 변환
  - System.in 바이트 를 BufferedReader가 처리할 수 있는 Reader로 연결하는 다리 역할

- BufferedWriter
  - 출력 버퍼링을 통한 속도 개선
  - System.out.println보다 훨씬 빠름

- IOException
  - 입출력 오류 처리
  - BufferedReader 사용 시 필수로 처리해야 하는 Checked Exception
  - 주로 throws IOException으로 처리



예시
```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
  }
}
```
</details>