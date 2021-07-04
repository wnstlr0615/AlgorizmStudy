package sort.bobble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BobbleSort {
    public ArrayList<Integer>  sort(ArrayList<Integer> dataList){
        for (int i = 0; i <dataList.size()-1 ; i++) {
            for (int j = 0; j <dataList.size()-1-i ; j++) {
                if(dataList.get(j)>dataList.get(j+1)){
                    Collections.swap(dataList, j, j+1);
                }
            }
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> randomList=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add((int) (Math.random()*100));
        }
        BobbleSort bobbleSort = new BobbleSort();
        System.out.println(bobbleSort.sort(randomList));
    }
}
