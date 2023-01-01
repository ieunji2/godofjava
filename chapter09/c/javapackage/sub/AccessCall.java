package chapter09.c.javapackage.sub;

public class AccessCall {
  public static void main(String args[]) {
    AccessModifier accessModifier = new AccessModifier();
    accessModifier.publicMethod();
    accessModifier.protectedMethod();
    accessModifier.packagePrivateMethod();
    // accessModifier.privateMethod(); // 컴파일 에러
  }
}
