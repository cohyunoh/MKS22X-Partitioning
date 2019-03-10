public class Partition{
  /*Modify the array such that:
   *1. Only the indices from start to end inclusive are considered in range
   *2. A random index from start to end inclusive is chosen, the corresponding
   *   element is designated the pivot element.
   *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
   *4. all elements in range that are larger than the pivot element are placed after the pivot element.
   *@return the index of the final position of the pivot element.
   */
  public int partition ( int [] data, int start, int end){
    int pivotIndex = Math.random() * 10 % data.length;
    int first = data[start];
    data[start] = data[pivotIndex];
    data[pivotIndex] = first;
    pivotIndex = start;
    for(int i = 1; i < end; i++){
      int index = Math.random() * 10 % end + i;
      if(data[index] < data[pivotIndex]){
        int less = data[index];
        data[index] = data[pivotIndex];
        data[pivotIndex] = less;
        pivotIndex = index;
      }else if(data[index] < data[pivotIndex])
    }
  }
}
