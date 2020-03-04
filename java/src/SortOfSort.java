import java.util.Arrays;
public class SortOfSort {
    public static void main(String args[]) {
        int[] test = {1, 5, 8, 7, 9, 2};
        int[] expected = {7, 5, 1, 2, 8, 9};
sortOfSort(test);

    }

    public static void sortOfSort(int[] num) {
        int pointer1 = 0;
        int pointer2 = num.length - 1;
        int counter = 0;
        while (pointer1 != pointer2 && counter < num.length-1) {//max last element
            if (counter == 0) {
                int max = findMaxValue(num, pointer1);
                num[findMaxIndex(num, pointer1)] = num[pointer2];
                num[pointer2] = max;

                counter++;
                pointer2--;
            }
            if (counter % 2 == 0 || (counter / 2) % 2 ==0) {//max to the right
                int max = findMaxValue(num, pointer1);
                num[findMaxIndex(num, pointer1)] = num[pointer2];
                num[pointer2] = max;
                counter++;
                pointer2--;
            }
            if(counter % 2 != 0 || (counter / 2) != 0){//max to the left
                int max = findMaxValue(num, pointer1);
                num[findMaxIndex(num, pointer1)] = num[pointer1];
                num[pointer1] = max;
                pointer1++;
                counter++;
            }
        }
        print(num);

    }
    public static int findMaxValue(int[] num, int pointer1){
        int max = 0;
        for(int i = 0 + pointer1; i < num.length - 1 - pointer1 ; i++){
            if(num[i]>num[i+1]){
                 max = num[i];
            }
        }
        return max;
    }
    public static int findMaxIndex(int[] num, int pointer1){
        int max = 0;
        for(int i = 0 + pointer1; i < num.length - 1 -pointer1 ; i++){
            if(num[i]>num[i+1]){
                max =  i;
            }
        }
        return max;
    }
    public static void print(int[] num){
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i]);
        }
    }
}


