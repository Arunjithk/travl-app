package com.example.travl;

import java.util.ArrayList;
import java.util.UUID;

import android.content.Context;

public class AllTrips {

	private static AllTrips allTrips;

	private Context applicationContext;

	private ArrayList<Trips> tripList;

	private AllTrips(Context applicationContext) {

		this.applicationContext = applicationContext;

		tripList = new ArrayList<Trips>();

		Trips unitedKingdom = new Trips();
		unitedKingdom.setDestination("United Kingdom");
		unitedKingdom.setDuration("1 Month");
		unitedKingdom.setCurrency("GBP");
		unitedKingdom.setBudget("£500");
		tripList.add(unitedKingdom);

		Trips france = new Trips();
		france.setDestination("France");
		france.setDuration("2 Month");
		france.setCurrency("Euros");
		france.setBudget("£700");
		tripList.add(france);

		Trips germany = new Trips();
		germany.setDestination("Germany");
		germany.setDuration("6 Month");
		germany.setCurrency("Euros");
		germany.setBudget("£2000");
		tripList.add(germany);

	}

	public static AllTrips get(Context context) {

		if (allTrips == null) {
			allTrips = new AllTrips(context.getApplicationContext());
		}

		return allTrips;
	}

	public ArrayList<Trips> getTripList() {

		return tripList;
	}

	public Trips getTrip(UUID id) {

		for (Trips theTrip : tripList) {

			if (theTrip.getIdNumber().equals(id)) {

				return theTrip;

			}
		}

		return null;
	}

}
