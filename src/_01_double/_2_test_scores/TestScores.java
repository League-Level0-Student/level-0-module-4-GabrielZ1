package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {

		String testScoreAsString = JOptionPane.showInputDialog("What was your test score?");

		double testScoreAsDouble = Double.parseDouble(testScoreAsString);

		if(testScoreAsDouble<70) {
			JOptionPane.showMessageDialog(null, "Aw, that's alright, you will do better next time!");	

		}
		else if(testScoreAsDouble>=70 && testScoreAsDouble<80) {
			JOptionPane.showMessageDialog(null, "You passed! Good job!");

		}
		else if(testScoreAsDouble>=80 && testScoreAsDouble<90) {
			JOptionPane.showMessageDialog(null, "You got a B! Amazing Job!");	
		}
		else if(testScoreAsDouble>=90 && testScoreAsDouble<100) {
			JOptionPane.showMessageDialog(null, "Wow! You got an A! Thats way above average!");
		}
		else if(testScoreAsDouble==100) {
			JOptionPane.showMessageDialog(null, "A perfect score?!? Congratulations! Thats amazing!");
		}
		else if(testScoreAsDouble>100) {
			JOptionPane.showMessageDialog(null, "Extra credit and a perfect score? Now that's the best you can get. A big congratulations to you!");
		}




	}

}
