# Chapter 02 Hello God of Java
1. public static void
다시 말해서
public : 어떤 클래스에서도 접근 가능하며
static : static 메소드이며 (객체를 생성하지 않아도 접근 가능한 메소드이며 "C.1"장에서 자세히 살펴본다.)
void : 리턴 값이 없음
을 의미한다. 

2. String args[]
즉, String문자열의 배열이 들어간다. 이 배열에 대한 설명은 "B.4"장에서 자세히 살펴본다.

3. public static void main(String args[]) 로 선언되어 있는 메소드가 클래스에 없으면, 해당 클래스를 실행할 수는 없다.

4. System.out.println() 메소드는 자바를 실행한 창에서 문자열을 출력하는데 사용된다. 


5. System.out.print() 메소드는 줄바꿈을 하지 않기 때문에, 이 메소드 호출 후에 출력 메소드를 호출하면 같은 줄에 결과가 출력된다. 
하지만, System.out.println() 메소드는 내용을 출력한 다음에 줄바꿈을 한다.

6. //는 한 줄 주석을 의미한다. 따라서, 해당 코드의 // 뒤에 있는 모든 내용은 무시된다.

7. /*으로 시작하여 */으로 끝나는 주석은 블록 주석으로, 해당 블록 내의 모든 내용은 무시된다.

8. 메소드에는 반드시 "리턴 타입", "메소드 이름", "메소드 내용"이 있어야만 한다. 
