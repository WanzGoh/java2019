public class conditions {
    public static void conditions() {
        //        int year = 2019;
////        year = year +1;
//
//        //pre increment
//        System.out.println(++year);
//        //post increment
//        System.out.println(year++);
//        //here the year value is 2021
//        System.out.println(year);
//
//        year %= 2;
//        System.out.println(year);

        //conditions
        //if blocks
        int age = 17;

        if (age >= 120) {
            System.out.println("Sorry you are dead :(");
        } else if (age >= 18) {
            System.out.println("you aer adult");
        } else {
            System.out.println("you are NOT adult");
        }
        boolean isLightOn = true;
        if (isLightOn) {
            System.out.println("can you turn off the light?");
        } else {
            System.out.println("can you turn on the light?");
        }

        //ternary operator
        int studentMark = 80;
        double gpa;
        //mark > 80 gpa = 4.0 otherwise gpa = 3.0

//        if (studentMark > 80){
//            gpa = 4.0;
//        }else {
//            gpa = 3.0;
//        }
        gpa = (studentMark >= 80) ? 4.0 : 3.0; // this is ternary operator

        System.out.println("student gpa is " + gpa);

        // 1 - green 2 - red
        int light = 2;
        boolean go;

        go = light != 2 ? true:false;
        System.out.println("Shoud i pass if the light is green? :" + go);
        System.out.println("Shoud i pass if the light is red? :" + !go);

        boolean parentpermission = false;

        if (age >= 18 || parentpermission){
            System.out.println("you are allowed to do stuff");
        }else {
            System.out.println("you need to grow up or you need permission");
        }

        if(age <18 && !parentpermission){
            System.out.println("you need to grow up or you need permission");
        }else {
            System.out.println("you are allow to do stuff");
        }
        int dayOfWeek = 3;

        switch (dayOfWeek){
            case 0:
                System.out.println("its Sunday");
                break;
            case 1:
                System.out.println("its Monday ");
                break;
            case 2:
                System.out.println("its Tuesday");
                break;
            case 3:
                System.out.println("its Wednesday");
                break;
            case 4:
                System.out.println("its Thursday");
                break;
            case 5:
                System.out.println("its Friday");
                break;
            case 6:
                System.out.println("its Satureday");
                break;
        }

    }

    public static void main(String[] args) {

    }
}
