package org.example.distancecost;

public class Car implements DistanceCost{

	@Override
	public int cost(int distance) {
		int totalCost = distance * 130;

		return totalCost;
	}
}
