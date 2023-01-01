package chapter04;
public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;
    
    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        byte age = 29;
        String name = "이은지";
        boolean isMarried = false;
        
        profile.setAge(age);
        profile.setName(name);
        profile.setMarried(isMarried);
        
        System.out.println("나이="+profile.getAge());
        System.out.println("이름="+profile.getName());
        System.out.println("결혼 여부="+profile.isMarried());
    }
    public void setAge(byte age) {
        this.age = age;
    }
    public byte getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMarried(boolean flag) {
        this.isMarried = flag;
    }
    public boolean isMarried() {
        return isMarried;
    }
}
