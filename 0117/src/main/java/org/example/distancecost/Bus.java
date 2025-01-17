package org.example.distancecost;

public class Bus implements DistanceCost{

	@Override
	public int cost(int distance) {
		int baseFare = 10000;
		int tollFee = 40000;

		int totalCost = baseFare + tollFee + distance * 10;
		return totalCost;
	}
}
