package chapter08;
public class ReferenceConstructor {
  public static void main(String args[]) {
    ReferenceConstructor reference = new ReferenceConstructor();
    reference.makeMemberObject();
  }
  public void makeMemberObject() {
    MemberDTO dto1 = new MemberDTO();
    MemberDTO dto2 = new MemberDTO("Eunji");
    MemberDTO dto3 = new MemberDTO("Eunji", "010XXXXYYYY");
    MemberDTO dto4 = new MemberDTO("Eunji", "010XXXXYYYY", "ieunji2@email.com");
    System.out.println(dto4);
  }
}