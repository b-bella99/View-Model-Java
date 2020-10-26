package com.example.pembelianbuah.fragments;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import com.example.pembelianbuah.R;
import com.example.pembelianbuah.databinding.FragmentTambahDataBinding;
import com.example.pembelianbuah.viewmodels.BuahViewModels;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TambahData#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TambahData extends Fragment {
    BuahViewModels bvm;
    DatePickerDialog date;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TambahData() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TambahData.
     */
    // TODO: Rename and change types and number of parameters
    public static TambahData newInstance(String param1, String param2) {
        TambahData fragment = new TambahData();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentTambahDataBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_tambah_data, container, false);

        binding.edttglBuah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);
                date = new DatePickerDialog(getActivity(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int yearofyear, int monthofyear, int dayofmonth) {
                                binding.edttglBuah.setText(dayofmonth + "/" + (monthofyear + 1) + "/" + yearofyear);
                            }
                        }, year, month, day);
                date.show();
            }
        });

        bvm = new ViewModelProvider(this).get(BuahViewModels.class);
        binding.setBuah(bvm);
        binding.setLifecycleOwner(getActivity());
        return binding.getRoot();
    }

    //public void onLogClicked(View view) {
    //    Navigation.findNavController(view).navigate(TambahDataDirections.actionTambahDataToHasilBuah());
    //}
}