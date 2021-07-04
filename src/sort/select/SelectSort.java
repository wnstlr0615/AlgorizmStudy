package sort.select;

import java.util.ArrayList;
import java.util.Collections;

public class SelectSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        for (int i = 0; i <dataList.size()-1 ; i++) {
            int minIdx=i;
            for (int j = i+1; j <dataList.size() ; j++) {
                if(dataList.get(minIdx)>dataList.get(j)){
                    minIdx=j;
                }
            }
            Collections.swap(dataList, i, minIdx);
        }
        return dataList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> randomList=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add((int) (Math.random()*100));
        }
        SelectSort selectSort = new SelectSort();
        System.out.println(selectSort.sort(randomList));
    }
}
