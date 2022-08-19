package Tasks;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class JavaCollectionExercises {

	public static void main(String[] args) {
		//ArrayList Exercises
		//8. Write a Java program to sort a given array list
	/*	List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(9);
		list.add(4);
		list.add(1);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	*/	
		
		//15. Write a Java program to join two array lists.
	/*	ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);
		list.add(9);
		list.add(4);
		list.add(1);
		System.out.println(list);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);
		list2.add(30);
		list2.add(40);
		System.out.println(list2);
		list.addAll(list2);
		System.out.println(list);
	*/
	//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
	/*	ArrayList<Integer> list = new ArrayList<Integer>(4);
		list.add(6);
		list.add(9);
		list.add(4);
		list.add(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	*/
		
		//LinkedList
		//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list
	/*
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println("---");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println("---");
		
		//14. Write a Java program to remove all the elements from a linked list.
		list.removeAll(list);
		System.out.println(list);
		
		//23. Write a Java program to convert a linked list to array list.
		
		ArrayList<Integer> list2 = new ArrayList<>(list);
		System.out.println(list2);
	*/
		//TreeSet
		//15. Write a Java program to retrieve and remove the last element of a tree set. 
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(7);
		tree.add(9);
		
		System.out.println(tree.pollLast());
		System.out.println(tree.toString());
		
		
		
		
	}
	
	
	
}
