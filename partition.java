public class Partition{
  /*Modify the array such that:
   *1. Only the indices from start to end inclusive are considered in range
   *2. A random index from start to end inclusive is chosen, the corresponding
   *   element is designated the pivot element.
   *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
   *4. all elements in range that are larger than the pivot element are placed after the pivot element.
   *@return the index of the final position of the pivot element.
   */
  public static int partition ( int [] data, int start, int end){
    int pivotIndex = (int)(Math.random() * 10) % data.length;


    return pivotIndex;
  }
  public static void main(String[] args) {
    int[] data1 = {10, 80, 30, 90, 40, 50, 70};
    System.out.println(partition(data1, 0 , 6));
  }
}
