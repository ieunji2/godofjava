# Chapter 12 Object
1. Object 클래스는 java.lang 패키지에 선언되어 있다.

2. 클래스 파일만 갖고 클래스가 어떻게 선언되어 있는지 확인하려면 javap 명령을 사용하면 된다. 

3. Object 클래스에 선언되어 있는 메소드 중에서 필요한 메소드만 Overriding하여 사용하면 된다.

4. clone() 메소드는 객체를 복제하기 위해서 사용한다.

5. 참조 자료형을 System.out.println() 메소드에서 출력하면 toString() 메소드가 호출된 결과가 제공된다.

6. 참조 자료형의 비교는 equals() 메소드를 사용해야 확실히 비교가 가능하다.
만약 직접 구현한 클래스의 비교를 정확하게 하려면, 이 equals() 메소드를 Overriding하는 것이 좋다.

7. hashCode() 메소드는 int 타입의 결과를 리턴한다. 