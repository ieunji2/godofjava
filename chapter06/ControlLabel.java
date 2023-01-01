package chapter06;
public class ControlLabel {
    public static void main(String args[]) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
    }
    public void printTimesTable() {
        startLabel:
        for (int level = 2; level < 10; level++) {
            for (int unit = 1; unit < 10; unit++) {
                if (unit == 4) continue startLabel;
                System.out.print(level + "X" + unit + "=" + level*unit + " ");
            }
            System.out.println();
        }
    }
}
