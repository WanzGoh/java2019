import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArrayTest {

    public static void arrayTest() {
        //string student array
        String[] students = new String[6];

        students[0] = "daniel";
        students[1] = "sina";
        students[2] = "hamed";
        students[3] = "satoshi";
        students[4] = "jose";
        students[5] = "mariana";

        System.out.println("students[2] = " + students[2]);

        //integer numbers array
        int[] numbers = {5, 17, 35, 4, 2, 7, 4, 2, 6, 8};

        System.out.println("numbers[5] = " + numbers[5]);

        //System.out.println(numbers[20]);

        double[] marks = new double[]{95.0, 94.2, 99.6, 100, 94.5, 75.3};

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);

        }

        //uninitialized array are automadgically intialzed with
        //if type is int or double 0
        //if type is String null
        String[] emptyArray = new String[10];
        for (int j = 0; j < emptyArray.length; j++) {
            System.out.println("emptyArray[" + j + "] = " + emptyArray[j]);

        }
        //sort the marks array
        System.out.println("sorted marks array");
        Arrays.sort(marks);
        for (int k = 0; k < marks.length; k++) {
            System.out.println("marks[" + k + "] = " + marks[k]);

        }
        //binary search will work with sorted array
        int number = 100;
        int indexForMarks = Arrays.binarySearch(marks, number);
        System.out.println("the index of " + number + " is " + indexForMarks);

        //for each loop
        for (Object student : students) {
            //copy
            student = "hahahaha";
            System.out.println(student);
        }
        System.out.println("print after hahaha");
        for (Object student :
                students) {
            System.out.println(student);
        }


    }


    public static void twoDArray() {
        //create 2 dimenstional array
        int[][] num = new int[2][10];

        int row = num.length;
        int col = num[0].length;


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num[i][j] = (j + 1) + i * col;
            }

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (num[i][j] < 10) {
                    System.out.print(" " + num[i][j] + " ");
                } else {
                    System.out.print(num[i][j] + " ");
                }
            }
            System.out.println(" ");
        }

        double[][] twoDarray = {
                {1.0, 2.0, 3.0, 4.0},
                {1.1, 1.2, 1.3, 1.4},
                {2.1, 2.2, 2.3, 2.4}
        };
        System.out.println(twoDarray[2][2]);
    }

    public static void threeDarray() {
        int[][][] threeArr = new int[3][4][5];
        int count = 1;
        for (int i = 0; i < threeArr.length; i++) {
            for (int j = 0; j < threeArr[i].length; j++) {
                for (int k = 0; k < threeArr[i][j].length; k++) {
                    threeArr[i][j][k] = count;
                    count++;

                }
            }
        }
        for (int i = 0; i < threeArr.length; i++) {
            System.out.println((i + 1) + " Daimantion Array");
            for (int j = 0; j < threeArr[i].length; j++) {
                for (int val : threeArr[i][j]) {

                    System.out.print(" " + val + " ");
                }
                System.out.println(" ");
            }
        }
    }

    static void copyPrime(){
        int[] primeNumbers = new int[]{2,3,5,7,11,13,19,23};
        int[] reference = primeNumbers;

        System.out.println("reference[2] :"+ reference[2]);//5
        reference[2] = 0;
        System.out.println("primeNumbers[2] : " + primeNumbers[2]); //0

        //int[] copy = primeNumbers.clone();
        int[]copy = Arrays.copyOf(primeNumbers,9);

        System.out.println("copy[2] : " + copy[2]);
        copy[2] = 50;
        System.out.println("primeNumbers[2] : " + primeNumbers[2]);//0
        printArr(primeNumbers);
        printArr(reference);
        printArr(copy);

        int[] revArr = reverseArr(primeNumbers);
        printArr(revArr);



    }



    private static void printArr(int[] arr){
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    private static int[] reverseArr(int[] arr) {
        int[] newArr  = arr.clone();
        int middle = newArr.length/2;
        int lastIndex = newArr.length -1;
        int temp;

        for (int i = 0; i < middle; i++) {
            temp = newArr[i];
            newArr[i] = newArr[lastIndex];
            newArr[lastIndex] = temp;
        }
        return newArr;

    }
}