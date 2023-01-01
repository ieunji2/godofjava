package chapter22.d.collection.practice;

import java.util.ArrayList;

public class ManageHeight {
  ArrayList<ArrayList<Integer>> gradeHeights = new ArrayList<>();
  public static void main(String[] args) {
    ManageHeight manage = new ManageHeight();
    manage.setData();
    // for (int loop=0; loop<5; loop++) {
    //   manage.pringHeight(loop+1);
    // }
    int grade = 1;
    while(grade <= 5) {
      manage.printAverage(grade);
      grade++;
    }
  }
  public void setData() {
    ArrayList<Integer> classNo1 = new ArrayList<>();
    classNo1.add(170);
    classNo1.add(180);
    classNo1.add(173);
    classNo1.add(175);
    classNo1.add(177);
    gradeHeights.add(classNo1);
    ArrayList<Integer> classNo2 = new ArrayList<>();
    classNo2.add(160);
    classNo2.add(165);
    classNo2.add(167);
    classNo2.add(186);
    gradeHeights.add(classNo2);
    ArrayList<Integer> classNo3 = new ArrayList<>();
    classNo3.add(158);
    classNo3.add(177);
    classNo3.add(187);
    classNo3.add(176);
    gradeHeights.add(classNo3);
    ArrayList<Integer> classNo4 = new ArrayList<>();
    classNo4.add(173);
    classNo4.add(182);
    classNo4.add(181);
    gradeHeights.add(classNo4);
    ArrayList<Integer> classNo5 = new ArrayList<>();
    classNo5.add(170);
    classNo5.add(180);
    classNo5.add(165);
    classNo5.add(177);
    classNo5.add(172);
    gradeHeights.add(classNo5);
  }
  public void pringHeight(int classNo) {
    System.out.println("Class No.:" + classNo);
    for(int height:gradeHeights.get(classNo-1)) {
      System.out.println(height);
    }
  }
  public void printAverage(int classNo) {
    ArrayList<Integer> heights = gradeHeights.get(classNo-1);
    double sum = 0;
    for(int height:heights) {
      sum += height;
    }
    double average = sum/heights.size();
    System.out.println("Class No.:" + classNo);
    System.out.println("Height average:" + average);
  }
}
