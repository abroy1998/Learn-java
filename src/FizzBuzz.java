import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the number:-");
        int x=scanner.nextInt();
        fizzbuzz(x);
    }
    private static void fizzbuzz(int num){
        for(int i=1;i<=num;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+"is FIZZBUZZ");
            }else if(i%5==0){
                System.out.println(i+"is BUZZ");
            }else if(i%3==0){
                System.out.println(i+"is FIZZ");
            }else{
                System.out.println(i);
            }
        }
    }
}
