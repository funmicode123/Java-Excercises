public class DeliveryClass {
	

	public static float calculateWages(int successfulDeliveries, float rateForLess50, float rateFor50To59, float rateFor60To69, float rateForAbove70, int basePay) {
	float rate;
	if (successfulDeliveries < 50) {
	rate = 	rateForLess50;
	}
	else if (successfulDeliveries >= 50 && successfulDeliveries < 60) {
	rate = 	rateFor50To59;
	}
	else if (successfulDeliveries >= 60 && successfulDeliveries < 70) {
	rate = 	rateFor60To69;
	}
	else {
	rate = 	rateForAbove70;
	}
	
	return (successfulDeliveries * rate) + basePay;

	}

	


}

