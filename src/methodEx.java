import java.util.Scanner;

public class methodEx {
    public static void main(String args[]){
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a  =  sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        result=doSum(a,b);
        System.out.println(result);
    }
    static String doSum(int a , int b){
        int s;
        s= a+b;
        if(s%2 == 0){
            return "Sum of " + a + " & " + b + " is " + s + " which is even.";
        }
         return "Sum of " + a + " & " + b + " is " + s + " which is odd.";
    }
}
