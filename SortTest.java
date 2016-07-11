import java.util.Arrays;

public class SortTest{
  public static void main(String[] args){
    int[] arrayToTest={3,2,57,33,46,89,20,73,1,39,3,46,100,99,87,86,54};
    // int[] arrayToTest={2,1,3,5,7,2,4,10};
    System.out.println(Arrays.toString(arrayToTest));
    // Sort.select(arrayToTest);
    // Sort.insert(arrayToTest);
    // Sort.shell(arrayToTest);
    // Sort.bubble(arrayToTest);
    // Sort.heap(arrayToTest);
    // Sort.mergeSort(arrayToTest);
    // Merge.mergeSort(arrayToTest);
    Quick.quickSort(arrayToTest);
    System.out.println(Arrays.toString(arrayToTest));

  }
}
