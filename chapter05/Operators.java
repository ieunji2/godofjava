package chapter05;
public class Operators {
    public static void main(String[] args) {
        Operators op = new Operators();
        // op.additive();
        // op.multiplicative();
        // op.divideInt();
        // op.divideInt2();
        op.remainder();
    }
    public void additive() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 + intValue2;
        System.out.println(result);
        result = intValue2 - intValue1;
        System.out.println(result);
    }
    public void multiplicative() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 * intValue2;
        System.out.println(result);
        result = intValue2 / intValue1;
        System.out.println(result);
    }
    public void divideInt() {
        int intValue1 = 5;
        int intValue2 = 10;
        int result = intValue1 / intValue2;
        System.out.println(result);
    }
    public void divideInt2() {
        double doubleValue1 = 5;
        double doubleValue2 = 10;
        double result = doubleValue1 / doubleValue2;
        System.out.println(result);
    }
    public void remainder() {
        int intValue1 = 50;
        int intValue2 = 10;
        int result = intValue1 % intValue2;
        System.out.println(result);
    }
    // 복합대입연산자들 Compound Assignment Operator
    // +=
    // -=
    // *=
    // /=
    // %=
}
