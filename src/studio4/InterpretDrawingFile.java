package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
		
		double x=0;
		double y=0;
		double semiMajorAxis=0;
		double semiMinorAxis=0;
		double [] m = new double[3];
		double [] k = new double[3];
		
		String n=in.next();
		
		if (n.equals("ellipse")){
		     int red=in.nextInt();
		     int green=in.nextInt();
		     int blue=in.nextInt();
		     boolean filled=in.nextBoolean();
			 x=in.nextDouble();
			 y=in.nextDouble();
			 semiMajorAxis=in.nextDouble();
			 semiMinorAxis=in.nextDouble();
			 if(filled == true) {
			     StdDraw.setPenColor(red, green, blue);
			     StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
			 } 
             if (filled == false) {
				 StdDraw.setPenColor(red, green, blue);
				 StdDraw.ellipse(x, y, semiMajorAxis, semiMinorAxis);
			 }
			 
		}
				
		
		if (n.equals("rectangle")){
			int red=in.nextInt();
		     int green=in.nextInt();
		     int blue=in.nextInt();
		     boolean filled=in.nextBoolean();
		     
		     x=in.nextDouble();
			 y=in.nextDouble();
			 double halfWidth=in.nextDouble();
			 double halfHeight=in.nextDouble();
			 if(filled == true) {
			     StdDraw.setPenColor(red, green, blue);
			     StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			 } 
             if (filled == false) {
				 StdDraw.setPenColor(red, green, blue);
				 StdDraw.rectangle(x, y, halfWidth, halfHeight);
			 }
			 
		}
		if (n.equals("triangle")){
			int red=in.nextInt();
		     int green=in.nextInt();
		     int blue=in.nextInt();
		     boolean filled=in.nextBoolean();
		     m[0]=in.nextDouble();
		     k[0]=in.nextDouble();
		     m[1]=in.nextDouble();
		     k[1]=in.nextDouble();
		     m[2]=in.nextDouble();
		     k[2]=in.nextDouble();
		     if(filled == true) {
			     StdDraw.setPenColor(red, green, blue);
			     StdDraw.filledPolygon(m, k);
			 } 
             if (filled == false) {
				 StdDraw.setPenColor(red, green, blue);
				 StdDraw.polygon(m, k);
			 }
	}
	}
}


//static void	filledCircle​(double x, double y, double radius)	
/*Draws a filled circle of the specified radius, centered at (x, y).
static void	filledEllipse​(double x, double y, double semiMajorAxis, double semiMinorAxis)	
Draws a filled ellipse with the specified semimajor and semiminor axes, centered at (x, y).*/