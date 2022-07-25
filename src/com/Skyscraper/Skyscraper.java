/**
 * 
 */
package com.Skyscraper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author bharat_2
 *
 */
public class Skyscraper {
	Scanner myScan;
	int NoOfFloors;
	int[] Readyfloors;
	int[] SortedFloors;
	Stack<Integer> stack = new Stack<Integer>();
	LinkedList<Integer> ll = new LinkedList<Integer>();
	int lastFloor;

	/**
	 * @return the noOfFloors
	 */
	public int getNoOfFloors() {
		return NoOfFloors;
	}

	/**
	 * @param noOfFloors the noOfFloors to set
	 */
	public void setNoOfFloors(int noOfFloors) {
		NoOfFloors = noOfFloors;
	}

	public void getAssembledFloorsbyDay() {
		for (int i = 0; i < NoOfFloors; i++) {
			System.out.println("Enter the floor size given on day  " + (i + 1));
			Readyfloors[i] = myScan.nextInt();
			SortedFloors[i] = Readyfloors[i];
		}
		Arrays.sort(SortedFloors);// , Collections.reverseOrder());
		for (int i = 0; i < NoOfFloors; i++) {
			stack.push(Integer.valueOf(SortedFloors[i]));
		}
	}

	public Skyscraper() {
		myScan = new Scanner(System.in); // Create a Scanner object
	}

	public void EnterNoOfFloors() {
		System.out.println("Enter the total no of floors in the building");
		NoOfFloors = myScan.nextInt();
		Readyfloors = new int[NoOfFloors];
		SortedFloors = new int[NoOfFloors];
	}

	private boolean getReadyFloor() {
		boolean retval = false;
		for (Integer rFloor : ll) {
			if (lastFloor == rFloor.intValue()) {
				System.out.print(rFloor + " ");
				if (!stack.isEmpty()) {
					lastFloor = stack.pop().intValue();
				}
				ll.remove(rFloor);
				retval = true;
			}
		}
		return retval;
	}

	public void Process() {
		lastFloor = stack.pop().intValue();

		for (int i = 0; i < NoOfFloors; i++) {
			System.out.println("Day " + (i + 1));
			String msg = " ";
			ll.add(Integer.valueOf(Readyfloors[i]));
			while (getReadyFloor()) {

			}
			System.out.println(msg);
		}
	}
}
