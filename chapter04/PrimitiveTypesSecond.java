package chapter04;
public class PrimitiveTypesSecond {
    int intDefault1;
    byte byteDefault;
    short shortDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    char charDefault;
    boolean booleanDefault;
    public static void main(String[] args) {
        PrimitiveTypesSecond second = new PrimitiveTypesSecond();
        second.defaultValues();
    }
    public void defaultValues() {
        System.out.println("byteDefault="+byteDefault); // 0
        System.out.println("shortDefault="+shortDefault); // 0
        System.out.println("intDefault1="+intDefault1); // 0
        System.out.println("longDefault="+longDefault); // 0
        System.out.println("floatDefault="+floatDefault); // 0.0
        System.out.println("doubleDefault="+doubleDefault); // 0.0
        System.out.println("charDefault="+charDefault); //
        System.out.println("booleanDefault="+booleanDefault); // false
    }
}
