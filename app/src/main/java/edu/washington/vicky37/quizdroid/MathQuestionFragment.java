package edu.washington.vicky37.quizdroid;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link MathQuestionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class MathQuestionFragment extends Fragment implements View.OnClickListener{

    private OnFragmentInteractionListener mListener;

    private View mView;
    public MathQuestionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_math_question, container, false);
        RadioButton mathRadioButton1 = (RadioButton)mView.findViewById(R.id.mathRadioButton1);
        mathRadioButton1.setOnClickListener(this);
//        mathRadioButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                View summitButton = v.findViewById(R.id.mathSummitButton);
//                summitButton.setVisibility(v.VISIBLE);
//            };
//        });

        RadioButton mathRadioButton2 = (RadioButton)mView.findViewById(R.id.mathRadioButton2);
        mathRadioButton2.setOnClickListener(this);
//        mathRadioButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                View summitButton = v.findViewById(R.id.mathSummitButton);
//                summitButton.setVisibility(v.VISIBLE);
//            };
//        });

        RadioButton mathRadioButton3 = (RadioButton)mView.findViewById(R.id.mathRadioButton3);
        mathRadioButton3.setOnClickListener(this);
//        mathRadioButton3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                View summitButton = v.findViewById(R.id.mathSummitButton);
//                summitButton.setVisibility(v.VISIBLE);
//            };
//        });

        RadioButton mathRadioButton4 = (RadioButton)mView.findViewById(R.id.mathRadioButton4);
        mathRadioButton4.setOnClickListener(this);
//        mathRadioButton4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                View summitButton = v.findViewById(R.id.mathSummitButton);
//                summitButton.setVisibility(v.VISIBLE);
//            };
//        });
        Button submitButton = (Button)mView.findViewById(R.id.mathSummitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onFragmentInteraction(R.id.mathSummitButton);
            }
        });

        return mView;
    }

    public void showRadioButton (View v) {
        Button button = (Button)mView.findViewById(R.id.mathSummitButton);
        button.setVisibility(View.VISIBLE);
    }
    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(int button) {
        if (mListener != null) {
            mListener.onFragmentInteraction(button);
        }
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
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        if (mListener != null) {
                Button button = (Button)mView.findViewById(R.id.mathSummitButton);
                button.setVisibility(View.VISIBLE);



        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(int button);
    }
}
