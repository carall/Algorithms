public class Sort {
  public static void swap(int[] arr, int i, int j){
    if (i==j) return;
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }
///////// select sort ///////////
  public static void select(int[] arr){
    for (int i=0;i<arr.length;i++){
      int min=arr[i];
      for (int j=i+1;j<arr.length;j++){
        if (arr[j]<min) swap(arr,i,j);
      }
    }
  }
///////// insert sort ///////////
  public static void insert(int[] arr){
    insert (arr,0,arr.length);
  }
  public static void insert(int[] arr, int first, int last){
    for (int i=first+1;i<last;i++){
      for(int j=i;j>0;j--){
        if (arr[j]<arr[j-1]) swap (arr,j,j-1);
        else break;
      }
    }
  }
////////// shell sort //////////
  public static void shell(int[] arr){
    for (int h=arr.length/2;h>0;h/=2){
      for (int i=h;i<arr.length;i++){
        for (int j=i;j>=h;j-=h){
          if (arr[j]<arr[j-h]) swap (arr,j,j-h);
        }
      }
    }
  }
///////// bubble sort /////////
  public static void bubble(int[] arr){
    boolean swap=true;
    while (swap){
      swap=false;
      for (int i=1;i<arr.length;i++){
        if (arr[i-1]>arr[i]){
          swap(arr,i,i-1);
          swap=true;
        }
      }
    }
  }
}
///////// heap sort ///////////
  // public static void heap(int[] arr){
  //
  // }

///////// merge sort //////////
class Merge{
  private static int[] temp;
  //临时数组的建立位置十分重要！！！要保证在 merge()中可以使用！ 除了这种方法之外还可以当做参数传入
  public static void merge(int[] arr, int first,int mid,int last){
    for (int i=first;i<=last;i++){
      temp[i]=arr[i];
    }
    for (int i=first,j=mid+1,k=first;k<=last;){
      if (i>mid) arr[k++]=temp[j++];
      else if (j>last) arr[k++]=temp[i++];
      else if (temp[i]<temp[j]) arr[k++]=temp[i++];
      else arr[k++]=temp[j++];
    }
  }
  public static void mergeSort(int[] arr){
    temp=new int[arr.length];
    //确定临时数组的维度
    mergeSort(arr,0,arr.length-1);
  }
  public static void mergeSort(int[] arr, int first, int last){
    if (first >= last) return;
    int mid=(first+last)/2;
    mergeSort(arr,first,mid);
    mergeSort(arr,mid+1,last);
    merge(arr,first,mid,last);
  }
}
///////// quick sort //////////
class Quick {
  public static void quickSort(int [] arr){
    quickSort(arr, 0, arr.length-1);
  }
  public static void quickSort(int[] arr, int first, int last){
      if (first>=last) return;
      int mid=partition(arr, first, last);
      // quickSort(arr,first,mid-1);
      // quickSort(arr,mid+1,last);
      if (mid-first<4) Sort.insert(arr,first,mid-1);
      else quickSort(arr, first, mid-1);
      if (last-mid<4) Sort.insert(arr,mid+1,last);
      else quickSort(arr, mid+1, last);
  }
  public static int partition(int[] arr, int left, int right){
    // int mid = (left+right)/2;
    // int[] temp={arr[left],arr[mid],arr[right]};
    // Sort.insert(temp);
    // int midValue=temp[1];
    // int i=left,j=right;
    // while(i<j){
    //   while (arr[i]<midValue) i++;
    //   while (arr[j]>=midValue) j--;
    //   Sort.swap(arr,i,j);
    // }
    // int pivot=i;
    // while (arr[i]!=midValue) i++;
    // Sort.swap(arr,i,pivot);
    // return pivot;
    int v=arr[left];
    int i=left+1,j=right;
    while (i<j){
      while (arr[i]<v && i!=right) i++;
      while (arr[j]>=v && j!=left) j--;
      if (i<j) Sort.swap(arr,i,j);
    }
    Sort.swap(arr,j,left);
    return j;
  }
}