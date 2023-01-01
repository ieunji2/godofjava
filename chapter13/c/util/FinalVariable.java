package chapter13.c.util;

public class FinalVariable {
  final int instanceVariable = 1;

  public void method(final int parameter) {
    final int localVariable;
    localVariable = 2;
    // localVariable = 3; // 컴파일 에러
    // parameter = 4; // 컴파일 에러
  }
}
