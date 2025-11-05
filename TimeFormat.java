// Represents the hh:mm time format using an AM/PM format. 

import javax.lang.model.util.ElementScanner14;

public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		if (hours<13)
		{
			System.out.println(hours + ":" + minutes + " AM ");
			
		}
		else {
				int nighthours = hours-12;
				System.out.println(nighthours + ":" + minutes + " PM ");
			}

	}
}
