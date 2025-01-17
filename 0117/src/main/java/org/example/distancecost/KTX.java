package org.example.distancecost;

public class KTX implements DistanceCost{

	@Override
	public int cost(int distance) {
		int baseFare = 30000;
		int totalCost = baseFare + distance * 50;

		return totalCost;
	}
}
