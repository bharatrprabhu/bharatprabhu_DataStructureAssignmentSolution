/**
 * 
 */
package com.Skyscraper;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author bharat_2
 *
 */
public class SkyscraperApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Skyscraper skyscraper = new Skyscraper();
		skyscraper.EnterNoOfFloors();
		skyscraper.getAssembledFloorsbyDay();
		skyscraper.Process();

	}

}
