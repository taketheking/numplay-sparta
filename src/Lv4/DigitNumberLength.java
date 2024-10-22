package Lv4;

public class DigitNumberLength {
    // 자리수 길이
    static int DigitNumberLength = 3;

    public static void setDigitNumberLength(int digitNumberLength) throws IllegalArgumentException {
        if(digitNumberLength < 3 || digitNumberLength > 5){
            throw new IllegalArgumentException("digitNumberLength must be between 3 and 5");
        }
        DigitNumberLength = digitNumberLength;
    }

    public static int getDigitNumberLength() {
        return DigitNumberLength;
    }

}