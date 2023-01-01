package chapter05;
public class OperatorTilde {
    public static void main(String[] args) {
        OperatorTilde operator = new OperatorTilde();
        byte b=127;
        operator.printTildeResult(b);
        // 0111 1111
        // 1000 0000
        b=1;
        operator.printTildeResult(b);
        // 0000 0001 ???
        // 1111 1110 ???
        // 1000 0010 ???
    }
    public void printTildeResult(byte b) {
        System.out.println("Original value="+b);
        System.out.println("Tilde value="+~b);
    }
}
