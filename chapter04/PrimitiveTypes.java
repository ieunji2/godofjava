package chapter04;
public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        // types.checkByte();
        // types.checkOtherTypes();
        // types.checkChar();
        // types.checkBoolean();
    }
    public void checkByte() {
        byte byteMin = -128; // 1000 0000
        byte byteMax = 127; // 0111 1111
        System.out.println("byteMin = " + byteMin); // -128
        System.out.println("byteMax = " + byteMax); // 127
        byteMin = (byte)(byteMin - 1); // 1000 0000 - 1 = 0111 1111
        byteMax = (byte)(byteMax + 1); // 0111 1111 + 1 = 1000 0000
        System.out.println("byteMin - 1 = " + byteMin); // 127
        System.out.println("byteMax + 1 = " + byteMax); // -128
    }
    public void checkOtherTypes() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;
        System.out.println("shortMax = " + shortMax);
        System.out.println("intMax = " + intMax);
        System.out.println("longMax = " + longMax);
        shortMax = (short)(shortMax + 1);
        intMax = (int)(intMax + 1);
        longMax = (long)(longMax + 1);
        System.out.println("shortMax + 1 = " + shortMax);
        System.out.println("intMax + 1 = " + intMax);
        System.out.println("longMax + 1 = " + longMax);
    }
    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin = [" + charMin + "]");
        System.out.println("charMax = [" + charMax + "]");
        int intValue = 'a';
        System.out.println("intValue = [" + intValue + "]");
        char castValue = 44032;
        System.out.println("castValue = [" + castValue + "]");
        // char case6 = -1;
    }
    // ASCII 1byte 단위의 문자
    // 자바에서는 Unicode 2byte를 사용
    // ASCII가 할당된 값들이 먼저 나오고, 그 다음에 미리 정해져 있는 유니코드들이 존재한다.
    public void checkBoolean() {
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);
    }
    int intDefault1;
    public void defaultValues() {
        int intDefault2;
        System.out.println(intDefault1);
        System.out.println(intDefault2);
    }
} 
