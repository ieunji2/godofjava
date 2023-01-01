package chapter07;
public class ManageHeight {
  int[][] gradeHeights;

  public static void main(String args[]) {
    ManageHeight manage = new ManageHeight();
    manage.setData();
    // for (int grade=1; grade<=5; grade++) {
    //   manage.printHeight(grade);
    // }
    int grade = 1;
    while (grade <=5) {
      manage.printAverage(grade);
      grade++;
    }
  }
  public void setData() {
    gradeHeights = new int[5][];
    gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
    gradeHeights[1] = new int[]{160, 165, 167, 186};
    gradeHeights[2] = new int[]{158, 177, 187, 176};
    gradeHeights[3] = new int[]{173, 182, 181};
    gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
  }
  public void printHeight(int classNo) {
    System.out.println("Class No.:" + classNo);
    int index = classNo - 1;
    for (int height : gradeHeights[index]) {
      System.out.println(height);
    }
  }
  public void printAverage(int classNo) {
    System.out.println("Class No.:" + classNo);
    double sum = 0.0;
    int index = classNo - 1;
    for (int height : gradeHeights[index]) {
      sum += height;
    }
    double average = sum / gradeHeights[index].length;
    System.out.println("Height average:" + average);
  }
}