package backjoon.브루트포스;

import java.util.Scanner;

public class 분해합_2231 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        for (int i = 0; i <n ; i++) {
            int num=i;
            int sum=i;
            while(num>0){
                sum=sum+(num%10);
                num/=10;
            }
            if(n==sum){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}
