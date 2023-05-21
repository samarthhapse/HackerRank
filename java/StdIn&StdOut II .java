import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
double d = scan.nextDouble();
//Don,t do this mistake 
// String s = scan.nextLine();
//it will not run 
//3.412_
//Reason = now after double curser is still finding new digit
//cursoe is still here 3.412_
//so to take curser to next line
//use = scan.nextLine();
//now print your input line 
//String s = scan.nextLine();\
scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
