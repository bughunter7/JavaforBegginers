package level1_Exercise;



public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(determinedayoftheweek(1));
		
		System.out.println(isweekday(5));

	}

	public static String determinedayoftheweek(int day) {
		String result = "";
		switch (day) {
		case 0:
			result = "Sunday";
			break;

		case 1:
			result = "Monday";
			break;

		case 2:
			result = "Tuesday";
			break;

		case 3:
			result = "Wednesday";
			break;

		case 4:
			result = "Thursday";
			break;

		case 5:
			result = "Friday";
			break;

		case 6:
			result = "Saturday";
			break;

		default:
			result = "Invalid input";
			break;

		}
		return result;

	}

	public static String isweekday(int day) {
		
		String weekday= "";

		switch (day) {
		case 0:
			weekday = "It is weekend";

			break;

		case 1:
			weekday = "its is weekday";

			break;

		case 2:
			weekday = "its is weekday";

			break;

		case 3:
			weekday = "its is weekday";

			break;
		case 4:
			weekday = "its is weekday";

			break;
		case 5:
			weekday = "its is weekday";

			break;
		case 6:
			weekday = "its is weekend";

			break;

		default:
			break;
		}

		return weekday;

	}

}
