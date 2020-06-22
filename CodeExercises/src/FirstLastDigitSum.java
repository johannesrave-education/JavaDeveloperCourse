package src;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0) return -1;
        int firstDigit = number;
        int lastDigit = number;
        
        lastDigit = lastDigit%10;
        while (number>0){
            firstDigit=number%10;
            number/=10;
        }
        return firstDigit+lastDigit;
    }
}