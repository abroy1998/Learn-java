/*
A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

153 is an Armstrong number.

153 has 3 numbers
so
1^3 * 5^3 + 3^3 = 153

Input: 120
Output: No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

Input: 1253
Output: No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723


Input: 1634
Output: Yes
1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
 */


import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input a number:-");
        int x=scanner.nextInt();
        System.out.println(x+ "is a Armstrong Number? "+checkArmStrongNumber(x));
    }

    public static boolean checkArmStrongNumber(int num){
        int copy=num;
        String s= String.valueOf(num);
        int len=s.length();
        int sum=0;
        while(num!=0){
            int temp=num%10;
            sum=sum+((int)Math.pow(temp,len));
            num=num/10;

        }
        if(sum==copy){
            return true;
        }else{
            return false;
        }
    }

}
