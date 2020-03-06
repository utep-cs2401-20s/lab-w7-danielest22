import java.util.Arrays;
public class SortOfSort {
    private int[] array;
    public SortOfSort(){
        int[] array = new int[0];
    }
    public SortOfSort(int[] array){
        this.array = new int[array.length];
        for(int i = 0; i<array.length; i++) {
                this.array[i] = array[i];
            }
    }

        public void sortOfSort(int[] givenArray) {

            int counter = 1;
            int maxIndex;
            int pointer1 = 0;
            int pointer2 = givenArray.length - 1;
            int temp;

            while (pointer1 < pointer2) {//Make sure pointers don't cross
                maxIndex = maxIn(pointer1, pointer2, givenArray);//Find the greatest number's index during loop
                if (counter >= 1 && counter <= 2) {//Move element to the right and control pointer2
                    temp = givenArray[pointer2];//Save element
                    givenArray[pointer2] = givenArray[maxIndex];//Swap elements with pointer2
                    givenArray[maxIndex] = temp;//Swap maxIndex with saved element
                    pointer2--;//Move pointer2 to the left
                    counter++;//Increment counter
                } else if (counter >= 3 && counter <= 4) {//Move element to the left and control pointer1 if
                    temp = givenArray[pointer1];//Save element
                    givenArray[pointer1] = givenArray[maxIndex];//Swap elements with pointer1
                    givenArray[maxIndex] = temp;//Swap maxIndex with saved element
                    pointer1++;//Move pointer2 to the right
                    counter++;//increment counter
                }
                if (counter == 5)//Reset counters
                    counter = 1;//Reset value
            }
            //return(givenArray);
        }
        public int maxIn(int pointer1, int pointer2, int[] nums) {//Helper method to find the index of max element
            int max = 0;
            int maxIndex = 0;
            for (int i = pointer1; i <= pointer2; i++) {//find max index within the two pointers
                if (nums[i] > max) {
                    max = nums[i];
                    maxIndex = i;
                }
            }
            //System.out.println(maxIndex); <--- To test this method
            return maxIndex;
        }
    }



