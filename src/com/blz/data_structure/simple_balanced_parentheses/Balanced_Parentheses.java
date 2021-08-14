package com.blz.data_structure.simple_balanced_parentheses;

public class Balanced_Parentheses {
	public static String[] stack;
	public static int top = -1;

	public boolean isFull() {
		if (top == stack.length - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void push(String topVal) {
		if (isFull()) {
			System.out.println("****Stack is Full****");
		} else {
			top++;
			stack[top] = topVal;
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("****Stack is Empty*****");
		} else {
			stack[top] = null;
			top--;
		}
	}

	public void stackBalance(String expression) {

		int num = expression.length();
		stack = new String[num];
		for (int i = 0; i < num; i++) {
			if (expression.charAt(i) == '(') {
				push("(");
			} else if (expression.charAt(i) == ')') {
				pop();
			}
		}
		if (isEmpty()) {
			System.out.println("Arithmetic Expression is balanced");
		} else {
			System.out.println("Arithmetic Expression is not balanced");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Balanced_Parentheses balanced_Parentheses = new Balanced_Parentheses();
		balanced_Parentheses.stackBalance("(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)");
	}

}
