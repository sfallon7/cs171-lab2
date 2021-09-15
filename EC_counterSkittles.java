//Sean Fallon
//Comp 171
//Fall 19
//Extra Credit 2

package extraCredit2;

public class counterSkittles {
	
	public static void main(String[] args) {

		countSkittles("");
		countSkittles("rrOoRgGG");
		countSkittles("xyxyXX  xxroygbppPPPgGG xyaz !!");
		countSkittles("RRrrOOooYYyyGGggBBbbPPpprogybppproyooybbggrrrRRBBOOoOOoPPPPppGGggGGbgbgrbrgbrgbppoororbbbppprrRROObbbbbbgggggpppyyyyyYYYyyYYYYyyy");

		}

		public static void countSkittles(String skittles) {

		int length = skittles.length();
		int i;

		int red = 0;
		int orange = 0;
		int yellow = 0;
		int green = 0;
		int blue = 0;
		int purple = 0;

		skittles = skittles.trim();
		skittles = skittles.toUpperCase();

		if (length <= 0) {
		System.out.println("no Skittles");
		}

		else {

		for (i = 0; i < skittles.length(); i++) {

		if (skittles.charAt(i) == 'R')
		red++;

		if (skittles.charAt(i) == 'O')
		orange++;

		if (skittles.charAt(i) == 'Y')
		yellow++;

		if (skittles.charAt(i) == 'G')
		green++;

		if (skittles.charAt(i) == 'B')
		blue++;

		if (skittles.charAt(i) == 'P')
		purple++;
		}

		System.out.print("red: " + red + ", ");
		System.out.print("orange: " + orange + ", ");
		System.out.print("yellow: " + yellow + ", ");
		System.out.print("green: " + green + ", ");
		System.out.print("blue: " + blue + ", ");
		System.out.println("purple: " + purple);

		}
		}
		}

