package chapter05;
public class OperatorCompound{
    public static void main(String[] args) {
        OperatorCompound oc = new OperatorCompound();
        // oc.compound();
        // oc.unary();
        // oc.increment();
        oc.complement();
    }
    public void compound() {
        int intValue = 10;
        intValue += 5;
        System.out.println(intValue); // 15
        intValue -= 5;
        System.out.println(intValue); // 10
        intValue *= 5;
        System.out.println(intValue); // 50
        intValue /= 5;
        System.out.println(intValue); // 10
        intValue %= 5;
        System.out.println(intValue); // 0
    }
    public void unary() {
        int intValue = -10;
        int result = +intValue;
        System.out.println(result);
        result = -intValue;
        System.out.println(result);
    }
    public void increment() {
        int intValue = 1;
        System.out.println(intValue++);
        System.out.println(intValue);
        System.out.println(++intValue);
    }
    public void complement() {
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }
} 
