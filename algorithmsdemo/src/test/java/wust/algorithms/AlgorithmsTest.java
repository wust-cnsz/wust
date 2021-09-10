package wust.algorithms;

import com.wust.algorithms.PopSort;
import org.junit.Test;

import java.util.Arrays;

public class AlgorithmsTest {

    @Test
    public void popSortTest(){
        Integer[] arr = {1,54,56,3,7,89,22,4,5};

        System.out.println("com.wust.algorithms.PopSort.main start" + Arrays.toString(arr));
        PopSort.popSort(arr);
        System.out.println("com.wust.algorithms.PopSort.main end" + Arrays.toString(arr));
    }
}
