package edu.kis.vh.nursery.container;

import edu.kis.vh.nursery.StackInterface;

public class IntArrayStack implements StackInterface {

	/**
	 * Maximum amount of numbers to store
	 */
	private static final int STACK_SIZE = 12;

	/**
	 * Numbers stored in rhymer
	 */
	private int[] NUMBERS = new int[STACK_SIZE];
	/**
	 * Amount of stored numbers
	 */
	private int total = EMPTY_VALUE;

	/**
	 * Getter to variable named "total"
	 * 
	 * @return value of total variable
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Add number to the rhymer
	 * 
	 * @param in - number to add
	 */
	@Override
	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	/**
	 * @return true if there is no numbers in rhymer
	 */

	@Override
	public boolean callCheck() {
		return total == EMPTY_VALUE;
	}

	/**
	 * @return true if rhymer cant store more numbers
	 */
	@Override
	public boolean isFull() {
		return total == STACK_SIZE - 1;
	}

	/**
	 * @return last added number
	 */
	@Override
	public int peekaboo() {
		if (callCheck())
			return EMPTY_VALUE;
		return NUMBERS[total];
	}

	/**
	 * Returns last added number, then removes it from rhymer
	 * 
	 * @return
	 */
	@Override
	public int countOut() {
		if (callCheck())
			return EMPTY_VALUE;
		return NUMBERS[total--];
	}
}
