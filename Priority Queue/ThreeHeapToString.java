/*
 * Testing program for Binary Heap.
 */

import java.util.*;

public class ThreeHeapToString 
{
	
	public static void main(String[] args) 
	{
		      
      ThreeHeap testBinaryHeap = new ThreeHeap();

      // insert
      add(testBinaryHeap, 105);
		add(testBinaryHeap, 15);
		add(testBinaryHeap, 43);
		add(testBinaryHeap, 12);
		add(testBinaryHeap, 10);
		add(testBinaryHeap, 5);
		add(testBinaryHeap, 58);
		add(testBinaryHeap, 40);
      
      // deleteMin
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
 
	}
   
   public static void add(ThreeHeap heap, double value)
   {
      System.out.println("insert " + value);
      heap.insert(value);
      System.out.println(heap.toString());
   }
   
   public static void remove(ThreeHeap heap)
   {
      double d = heap.deleteMin();
      System.out.println("deleteMin " + d);
      System.out.println(heap.toString());
   }
   
}   
