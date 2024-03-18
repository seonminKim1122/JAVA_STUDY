#### 기본형과 참조형
- 기본형 : 논리형, 문자형, 정수형, 실수형 등을 의미하며 '실제 값'을 저장
- 참조형 : 객체의 주소를 저장, 기본형을 제외한 모든 타입이 참조형

<br></br>
## 기본형(Primitive Type)
총 8개의 타입이 존재하며 크게 4가지 타입으로 구분

- 논리형 : boolean
- 문자형 : char
- 정수형 : byte, short, int, long
- 실수형 : float, double

문자형도 내부적으로는 정수(유니코드) 로 저장이 되므로 boolean 을 제외한 나머지 7가지 자료형끼리 연산과 변형이 가능

각 자료형의 크기
- boolean : 1byte
- char : 2byte
- byte : 1byte 
- short : 2byte
- int : 4byte
- long : 8byte
- float : 4byte
- double : 8byte

<br></br>

## 상수와 리터럴
- 상수 : 한 번 값을 저장하면 다른 값으로 변경 불가 (final 키워드 사용)
```java
final int MAX_SPEED = 10;
```
상수는 선언과 동시에 초기화를 해야하며 변경이 허용되지 않는다.<br>
상수의 이름은 모두 대문자로 하는 것이 관례!!!

#### 리터럴(literal)
