import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please input the first number:-");
        int input1=scanner.nextInt();
        System.out.println("Please input the second number:-");
        int input2=scanner.nextInt();
        int sum=plus(input1,input2);
        int sub=minus(input1,input2);
        int mul=multiplication(input1,input2);
        int div=divition(input1,input2);

        System.out.println("Sum of "+input1+ " and "+ input2+" is "+ sum);
        System.out.println("Sub of "+input1+ " and "+ input2+" is "+ sub);
        System.out.println("Mul of "+input1+ " and "+ input2+" is "+ mul);
        System.out.println("Div of "+input1+ " and "+ input2+" is "+ div);
    }
    private static int plus(int num1,int num2){
        //int sumOfNums =num1+num2;
        return num1+num2 ;
    }
    private static int minus(int num1,int num2){
       // int minusOfNums =num1-num2;
        return num1-num2;
    }
    private static int multiplication(int num1,int num2){
        //int multiplicationOfNums =num1*num2;
        return num1*num2;
    }
    private static int divition(int num1,int num2){
       // int divitionOfNums =num1/num2;
        return num1/num2;
    }
}
