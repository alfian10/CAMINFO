package com.example.com.caminfo;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class AkademikFragment extends Fragment {

    private String title;
    private static final String ARG_TITLE = "title";
    public static AkademikFragment newInstance(String title) {

        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);

        AkademikFragment fragment = new AkademikFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public AkademikFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getArguments();
        if (extras != null) {
            title = extras.getString(ARG_TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_akademik, container, false);
    }

}
