package src;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
            public static boolean hasSharedDigit(int number, int number2){
            if((number<10)||(number>99)||(number2<10)||(number2>99)) return false;
            while (number>0){
                while(number2>0){
                    if((number%10)==(number2%10)) return true;
                    number2/=10;
                }
                number/=10;
            }
            return false;
        }
    }