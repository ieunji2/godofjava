package chapter10.c.inheritance;

public class ChildArg extends ParentArg {
  public ChildArg() {
    // super("ChildArg");
    super(null);
    System.out.println("Child Constructor");
  }
}
