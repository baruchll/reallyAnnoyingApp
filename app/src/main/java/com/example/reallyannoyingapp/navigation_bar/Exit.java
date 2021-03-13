package com.example.reallyannoyingapp.navigation_bar;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.reallyannoyingapp.R;


public class Exit extends Fragment {
Button exit, yes, no;
ConstraintLayout popup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_exit, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init() {
        exit = getView().findViewById(R.id.exit_button);
        popup = getView().findViewById(R.id.popup);
        yes = getView().findViewById(R.id.yes);
        no = getView().findViewById(R.id.no);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.setVisibility(View.VISIBLE);
                exit.setVisibility(View.GONE);
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup.setVisibility(View.GONE);
                exit.setVisibility(View.VISIBLE);
            }
        });
    }


    private void finish() {
        finish();
    }
}