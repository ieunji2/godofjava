package chapter07;
public class ArrayLotto {
  public static void main(String[] args) {
    ArrayLotto array = new ArrayLotto();
    array.init();
  }
  public void init() {
    int [] lottoNumbers = new int[7];
    lottoNumbers[0] = 5;
    lottoNumbers[1] = 12;
    lottoNumbers[2] = 23;
    lottoNumbers[3] = 25;
    lottoNumbers[4] = 38;
    lottoNumbers[5] = 41;
    lottoNumbers[6] = 2;
    /* 예외 발생 */
    // lottoNumbers[8] = 9; // java.lang.ArrayIndexOutOfBoundsException: 8
    // System.out.println(lottoNumbers[7]); // java.lang.ArrayIndexOutOfBoundsException: 7
  }
}