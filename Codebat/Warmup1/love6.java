package Warmup1;

public class love6 {

	public boolean love(int a, int b) {

		if (a + b == 6) {
			return true;
		} else if (a - b == 6) {
			return true;
		} else if (a == 6 || b == 6) {
			return true;
		} else {
			return false;
		}
	}

}
