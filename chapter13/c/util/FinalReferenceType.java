package chapter13.c.util;

import chapter13.c.model.MemberDTO;

public class FinalReferenceType {
  final MemberDTO dto = new MemberDTO();
  public static void main(String args[]) {
    FinalReferenceType referenceType = new FinalReferenceType();
    referenceType.checkDTO();
  }
  public void checkDTO() {
    System.out.println(dto);
    // dto = new MemberDTO(); // 컴파일 에러
    dto.name = "ieunji";
    System.out.println(dto);
  }
}
