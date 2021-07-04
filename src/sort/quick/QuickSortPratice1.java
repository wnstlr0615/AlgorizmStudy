package sort.quick;

import java.util.ArrayList;

public class QuickSortPratice1 {
    public ArrayList<Integer> sort(ArrayList<Integer> dateList){
        if(dateList.size()<=1){
            return dateList;
        }

        int pivot=dateList.get(0);

        ArrayList<Integer> leftList = new ArrayList<>();
        ArrayList<Integer> rightList = new ArrayList<>();

        for (int i = 1; i < dateList.size(); i++) {
            int num=dateList.get(i);
            if(num>pivot) rightList.add(num);
            else leftList.add(num);
        }
        ArrayList<Integer> mergeList = new ArrayList<>();
        mergeList.addAll(sort(leftList));
        mergeList.add(pivot);
        mergeList.addAll(sort(rightList));
        return mergeList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add((int) (Math.random()*100));
        }
        QuickSortPratice1 quickSortPratice1 = new QuickSortPratice1();
        System.out.println(quickSortPratice1.sort(randomList));
    }
}
