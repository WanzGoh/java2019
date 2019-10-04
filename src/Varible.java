import java.math.BigDecimal;

public class Varible {

    // global static variables are automaticly initialized with value
    static int intVal;
    static boolean isSleeping;

    public static void variables() {

        System.out.println("global intVal is "+intVal);

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

        // for long types use L at the end of value
        long longVal = 9_223_372_036_854_775_807L; //max long number
        System.out.println(longVal);

        double coffeePrice = 2.75;
        float teaPrice = 2.99f;

        int coffee = (int)coffeePrice;
        System.out.println("the int coffee price : "+ Math.round(coffee));
        System.out.println("the rounded tea price is : "+ Math.round(teaPrice));
        System.out.println("the rounded tea price is : "+ Math.floor(teaPrice));

        int q = 10 + 6 * 5;
        System.out.println(q);


        double dVal = .012;
        double sum = dVal + dVal + dVal;
        System.out.println(sum);

        BigDecimal bigValue = new BigDecimal(Double.toString(dVal));
        BigDecimal total = bigValue.add(bigValue).add(bigValue);
        System.out.println(total);


        boolean isLightOn = false;
        boolean amNotleeping = !isLightOn;
        System.out.println("is light on ? : " + isLightOn);
        System.out.println("Am I sleeping? "+ amNotleeping);

        char initial1 = 'S';
        char initial2 = '\u0298'; // unicode char

        System.out.println("the initial1 value is "+ initial1);
        System.out.println("the initial2 value is "+ initial2);

        String name = " I love coffee";
        System.out.println(name + "\n\n\n");
    }

    public static void main(String[] args) {

    }

}
