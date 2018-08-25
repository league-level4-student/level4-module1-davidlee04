package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "church");
			break;
		case "Monday":
			System.out.println("give garfield his meds");
			break;
		case "Tuesday": 
			System.out.println("pizza rolls");
			break;
		case "Wednesday":
			System.out.println("cool cool cool");
			break;
		case "Thursday":
			System.out.println("fish sticks");
			break;
		case "Friday":
			System.out.println("french fries");
			break;
		case "Saturday":
			System.out.println("barbeque ribs");
			break;
		}
		
	}
}
