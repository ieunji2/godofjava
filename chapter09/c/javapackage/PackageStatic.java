package chapter09.c.javapackage;

import static chapter09.c.javapackage.sub.SubStatic.*;

public class PackageStatic {
  public static void main(String args[]) {
    subStaticMethod();
    System.out.println(CLASS_NAME);
  }

  public static void subStaticMethod() {
    System.out.println("packageStaticMethod() is called");
  }
}
