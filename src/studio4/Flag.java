package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		Color darkpink = new Color(255, 51, 51);
		StdDraw.setPenColor(darkpink);
		StdDraw.filledRectangle(0.5, 0.5, 0.21,0.21);
		
			Color brightpink = new Color(255, 182, 193);
			StdDraw.setPenColor(brightpink);
			StdDraw.filledRectangle(0.5, 0.5, 0.2,0.2);
			
			Color orange = new Color(255, 102, 0);
			StdDraw.setPenColor(orange);
			StdDraw.filledCircle(.5, .5, .135);
			
			Color lightyellow = new Color(255, 255, 150);
			StdDraw.setPenColor(lightyellow);
			StdDraw.filledCircle(.5, .5, .125);
			
			Color yorange = new Color(255, 153, 0);
			StdDraw.setPenColor(yorange);
			StdDraw.filledCircle(.5, .5, .1);
		
			Color vrylightyellow = new Color(255, 255, 204);
			StdDraw.setPenColor(vrylightyellow);
			StdDraw.filledCircle(.5, .5, .05);
			
			Color vrylightred = new Color(255, 102, 102);
			StdDraw.setPenColor(vrylightred);
			StdDraw.filledCircle(.5, .5, .03);
	}
}