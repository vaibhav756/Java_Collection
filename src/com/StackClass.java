package com;

import java.util.Enumeration;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		
		Enumeration em=s.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
	}

}
