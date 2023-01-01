package chapter13.c.service;

import chapter13.c.model.MemberDTO;

public interface MemberManager {
  public boolean addMember(MemberDTO member);
  public boolean removeMember(String name, String phone);
  public boolean updateMember(MemberDTO member);
}
