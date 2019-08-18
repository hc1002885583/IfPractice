import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a=input.nextInt();
        System.out.println("请输入第二个整数：");
        int b=input.nextInt();
        int sum=a+b;
        System.out.println(sum);
        Scanner input1=new Scanner(System.in);
        int sum1=input.nextInt()+input1.nextInt();
        System.out.println(sum1);
    }
}
