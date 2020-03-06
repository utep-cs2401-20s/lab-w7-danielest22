import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {
    int[] testBoard1 = {1, 3, 4, 6, 0, 10};//even length array
    int[] testBoard2 = {};//empty array
    int[] testBoard3 = {1, 3, 4, 0, 1, 10};//duplicated elements
    int[] testBoard4 = {1, 1, 1, 1, 1, 1};//
    int[] testBoard5 = {1, 3, 4, 6, 0, 10, 7};//odd length array

    @Test
    public void sortOfSort1() {
        int[] result = {4, 3, 0, 1, 6, 10};//Testing an even length array
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(testBoard1);
        assertArrayEquals(result, testBoard1);
    }

    @Test
    public void sortOfSort2() {
        int[] result = {};//Testing an empty length array
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(testBoard2);
        assertArrayEquals(result,testBoard2 );
    }
    @Test
    public void sortOfSort3() {
        int[] result = {3, 1, 0, 1, 4, 10};//Testing an even length array with two duplicates
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(testBoard3);
        assertArrayEquals(result,testBoard3 );
    }
    @Test
    public void sortOfSort4() {
        int[] result = {1, 1, 1, 1, 1, 1};//Testing an array of all duplicates
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(testBoard4);
        assertArrayEquals(result, testBoard4);
    }
    @Test
    public void sortOfSort5() {
        int[] result = {6, 4, 0, 1, 3, 7, 10};//Testing an even length array
        SortOfSort sol = new SortOfSort();
        sol.sortOfSort(testBoard5);
        assertArrayEquals(result, testBoard5);
    }
}
