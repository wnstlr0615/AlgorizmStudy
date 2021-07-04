package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int cnt=0;
        int start=666;
        while(cnt<n){
            if(findThreeSix(start)) {cnt++;}
            start++;
        }
        System.out.println(start-1);
    }

    private static boolean findThreeSix(int start) {
        int num=start;
        int sixCnt=0;
        while(num>0){
            if(num%10==6){
                sixCnt++;
            }else{
                sixCnt=0;
            }
            if(sixCnt>=3)return true;
            num/=10;
        }
        return false;
    }

}
