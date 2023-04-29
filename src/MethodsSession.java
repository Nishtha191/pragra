public class MethodsSession {
static int sum;
    public static void main(String args[]){
    int s;
        s = doSum(5,6);
        double a = doSum(3,4.4);

            System.out.println(a);
        System.out.println(s);
        displayVoid();

    }
    static int doSum(int a , int b){
               sum  = a + b + sum ;
               System.out.println(sum);
        return sum;


    }
    static double doSum(int a , double b){
        double sum = a + b;
        return sum;

    }

    static  void displayVoid(){
        System.out.println("Void Method");
    }

}
