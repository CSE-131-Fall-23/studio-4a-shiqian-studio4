package studio4;

import java.util.Scanner;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		StdDraw.clear();
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		boolean fill = in.nextBoolean();
		
		double x = in.nextDouble();
		double y = in.nextDouble();
		double m = in.nextDouble();
		double n = in.nextDouble();
		
		if(shape.equals("rectangle")) {
			if(fill == true) {
				StdDraw.setPenColor(Color.PINK);
				StdDraw.filledRectangle(x, y, m, n);
			}
			else {
				StdDraw.setPenColor(Color.BLACK);
				StdDraw.rectangle(x, y, m, n);
			}
		}
		
		else if(shape.equals("ellipse")) {
			if(fill == true) {
				StdDraw.setPenColor(Color.RED);
				StdDraw.filledEllipse(x, y, m, n);
			}
			else {
				Color purple = new Color(red, green, blue);
				StdDraw.setPenColor(purple);
				StdDraw.ellipse(x, y, m, n);
			}
		}
		
	}
}
