package com.uom.cse.bbm.system;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author T.Nila find the nearest distance
 *
 */
public class NearbyDonor {
	public List<Double> findNearbyDonors(String[] distance) {
		List<Double> distanceInDouble = new ArrayList<Double>();
		if (!(distance.length == 0)) {

			for (int i = 0; i < distance.length; i++) {
				distanceInDouble.add(Double.parseDouble(distance[i]));
			}
			// use Collections.sort to sort the list
			Collections.sort(distanceInDouble);
			return distanceInDouble;
		} else
			return distanceInDouble;

	}
}
