package chapter10.c.inheritance;

public class ChildPrint extends Parent {
  public ChildPrint() {
    System.out.println("ChildPrint constructor");
  }
  public void printAge() {
    System.out.println("printAge() - 18 month");
  }
}
