package backjoon.브루트포스;

import java.util.Scanner;

public class 체스판다시칠하기_1018 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String[] input=sc.nextLine().split(" ");
    int n=Integer.parseInt(input[0]);
    int m= Integer.parseInt(input[1]);
    char[][] board=new char[n][m];

        for (int i = 0; i <n ; i++) {
        String str=sc.nextLine();
        board[i]=str.toCharArray();
    }
    int minCnt=Integer.MAX_VALUE;
        for (int i = 0; i <= n-8 ; i++) {
        for (int j = 0; j <= m-8 ; j++) {
            int cnt = countBlackWhite(board, i, j);
            if(cnt<minCnt) minCnt= cnt;
        }
    }
        System.out.println(minCnt);

}
    private static int countBlackWhite(char[][] board, int row, int column) {
        int firstBlack=0;
        int firstWhite=0;
        boolean check=true;
        for (int i = row; i <row+8 ; i++) {
            for (int j = column; j <column+8 ; j++) {
                if(check){
                    if(board[i][j]!='B'){
                        firstBlack++;
                    }
                    if(board[i][j]!='W'){
                        firstWhite++;
                    }
                }else{
                    if(board[i][j]!='W'){
                        firstBlack++;
                    }
                    if(board[i][j]!='B'){
                        firstWhite++;
                    }
                }
                check=!check;
            }
            check=!check;
        }
        return Math.min(firstBlack, firstWhite);
    }
}

