package com.example.lab_2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;


public class Keyboard extends Fragment implements View.OnClickListener {
    private Button backspace_button;
    private OnKeyboardInteractionListener mListener;
    public Keyboard() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.keyboard, container, false);
        Button button = view.findViewById(R.id.equalsButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.divButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.powButton);
        button.setOnClickListener(this);
        backspace_button = view.findViewById(R.id.delButton);
        button = view.findViewById(R.id.clearButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.sevenButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.eightButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.nineButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.multButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.fourButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.fiveButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.sixButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.minusButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.oneButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.twoButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.threeButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.plusButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.zeroButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.pointButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.breaksButton);
        button.setOnClickListener(this);
        return view;
    }
    public void onClick(final View view)
    {
        Button button = (Button)view;
        if (mListener != null) {
            mListener.onBasicFragmentInteraction(button.getText().toString());
        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Keyboard.OnKeyboardInteractionListener) {
            mListener = (OnKeyboardInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString());
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnKeyboardInteractionListener {
        void onBasicFragmentInteraction(String str);
    }
}
