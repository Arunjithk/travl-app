package com.example.travl;

import java.util.ArrayList;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ExistingTripFragment extends ListFragment {

	private ArrayList<Trips> tripList;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);

		getActivity().setTitle(R.string.existing_trip_title);

		tripList = AllTrips.get(getActivity()).getTripList();

		TripAdapter tripAdapter = new TripAdapter(tripList);

		setListAdapter(tripAdapter);

	}

	private class TripAdapter extends ArrayAdapter<Trips> {

		public TripAdapter(ArrayList<Trips> trips) {

			super(getActivity(), android.R.layout.simple_list_item_1, trips);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {

			// Check if this is a recycled list item and if not we inflate it

			if (convertView == null) {

				convertView = getActivity().getLayoutInflater().inflate(
						R.layout.fragment_existingtrip, null);

			}

			// Find the right data to put in the list item

			Trips theTrip = getItem(position);

			// Put the right data into the right components

			TextView destinationTextView = (TextView) convertView
					.findViewById(R.id.tv_destination_existing);
			destinationTextView.setText(theTrip.getDestination());

			TextView durationTextView = (TextView) convertView
					.findViewById(R.id.tv_duration_existing);
			durationTextView.setText(theTrip.getDuration());

			TextView currencyTextView = (TextView) convertView
					.findViewById(R.id.tv_currency_existing);
			currencyTextView.setText(theTrip.getCurrency());

			TextView budgetTextView = (TextView) convertView
					.findViewById(R.id.tv_budget_existing);
			budgetTextView.setText(theTrip.getBudget());

			// Return the finished list item for display

			return convertView;

		}
	}
}
