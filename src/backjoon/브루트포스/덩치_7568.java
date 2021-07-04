package backjoon.브루트포스;

import java.util.Scanner;

public class 덩치_7568 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] weightAndHeight=new int[n][2];
        int[] rank=new int[n];
        for (int i = 0; i < n; i++) {
            weightAndHeight[i][0]=sc.nextInt(); // weight
            weightAndHeight[i][1]=sc.nextInt(); //height
        }
        for (int i = 0; i <n ; i++) {
            int cnt=1;//나보다 덩치가 큰사람 수
            for (int j = 0; j <n ; j++) {
                if(i==j)continue;
                if(weightAndHeight[i][0]<weightAndHeight[j][0] && weightAndHeight[i][1] <weightAndHeight[j][1]){
                    cnt++;
                }
            }
            rank[i]=cnt;
        }
        for (int num : rank) {
            System.out.print(num+" ");
        }
    }
}
