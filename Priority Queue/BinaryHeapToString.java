/*
 * Testing program for Binary Heap.
 */

import java.util.*;

public class BinaryHeapToString 
{
	
	public static void main(String[] args) 
	{
		      
      BinaryHeap testBinaryHeap = new BinaryHeap();

      // insert
      add(testBinaryHeap, 16);
		add(testBinaryHeap, 32);
		add(testBinaryHeap, 4);
		add(testBinaryHeap, 67);
		add(testBinaryHeap, 105);
		add(testBinaryHeap, 43);
		add(testBinaryHeap, 2);
      
      // deleteMin
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
      remove(testBinaryHeap);
	}
   
   public static void add(BinaryHeap heap, double value)
   {
      System.out.println("insert " + value);
      heap.insert(value);
      System.out.println(heap.toString());
   }
   
   public static void remove(BinaryHeap heap)
   {
      double d = heap.deleteMin();
      System.out.println("deleteMin " + d);
      System.out.println(heap.toString());
   }
   
}   
