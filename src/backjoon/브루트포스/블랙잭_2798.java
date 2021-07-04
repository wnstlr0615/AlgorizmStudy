package backjoon.브루트포스;

import java.util.Scanner;

public class 블랙잭_2798 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int maxSum=0;
        for (int i = 0; i <n ; i++) {
            int x=arr[i];
            for (int j = 0; j <n ; j++) {
                if(i==j)continue;
                int y=arr[j];
                for (int k = 0; k <n ; k++) {
                    if(i==k || j==k)continue;
                    int z=arr[k];
                    int sum=x+y+z;
                    if(sum<=m && sum>maxSum){
                        maxSum=sum;
                    }
                }
            }

        }
        System.out.println(maxSum);
    }
}
