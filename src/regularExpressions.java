import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class regularExpressions {
    public static void regex(){
        String str = "I love, my love but love doesnt love my as i love my love";
        String betterStr = str.replace("doesnt", "doesn't");
        System.out.println(betterStr);

        //dot means any char
        System.out.println(betterStr.replaceAll(".","="));
        //replace is checking the target not the regex
        System.out.println(betterStr.replace(".","!"));
        //for escape the char we use \\ escape sequence
        System.out.println(betterStr.replaceAll("\\.","!"));
        System.out.println(betterStr.replaceAll("^I love","I am in love"));
        //for checking the last part of string we are using $ at the end
        System.out.println(betterStr.replaceAll("love$","LOVE"));
        red("this is going to be red");
        blue("this is going to be blue");
        //replace each o and e individually with *
        red(betterStr.replaceAll("[oe]","*"));
        red(betterStr.replaceAll("[oe]","*"));
        blue(betterStr.toUpperCase());
        blue(betterStr.toLowerCase());

        // All the v and t chars which is after o or u will be replaced
        red(betterStr.replaceAll("[ou][vt]","x"));
        // change all the itd chars to ITDC, check both the upper and lower case
        String password = "you email password is itdCanada 2019!";
        System.out.println(password.replaceAll("[i|I][t|T][d|D][c|C]","ITDC"));
        System.out.println(password.replaceAll("[iI][tT][dD][cC]","ITDC"));
        //replace every char except i t d c with *
        System.out.println(password.replaceAll("[youremilpswdtTCn019!]","*"));
        //easier way to check
        red(password.replaceAll("[^a2 ]","*"));
        //you can check with range
        red(password.replaceAll("[b-zA-Z0-13-9!]","*"));
        //its case sensitive
        blue(password.replaceAll("(?i)[b-z0-1-3-9!]","*"));
        // replace the digits only
        System.out.println(password.replaceAll("\\d","*"));
        // replace not the digits
        System.out.println(password.replaceAll("\\D","*"));
        // replace if its not a whitespace exculding punc
        red(password.replaceAll("\\w","*"));
        //replace if its a whitespace or punc
        red(password.replaceAll("\\W","*"));
        // replace whitespaces including or punc
        blue(password.replaceAll("\\s","*"));
        //replace if its no whitespace or punc
        blue(password.replaceAll("\\S","*"));


        String secret = "11aaa222bbb333cc44dd";
        //{} will check the char before ( in this case a repeated 2 times)
        System.out.println(secret.replaceAll("^11a{2}","x"));
        //+ will check the char before if repeats any time(int this case alll a will be )
        red((secret.replaceAll("^11a+","X")));
        // * will check if there is 0 or more char after previous
        red((secret.replaceAll("^11a*","X")));
        // check if repeated min and max limit
        red(secret.replaceAll("b{2,5}","-"));



//        String phoneNumber ="1";
//
//        while(phoneNumber!= "0") {
//            System.out.println("what is you number ? ex) (555) 555-5555");
//            System.out.print("Number : ");
//            Scanner sn = new Scanner(System.in);
//            phoneNumber=sn.nextLine();
//
//            System.out.println(phoneNumber.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[-]{1}[0-9]{4})$"));
//        }
        String ref1 = new String("peter pan");
        String ref2 = new String("peter pan");

        // == operator will check the reference are pointing to the same m
        //if(ref1 == ref2){
        //.equals() check if the values are same
        if(ref1.equals(ref2)){
            System.out.println("ref1 is == to ref 2");
        }else {
            System.out.println("ref 1 is not same with ref2");
        }

        //SELECT * FROM table WHERE id = 10;
        StringBuilder query = new StringBuilder("SELECT * FROM");
        query.append(" table");
        query.append(" WHERE");
        query.append(" id =");
        query.append(" 10");

        red(query.toString());





    }
    public static void blue(String msg){
        System.out.println("\u001B[96m" + msg +"\u001B[0m");
    }

    public static void red(String msg){
        System.out.println("\u001B[31m" + msg +"\u001B[0m");
    }

}
