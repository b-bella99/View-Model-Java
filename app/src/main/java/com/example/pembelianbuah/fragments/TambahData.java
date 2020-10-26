package com.example.pembelianbuah.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pembelianbuah.R;
import com.example.pembelianbuah.databinding.FragmentTambahDataBinding;
import com.example.pembelianbuah.viewmodels.BuahViewModels;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TambahData#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TambahData extends Fragment {
    BuahViewModels bvm;

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
        bvm = new ViewModelProvider(this).get(BuahViewModels.class);
        binding.setBuah(bvm);
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }

    public void onLogClicked(View view) {
        //Navigation.findNavController(view).navigate(T.actionTambahDataBuahToLogDataBuah());
    }
}