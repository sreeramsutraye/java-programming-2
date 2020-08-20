package com.jetbrains;
import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Stack; 

public class Reverse_k_element_queue { 

	static Queue<Integer> queue; 
	static void reverseQueueFirstKElements(int k) 
	{ 
		if (queue.isEmpty() == true|| k > queue.size()) 
			return; 
		if (k <= 0) 
			return; 
		Stack<Integer> stack = new Stack<Integer>(); 
		for (int i = 0; i < k; i++) { 
			stack.push(queue.peek()); 
			queue.remove(); 
		} 
		while (!stack.empty()) { 
			queue.add(stack.peek()); 
			stack.pop(); 
		}
		for (int i = 0; i < queue.size() - k; i++) { 
			queue.add(queue.peek()); 
			queue.remove(); 
		} 
	}
	static void Print() 
	{ 
		while (!queue.isEmpty()) { 
			System.out.print(queue.peek() + " "); 
			queue.remove(); 
		} 
	}
	public static void main(String args[]) 
	{ 
		queue = new LinkedList<Integer>(); 
		queue.add(2);  
		queue.add(4); 
		queue.add(6); 
		queue.add(8); 
		queue.add(10); 
		queue.add(12); 
		queue.add(14); 
		queue.add(16); 
		int k = 5; 
		reverseQueueFirstKElements(k); 
		Print(); 
	} 
} 
