package sort.merge;

import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList){
        ArrayList<Integer> mergeList = new ArrayList<>();
        int leftPoint=0;
        int rightPoint=0;

        while(leftList.size()>leftPoint && rightList.size()>rightPoint){
            if(leftList.get(leftPoint)>rightList.get(rightPoint)){
                mergeList.add(rightList.get(rightPoint++));
            }
            else{
                mergeList.add(leftList.get(leftPoint++));
            }
        }

        while(leftList.size()>leftPoint){
                mergeList.add(leftList.get(leftPoint++));
            }
            while(rightList.size()>rightPoint){
                mergeList.add(rightList.get(rightPoint++));
            }
        return mergeList;
    }
    public ArrayList<Integer>mergeSplitFunc(ArrayList<Integer> dataList){
       if(dataList.size()<=1){
           return dataList;
       }
       int midIdx=dataList.size()/2;
       ArrayList<Integer> leftList=mergeSplitFunc(new ArrayList(dataList.subList(0, midIdx)));
       ArrayList<Integer> rightList=mergeSplitFunc(new ArrayList(dataList.subList(midIdx, dataList.size())));
       return mergeFunc(leftList, rightList);

    }
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add((int) (Math.random()*100));
        }
        MergeSort mergesort=new MergeSort();
        ArrayList<Integer> sortedList = mergesort.mergeSplitFunc(randomList);
        System.out.println(sortedList);
    }
}
