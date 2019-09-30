public class Main {

    public static void main(String[] args) {
        //different variables
        // byte : 8 short: 16 int:32 long: 64

        System.out.println("hello world");



        byte byteNumber = Byte.MAX_VALUE;
        byte minByteNumber = Byte.MIN_VALUE;
        short minShortNumber = Short.MIN_VALUE;
        short shortNumber = Short.MAX_VALUE;
        int intNumber = Integer.MAX_VALUE;
        int minIntNumber = Integer.MIN_VALUE;
        long longNumber = Long.MAX_VALUE;
        long minLongNumber = Long.MIN_VALUE;


        System.out.println("byte max number value is "+ byteNumber);
        System.out.println("byte min number value is "+ minByteNumber);
        System.out.println("shot max number value is "+ shortNumber);
        System.out.println("short min number value is "+ minShortNumber);
        System.out.println("integer max number value is "+ intNumber);
        System.out.println("integer min number value is "+ minIntNumber);
        System.out.println("long max number value is "+ longNumber);
        System.out.println("long min number value is "+ minLongNumber);

        byte aByteValue =60;
        byte anotherBytevalue = (byte)(aByteValue/2);
        // using "casting "
        System.out.println(anotherBytevalue);

        int a = 130;
        //truncated
        byte b= (byte)a;
        System.out.println(b);

        byte x = 127;
        //all good
        int y = x;
        System.out.println(y);

    }

}
