package chapter08;
public class ReferencePass {
  public static void main(String args[]) {
    ReferencePass reference = new ReferencePass();
    // reference.callPassByValue();
    reference.callPassByReference();
  }
  public void callPassByValue() {
    int a = 10;
    String b = "b";
    System.out.println("before passByValue");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
    passByValue(a, b);
    System.out.println("after pssByValue");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }
  public void passByValue(int a, String b) {
    a = 20;
    b = "z";
    System.out.println("in passByValue");
    System.out.println("a=" + a);
    System.out.println("b=" + b);
  }
  public void callPassByReference() {
    MemberDTO member = new MemberDTO("ieunji");
    System.out.println("before passByReference");
    System.out.println("member.name=" + member.name);
    // passByReference(member);
    noPassByReference(member);
    System.out.println("after passByReference");
    System.out.println("member.name=" + member.name);
  }
  public void passByReference(MemberDTO member) {
    member.name = "LEEEUNJI";
    System.out.println("in PassByReference");
    System.out.println("member.name=" + member.name);
  }
  public void noPassByReference(MemberDTO member) {
    member = new MemberDTO("TEST");
    System.out.println("in noPassByReference");
    System.out.println("member.name=" + member.name);
  }
}
