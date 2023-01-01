package chapter08;
public class ManageStudent {
  public static void main(String args[]) {
    Student[] students = null;
    ManageStudent manage = new ManageStudent();
    // students = manage.addStudent();
    // manage.printStudents(students);
    manage.checkEquals();
  }
  public Student[] addStudent() {
    Student[] students = new Student[3];
    students[0] = new Student("Lim");
    students[1] = new Student("Min");
    students[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
    return students;
  }
  public void printStudents(Student[] students) {
    for (Student student : students) {
      System.out.println(student);
    }
  }
  public void checkEquals() {
    Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
    Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
    if (a.equals(b)) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
    System.out.println("a hashCode ::: " + a.hashCode());
    System.out.println("a.name hashCode ::: " + a.name.hashCode());
    System.out.println("b hashCode ::: " + b.hashCode());
    System.out.println("b.name hashCode ::: " + b.name.hashCode());
    // -- hashCode Override 이전 --
    // a hashCode ::: 366712642
    // a.name hashCode ::: 77362
    // b hashCode ::: 1829164700
    // b.name hashCode ::: 77362
    // -- hashCode Override 이후 --
    // a hashCode ::: -699071563
    // a.name hashCode ::: 77362
    // b hashCode ::: -699071563
    // b.name hashCode ::: 77362

  }
}