package com.example.travl;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DocumentsFragment extends Fragment {
	
	 
	
	
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
        View rootView = inflater.inflate(R.layout.fragment_documents, container, false);
        
        Button bAddDocument = (Button) rootView.findViewById(R.id.bAddDocument);
        
		bAddDocument.setOnClickListener(new View.OnClickListener() {
            @Override
			public void onClick(View v) {

            	Intent intent = new Intent(getActivity(),CapturePhotoActivity.class);
            	startActivity(intent);
            }   
        });
        
        
        return rootView;
        
        
    }
	
	
}
