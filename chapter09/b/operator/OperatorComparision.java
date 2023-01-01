package chapter09.b.operator;
public class OperatorComparision {
    public static void main(String[] args) {
        OperatorComparision operator = new OperatorComparision();
        // operator.comparison();
        // operator.comparison2();
        // operator.doBlindDate(40);
        // operator.doBlindDate(80);
        // operator.casting();
        operator.casting2();
    }
    public void comparison() {
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;
        System.out.println(intValue1 == intValue2);
        System.out.println(intValue1 == intValue3);
        
        System.out.println(intValue1 != intValue2);
        System.out.println(intValue1 != intValue3);
    }
    public void comparison2() {
        char charValue = 'a';
        System.out.println(97 == charValue);
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue);
    }
    
    // OperatorConditionalTriple
    public boolean doBlindDate(int point) {
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
        return doBlindDateFlag;
    }
    
    // OperatorCasting
    public void casting() {
        byte byteValue = 127;
        short shortValue = byteValue;
        
        shortValue++;
        System.out.println(shortValue);
        byteValue = (byte)shortValue;
        System.out.println(byteValue);
    }
    public void casting2() {
        short shortValue = 256;
        byte byteValue = (byte)shortValue;
        System.out.println(byteValue); // 0
        shortValue = 255;
        byteValue = (byte)shortValue;
        System.out.println(byteValue); // 왜 -128이 아닌 -1이 나오는가...
    }
    // 00000001 00000000 256
    // 00000000 11111111 255
    // 1 2 4 8 16 32 64 128
}
