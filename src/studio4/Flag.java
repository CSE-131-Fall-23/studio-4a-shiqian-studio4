package studio4;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.3, 0.2);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledEllipse(0.5, 0.6, 0.07, 0.07);
		StdDraw.filledEllipse(0.5, 0.45, 0.11, 0.11);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(0.46, 0.6, 0.005, 0.005);
		StdDraw.filledEllipse(0.54, 0.6, 0.005, 0.005);
	}
}