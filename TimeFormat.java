// Represents the hh:mm time format using an AM/PM format. 

import javax.lang.model.util.ElementScanner14;

public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String formattedMinutes = String.format("%02d", minutes);
		if (hours == 0) {
			System.out.println("0:" + formattedMinutes + " AM");
		}
		else if (hours == 12) {
			System.out.println("12:" + formattedMinutes + " PM");
		}
		else if (hours > 12) {
			int nighthours = hours - 12;
			System.out.println(nighthours + ":" + formattedMinutes + " PM");
		}
		else {
			System.out.println(hours + ":" + formattedMinutes + " AM");
		}

	}
}
