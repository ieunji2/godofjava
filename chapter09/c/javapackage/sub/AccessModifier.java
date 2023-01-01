package chapter09.c.javapackage.sub;

public class AccessModifier {
  public void publicMethod() {
    // 누구나 접근 가능
  }
  protected void protectedMethod() {
    // 같은 패키지 내에 있거나 상속받은 경우에만 접근 가능
  }
  void packagePrivateMethod() {
    // 같은 패키지 내에 있을 때만 접근 가능
  }
  private void privateMethod() {
    // 해당 클래스 내에서만 접근 가능
  }
}
