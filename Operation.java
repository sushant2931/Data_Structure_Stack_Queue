package com.bl.stackqueue;

public class Operation {
	public static StackQueue addElement() {
		StackQueue stacklist = new StackQueue();
		stacklist.push(70);
		stacklist.push(30);
		stacklist.push(56);

		stacklist.display();
		return stacklist;

	}
}
