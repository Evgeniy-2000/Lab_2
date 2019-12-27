package com.example.lab_2;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

public class KeyboardExtended extends Fragment implements View.OnClickListener {
    private static final String TAG = "keyboard_extended_logs";
    private OnFragmentInteractionListener mListener;
    public KeyboardExtended() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.keyboard_extended, container, false);
        Button button = view.findViewById(R.id.lnButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.sqrtButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.sinButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.cosButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.tgButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.lgButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.piButton);
        button.setOnClickListener(this);
        button = view.findViewById(R.id.eButton);
        button.setOnClickListener(this);
        Log.d(TAG, "onCreateView");
        return  view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
        Log.d(TAG, "onAttach");
    }
    public void onClick(final View view)
    {
        Button button = (Button)view;

        if (mListener != null) {
            mListener.onFragmentInteraction(button.getText().toString());
            Log.d(TAG, "onClick, send text " + button.getText().toString());
        }
        else
            Log.d(TAG, "onClick, no listener");
    }
    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
        Log.d(TAG, "onDetach");
    }
    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String str);
    }
}
