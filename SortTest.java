import java.util.Arrays;

public class SortTest{
  public static void main(String[] args){
    boolean suc=true;
    int[] arrayToTest={3,2,3,57,33,46,89,20,73,1,39,326,46,100,46,25,14,99,87,86,54};
    // int[] arrayToTest={2,1,3,5,7,2,4,10};
    // int[] arrayToTest={1,1,1,1,1,451,11,1,1,1,1,1,111,1,21,1,1,451,1};
    System.out.println(Arrays.toString(arrayToTest));
    // Sort.select(arrayToTest);
    // Sort.select(arrayToTest,0,8);
    // Sort.insert(arrayToTest,0,8);
    // Sort.insert(arrayToTest);
    // Sort.shell(arrayToTest);
    // Sort.bubble(arrayToTest);
    // Sort.heap(arrayToTest);
    // Sort.mergeSort(arrayToTest);
    // Merge.mergeSort(arrayToTest);
    Quick.quickSort(arrayToTest);
    System.out.println(Arrays.toString(arrayToTest));
    for (int i=0;i<arrayToTest.length-1;i++){
      if (arrayToTest[i]>arrayToTest[i+1]) {
        suc=false;
        break;
      }
    }
    System.out.println(suc);

  }
}
