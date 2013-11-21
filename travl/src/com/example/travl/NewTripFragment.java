package com.example.travl;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class NewTripFragment extends Fragment implements AdapterView.OnItemSelectedListener {
	
	
	private Trips trip;
	private EditText tripsBudgetEditText;
	private Spinner tripsDestinationSpinner;
	private EditText tripsDurationEditText;
	private TextView tripsCurrencyTextView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		trip = new Trips();
	}

	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View theView = inflater.inflate(R.layout.fragment_newtrip, container, false);
        
      
        
        tripsDestinationSpinner = (Spinner) theView.findViewById(R.id.spin_select_destination);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity().getBaseContext(), R.array.countries_array, R.layout.spinner_item);
        tripsDestinationSpinner.setAdapter(adapter);
        tripsDestinationSpinner.setOnItemSelectedListener(this);
        
        
        tripsBudgetEditText = (EditText) theView.findViewById(R.id.et_buget);
        tripsDurationEditText = (EditText) theView.findViewById(R.id.et_duration);
        
        
        TextWatcher editTextWatcher = new TextWatcher(){

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
				// TODO Auto-generated method stub
				
				if(tripsBudgetEditText.hasFocus() == true){
					trip.setBudget(s.toString());
				}
				else if(tripsDurationEditText.hasFocus() == true){
					trip.setDuration(s.toString());
				}
				
			}
        	
        };
        
        
        tripsBudgetEditText.addTextChangedListener(editTextWatcher); 
        tripsDurationEditText.addTextChangedListener(editTextWatcher);
			
			
          
        return theView;
    }
	
	public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
		TextView myText = (TextView) view;
		Toast.makeText(getActivity(), "You Selected "+myText.getText(), Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}

}
