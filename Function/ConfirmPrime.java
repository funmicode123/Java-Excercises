public static ConfirmPrime {
		int number;

	if (number <= 1) {

		return false;
	}

	for (int iterate = 2; iterate <= Math.sqrt(number); iterate++){
		if (number % iterate == 0) {

		return false;

		}
	}

	return true;
	
	}

}