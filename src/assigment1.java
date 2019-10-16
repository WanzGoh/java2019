//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//
//public class assigment1 {
//
//
//    public static void parkingCharge() {
//       /*
//       A parking garage charges a $2.00 minimum fee to park for up to three hours. The garage charges an additional
//       $0.50 per hour for each hour or part thereof in excess of three hours. The maximum charge for any given 24
//        hour period is $10.00 */
//        double minimum = 2;
//        double additional = 0.5;
//
//
//        boolean exit = false;
//        do {
//            Scanner sn = new Scanner(System.in);
//            // maximum is 24;
//            // user Menu
//            System.out.println("----------------------------------");
//            System.out.println(" Welcome to Daniel's parking zone! ");
//            System.out.println("   Please select to one menu       ");
//            System.out.println("   1. Parking (for three hours) ");
//            System.out.println("   2. Charge your parking fee  ");
//            System.out.println("   3. Cancel");
//            System.out.print("Number : ");
//            int userChoose = sn.nextInt();
//
//            switch (userChoose) {
//                case 1:
//
//                    System.out.println("thank you for come to daniel's parking zone");
//
//
//                    long time = System.currentTimeMillis();
//                    String carNum; // Car number
//                    SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");// today date detail hour for user
//                    String today = dayTime.format(new Date(time));
//                    String parking[]; // Save car number
//                    System.out.print("press you car number :");
//                    carNum = sn.nextline();
//                    carNum.matches("^([a-zA-Z||2-6||-|| ]{6}$");
//                    while (carNum == true) {// but is not working how to organized it ?
//
//                    }
//                    for (int i = 0; i < 30; i++) { // this is for organized of car numbers and save the parking array.
//                    }
//                    for (String j : parking) { // show the parking details. Car number , today date and clock;
//
//                        System.out.println("thank you" + " [ " + j + " ] " + today);
//                    }
//            }
//
//
//            break;
//            case 2:
//                // show all car number and it can select number of parking list number
//                System.out.println("select your car number");
//                System.out.println("");
//
//                break;
//            case 3:
//                //
//
//
//                break;
//            default:
//                System.out.println("Thank you");
//                exit = true;
//                break;
//        }
//    }while(!exit);
//
//
//}


//    public static void main(String[] args) {
//
//    }
// }
