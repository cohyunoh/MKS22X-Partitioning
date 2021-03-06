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
    if(end == start){
      return start;
    }
    int pivotIndex = ((int)(Math.random() * 10) % (end + 1 - start)) + start;
    int first =  data[start];
    data[start] = data[pivotIndex];
    data[pivotIndex] = first;
    pivotIndex = start;
    int tempStart = start + 1;
    int tempEnd = end;
    //System.out.println(pivotIndex);
    while(tempStart != tempEnd){
      //System.out.println("Start: " + tempStart);
      //System.out.println("End: " + tempEnd);
      //System.out.println(toString(data));
      if(data[tempStart] > data[pivotIndex]){
        int temp = data[tempStart];
        data[tempStart] = data[tempEnd];
        data[tempEnd] = temp;
        tempEnd --;
      }else if(data[tempStart] <= data[pivotIndex]){
        tempStart ++;
      }
      //System.out.println("Start: " + tempStart);
      //System.out.println("End: " + tempEnd);
      //System.out.println(toString(data));
    }
    for(int c = start; c < end + 1; c++){
      if(data[c] > data[pivotIndex]){
        int temp = data[c - 1];
        data[c - 1] = data[pivotIndex];
        data[pivotIndex] = temp;
        return c - 1;
      }
    }
    int temp = data[end];
    data[end] = data[pivotIndex];
    data[pivotIndex] = temp;
    return end;
  }
  public static String toString(int[] inpt){
    String ans = "";
    for(int i = 0; i < inpt.length; i++){
      ans += inpt[i] + " ";
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] data2 = {6, 3, 7, -1, 7, 4, 10, -21};
    System.out.println(partition(data2, 2, 7));
    System.out.println(toString(data2));
  }
}
