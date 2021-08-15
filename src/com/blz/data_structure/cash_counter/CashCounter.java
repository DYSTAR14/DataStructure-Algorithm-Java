package com.blz.data_structure.cash_counter;

import java.util.Scanner;

public class CashCounter {
	static final Scanner SC = new Scanner(System.in);
	static int[] myQueue;
	static int front = -1, rear = -1;
	public int bankBalance = 100000;

	public boolean isFull() {
		if (rear == myQueue.length - 1)
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (front == rear)
			return true;
		return false;
	}

	public void enQueue(int element) {
		if (isFull()) {
			System.out.println("****Queue is Full..****");
		} else {
			rear++;
			myQueue[rear] = element;
		}
	}

	public void deQueue() {
		if (isEmpty()) {
			System.out.println("****Queue is Empty****");
		} else {
			front++;
			myQueue[front] = 0;
		}
	}

	public void service(int tokenNumber) {

		System.out.println("Your Token number is : " + tokenNumber);

		int choice;
		int amount = 0;
		System.out.println("press 1: for withdraw\npress 2: for deposit");
		choice = SC.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter amount to withdraw");
			amount = SC.nextInt();
			bankBalance = bankBalance - amount;
			System.out.println("Thank you for using service");
			amount = 0;
			break;
		case 2:
			System.out.println("Enter amount to deposit");
			amount = SC.nextInt();
			bankBalance = bankBalance + amount;
			System.out.println("Thank you for using service");
			amount = 0;
			break;
		default:
			System.out.println("Enter valid option");
		}

	}

	public static void main(String[] args) {
		CashCounter cashCounter = new CashCounter();
		System.out.println("Enter number people want to use Bank Simulate");
		Scanner scanner = new Scanner(System.in);
		int peopleSize = scanner.nextInt();
		myQueue = new int[peopleSize];
		System.out.println("Welcome to bank simulation: ");
		for (int i = 0; i < peopleSize; i++) {

			cashCounter.enQueue(i);
			cashCounter.service(i+1);
			cashCounter.deQueue();
		}
		if (cashCounter.isEmpty()) {
			System.out.println("Queue is empty");
		}
		System.out.println("Bank Closing balance is : " + cashCounter.bankBalance);
		
	}

}
