import java.math.BigDecimal;



public class Main {

    public static void main(String[] args) {
//        varible.variables();
//        conditions.conditions();
//         Loop.loop();
        //ArrayTest.arrayTest();
        // ArrayTest.twoDArray();
        // ArrayTest.threeDarray();
        // ArrayTest.copyPrime();
        //assigment1.parkingCharge();
        //regularExpressions.regex();
        Car kia = new Car("kia","mohabi","black", 50.9d,true);
        System.out.println(kia.toString());
        Car car2 = new Car("hyundai","santafe","grey",30.3d,true);
        System.out.println(car2.toString());
        Car car3 = new Car("ford","pickupTruck","black",60.3d,false);
        System.out.println(car3.toString());

        Car car4 = new Car();
        car4.setMake("HOnda");
        car4.setModel("CiViL");
        System.out.println(car4.toString());

        House danielHouse= new House(13,4,3,false,"Vancouver",2700.00,1000000,true,"white");
        System.out.println(danielHouse.toString());
        House joseHouse = new House(2,3,1,1300.0);
        System.out.println(joseHouse.toString());
        House sayginHouse = new House();
        System.out.println(sayginHouse.toString());
    }
}