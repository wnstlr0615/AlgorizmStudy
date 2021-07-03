package sort.quick;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
       if(dataList.size()<=1){
           return dataList;
       }
       int pivot=dataList.get(0);
        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();
        for (int i = 1 ; i <dataList.size() ; i++) {
            if(dataList.get(i)>pivot)rightList.add(dataList.get(i));
            else leftList.add(dataList.get(i));
        }
        ArrayList<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(sort(leftList));
        mergeList.addAll(Arrays.asList(pivot));
        mergeList.addAll(sort(rightList));
        return mergeList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> randomList=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add((int) (Math.random()*100));
        }
        QuickSort quickSort = new QuickSort();
        System.out.println(quickSort.sort(randomList));
    }
}
