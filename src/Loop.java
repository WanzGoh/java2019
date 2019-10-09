import java.io.OutputStream;
import java.util.Scanner;

public class Loop {
    public static void loop() {
//        System.out.println("test from loop method");
//        // first one is conditional loop - while
//        // second one is counter loop - for
//
//
//        System.out.println("__________");
//        System.out.println("printing from 1 - 10 numbers \n");
//        for (int i = 1; i < 10; i++) {
//
//            System.out.println("hello " + i);
//
//        }
//        System.out.println("__________");
//        System.out.println("printing the power of 2 starting from 10 to 0\n");
//        for (int j = 10; j > 0; j--) {
//            System.out.println("2^" + j + " = " + (int) Math.pow(2, j));
//        }
//
//        for (char c = 'a'; c < 'z'; c++) {
//            System.out.print(c + " ");
//        }
//
//        System.out.println(" ");
//        int j = 0;
//        while (j < 10) {
//            System.out.println("while loop");
//            j++;
//
//        }
//        j = 0;
//        do {
//            System.out.println("do while loop");
//            j++;
//        } while (j < 10);
//
//        int k = 0;
//        while (k < 10) {
//            if(k % 2 == 0){
//                k++;
//                continue;
//            }
//            System.out.println("k value " + k);
//            k++;
//        }
//        System.out.println("hey how old are you?");
//        int age;
//        age= sn.nextInt();
//        System.out.println("you are "+ age + " years old");
//
//        String password;
//        System.out.print("Password :");
//        password= sn.next();
//        System.out.println("Password : ");
//        for (int l= 0; l < password.length(); l++){
//            System.out.print("*");
//        }
//        System.out.println(" ");
//        System.out.println("password encrypted");
//
//        System.out.print("E-mail address :");
//        String email = sn.next();
//        System.out.println("your email is "+ email);
////        String reverseEmail = "";
//        for (int u = email.length()-1 ; u >= 0 ; u--) {
//            //reverseEmail = reverseEmail + email.charAt(u);
//            System.out.print(email.charAt(u));
//        }
//        //System.out.print("reverse Email is ");
//        System.out.println(reverseEmail);

        Scanner sn = new Scanner(System.in);

        boolean exit = false;
        do {
            System.out.println("select one");
            System.out.println("1 - Multiples of 3 and 5");
            System.out.println("2 - under constructor");
            System.out.println("3 - under constructor");
            System.out.println("4 - under constructor");
            System.out.println("5 - Multiply");
            System.out.println("6 - Prime Number");
            System.out.println("7 - first 100 number is prime");
            System.out.println("8- calculateSalary");
            System.out.println("9- factoial number");
            System.out.println("10- fibonacci number");

            System.out.println("99 - Exit");

            int userChoice = sn.nextInt();

            switch (userChoice) {
                case 0:
                case 1:
                    MultiplesOf3And5();
                    break;

                case 2:
                    Numbers1To100n();
                    break;

                case 3: {
                    int num1, num2;
                    System.out.print("What is number 1? : ");
                    num1 = sn.nextInt();
                    System.out.print("What is number 2? : ");
                    num2 = sn.nextInt();
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                    break;
                }
                case 4: {
                    int num1, num2, num3;
                    System.out.print("What is number 1? : ");
                    num1 = sn.nextInt();
                    System.out.print("What is number 2? : ");
                    num2 = sn.nextInt();
                    System.out.print("What is number 3? : ");
                    num3 = sn.nextInt();

                    System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + add(num1, num2, num3));

                    break;
                }
                case 5:
                    System.out.println(multiply(2, 5));
                    break;
                case 6: {
                    int num;
                    System.out.print("which number? :");
                    num = sn.nextInt();
                    System.out.println(isPrime(num));
                }
                break;
                case 7:
                    for (int i = 1; i < 100; i++) {
                        //System.out.println(i + " is prime ? "+ isPrime(i));
                        if (isPrime(i)) {
                            System.out.println(i);
                        }

                    }
                    break;

                case 8:
                    String name;
                    System.out.println("What is you name?");
                    name = sn.next();
                    System.out.println("how many hours do you work ?");
                    double hours = sn.nextDouble();
                    System.out.println("how mach do you get annual Salary?");
                    double salary = sn.nextDouble();
                    calculateSalary(name, salary, hours);


                    break;

                case 9:
                    int num;
                    System.out.println("Enter number");
                    num = sn.nextInt();

                    for (int i = 0; i <= num; i++) {
                        System.out.println("the factorial number is " + i + " = " + factorial(i));

                    }
                    break;
                case 10:
                    System.out.println("Enter the fibo number");
                    int num1 = sn.nextInt();

                    for (int j = 0; j < num1; j++) {
                        System.out.println(j + " = " + fibo(j));
                        ;

                    }

                    break;

                case 11:
                    int number = 100;

                    increment(number);
                    break;
                case 12:
                    System.out.println(area(-1));

                    break;
                case 13:

                    break;

                default:
                    System.out.println("bye");
                    exit = true;

                    break;

            }


        } while (!exit);


    }

    //defalt parameters
    static void feeCalculation(double fee, int payment) {

        if (payment == 1) {
            System.out.println("you need to pay " + fee / 12 + " every month");

        }
        if (payment == 2)
            System.out.println("you need to pay " + fee / 4 + " every quarter");
    }

    static double area(double x) {
        return (x < 1) ? -1 : Math.PI * Math.pow(x, 2);
    }

    static double area(double circle, double circle2) {
        return 0;
    }

    static void increment(int number) {
        number++;
        System.out.println("increment number is " + number);
    }

    // recursion
    static int factorial(int number) {
        if (number < -1) {
            return -1;
        }
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
        // return (number< -1) ? -1 : (number == 1) ? 1 :number * factorial(number-1);
    }

    public static void calculateSalary(String name, double annualSalary, double workingHours) {

        // (40 * 4 )* 12 = annual salary
        // (annual / 12) / 4 / workingHours
        System.out.println();
        System.out.println("Hello," + name);
        System.out.format("you are making %.2f CAD/hours", annualSalary / 52 / workingHours);

    }

    //fibonacci
    public static long fibo(int number) {

        return (number < 1) ? -1 : (number == 1)
                ? 0 : (number == 2)
                ? 1 : (fibo(number - 2) + fibo(number - 1));

    }


    //unlimited parameters
    public static int multiply(int... nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            result *= nums[i];

        }
        return result;
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        // for (int i = 2; i * i < number); i++)
        for (int i = 2; i < (int) (Math.sqrt(number) + 1); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    //overloading add function
    public static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static void Numbers1To100n() {
        int n = 1;
        int sum = 0;
        for (int i = n; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void MultiplesOf3And5() {
        int sum = 0;
        for (int a = 1; a < 1000; a++) {
            if (a % 3 == 0 || a % 5 == 0) {
                sum = sum + a;
            }
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {

    }
}

