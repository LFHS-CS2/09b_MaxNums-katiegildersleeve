import java.util.*;


class MaxNums {
    /**
     * Given an array of integers, efficiently find the product of the top n smallest numbers. 
     * Use Java's built-in PriorityQueue
     * https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
     */
   public int maxNums(int[] nums, int n) {
     PriorityQueue<Integer> numbers = new PriorityQueue();
     for(int i = 0; i < nums.length; i++){
       numbers.add(nums[i]);
     }
     int product = 1;
     for(int i = 0; i < n; i++){
       int cur = (int)numbers.peek();
       product *= cur;
       numbers.remove(cur);
     }
      return product;
   }
}
