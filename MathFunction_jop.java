package mathfunction;

import javax.swing.JOptionPane;

public class MathFunction_jop {
	private static String inDiag(String thisStuff) { //input diag shortcut
		return JOptionPane.showInputDialog(thisStuff);
	}
	private static void msgBox(String thisStuff) { //message box shortcut
		JOptionPane.showMessageDialog(null, thisStuff);
	}
	/*START MATH STUFF*/
	private static void absolute() {
		msgBox("The absolute value is " + Math.abs(Double.parseDouble(inDiag("Enter a value"))));
	}
	private static void ceiling() {
		msgBox("The ceiling value is " + Math.ceil(Double.parseDouble(inDiag("Enter a value"))));
	}
	private static void floor() {
		msgBox("The floor value is " + Math.floor(Double.parseDouble(inDiag("Enter a value"))));
	}
	private static void maxVal() {
		msgBox("The largest value is " + Math.max(Double.parseDouble(inDiag("Enter a value")),Double.parseDouble(inDiag("Enter a value"))));
	}
	private static void power() {
		msgBox("The exponential value is " + Math.pow(Double.parseDouble(inDiag("Enter a value")),Double.parseDouble(inDiag("Enter a value"))));
	}
	private static void random() {
		msgBox("The random value is " + Math.random());
	}
	private static void round(){
		msgBox("The rounded value is " + Math.round(Double.parseDouble(inDiag("Enter a value"))));
	}
	/*END MATH STUFF*/
	public static void main(String[] args) {
		boolean term = false;
		while(!term) {
			msgBox(
				"Welcome to the Math Class and Method Program\n\n" +
				"Select from the choices below\n\n" +
				"---------------------------------------\n" +
				" Code           |    Description  \n"+
				"---------------------------------------\n" +
				" A              | Absolute Value\n" +
				" C              | Ceiling Value\n" +
				" M              | Maximum Value\n" +
				" P              | Power Value\n" +
				" T              | Random Value\n" +
				" R              | Rounded Value\n"+
				"---------------------------------------\n" +
				" E              |      Exit\n" +
				"---------------------------------------\n"
				);
			switch(inDiag("Enter the letter of your choice")) {
				case "A":
				case "a":
					absolute();
					break;
				case "C":
				case "c":
					ceiling();
					break;
				case "F":
				case "f":
					floor();
					break;
				case "M":
				case "m":
					maxVal();
					break;
				case "P":
				case "p":
					power();
					break;
				case "T":
				case "t":
					random();
					break;
				case "R":
				case "r":
					round();
					break;
				
				case "E":
				case "e":
					term = true;
					break;
			}
		}
	}
}
