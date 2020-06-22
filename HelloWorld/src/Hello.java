public class Hello {

    public static void main(String[] args) {
        System.out.println("Hallo Johannes!");

        int myFirstNumber = (10 + 5) + (2 * 10 );
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        byte myByte = (byte)100;
        short myShort = (short)30000;
        int myInt = 700;
        long myResultingLong = 50000 + (10 * (myByte + myShort + myInt));
        System.out.println(myResultingLong);

    }
}
