package chapter12.c.inheritance;
public class MemberDTO {
  public String name;
  public String phone;
  public String email;
  public MemberDTO() {
    // 아무 정보도 모를 때
  }
  public MemberDTO(String name) {
    // 이름만 알 때
    this.name = name;
  }
  public MemberDTO(String name, String phone) {
    // 이름과 전화번호만 알 때
    this.name = name;
    this.phone = phone;
  }
  public MemberDTO(String name, String phone, String email) {
    // 모든 정보를 알고 있을 때
    this.name = name;
    this.phone = phone;
    this.email = email;
  }
  // public String toString() {
  //   return "Name=" + name + " Phone=" + phone + " eMail=" + email;
  // }
  // public boolean equals(Object obj) {
  //   if (this == obj) return true;
  //   if (obj == null) return false;
  //   if (getClass() != obj.getClass()) return false;
  //   MemberDTO other = (MemberDTO) obj;
  //   if (name == null) {
  //     if (other.name != null) return false;
  //   } else if (!name.equals(other.name)) return false;
  //   if (email == null) {
  //     if (other.email != null) return false;
  //   } else if (!email.equals(other.email)) return false;
  //   if (phone == null) {
  //     if (other.phone != null) return false;
  //   } else if (!phone.equals(other.phone)) return false;
  //   return true;
  // }
  @Override
  public String toString() {
    return "MemberDTO [name=" + name + ", phone=" + phone + ", email=" + email + "]";
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((phone == null) ? 0 : phone.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    MemberDTO other = (MemberDTO) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (phone == null) {
      if (other.phone != null)
        return false;
    } else if (!phone.equals(other.phone))
      return false;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    return true;
  }
}