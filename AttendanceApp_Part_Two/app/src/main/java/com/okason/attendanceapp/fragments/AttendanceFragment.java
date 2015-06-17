package com.okason.attendanceapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.melnykov.fab.FloatingActionButton;
import com.okason.attendanceapp.R;
import com.okason.attendanceapp.adapters.AttendantsAdapter;
import com.okason.attendanceapp.models.Attendant;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttendanceFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Attendant> mAttendantsList;
    private View mRootView;


    public AttendanceFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_attendance, container, false);

        mRecyclerView = (RecyclerView) mRootView.findViewById(R.id.attendants_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAttendantsList = new ArrayList<Attendant>();
        addTestGuessList();

        FloatingActionButton fab = (FloatingActionButton) mRootView.findViewById(R.id.fab);
        fab.attachToRecyclerView(mRecyclerView);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //promptForAdd();
            }
        });
        mAdapter = new AttendantsAdapter(mAttendantsList, getActivity());
        mRecyclerView.setAdapter(mAdapter);
        return mRootView;
    }

    private void addTestGuessList() {
        Attendant guest1 = new Attendant();
        guest1.setName("Debbie Sam");
        guest1.setEmail("deb@email.net");
        guest1.setProfileImageId(R.drawable.headshot_1);
        mAttendantsList.add(guest1);

        Attendant guest2 = new Attendant();
        guest2.setName("Keisha Williams");
        guest2.setEmail("diva@comcast.com");
        guest2.setProfileImageId(R.drawable.headshot_2);
        mAttendantsList.add(guest2);

        Attendant guest3 = new Attendant();
        guest3.setName("Gregg McQuire");
        guest3.setEmail("emailing@nobody.com");
        guest3.setProfileImageId(R.drawable.headshot_3);
        mAttendantsList.add(guest3);

        Attendant guest4 = new Attendant();
        guest4.setName("Nancy Watson");
        guest4.setEmail("nancy@hotmail.com");
        guest4.setProfileImageId(R.drawable.headshot_4);
        mAttendantsList.add(guest4);

        Attendant guest5 = new Attendant();
        guest5.setName("Sarah Domingo");
        guest5.setEmail("sarah@yahoo.com");
        guest5.setProfileImageId(R.drawable.headshot_5);
        mAttendantsList.add(guest5);

        Attendant guest6 = new Attendant();
        guest6.setName("Anthony Lopez");
        guest6.setEmail("toney@gmail.com");
        guest6.setProfileImageId(R.drawable.headshot_6);
        mAttendantsList.add(guest6);

        Attendant guest7 = new Attendant();
        guest7.setName("Chris VanHorn");
        guest7.setEmail("chris@worldmail.com");
        guest7.setProfileImageId(R.drawable.headshot_7);
        mAttendantsList.add(guest7);

        Attendant guest8 = new Attendant();
        guest8.setName("Frank Krueger");
        guest8.setEmail("frank@ymail.com");
        guest8.setProfileImageId(R.drawable.headshot_8);
        mAttendantsList.add(guest8);

        Attendant guest9 = new Attendant();
        guest9.setName("Bella Florentino");
        guest9.setEmail("bella@outlook.com");
        guest9.setProfileImageId(R.drawable.headshot_9);
        mAttendantsList.add(guest9);

        Attendant guest10 = new Attendant();
        guest10.setName("Donna Simons");
        guest10.setEmail("donna@company.com");
        guest10.setProfileImageId(R.drawable.headshot_10);
        mAttendantsList.add(guest10);


    }


}
