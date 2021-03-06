package com.example.pembelianbuah.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pembelianbuah.R;
import com.example.pembelianbuah.databinding.FragmentHasilBuahBinding;
import com.example.pembelianbuah.models.Buah;
import com.example.pembelianbuah.viewmodels.BuahViewModels;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HasilBuah#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HasilBuah extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HasilBuah() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HasilBuah.
     */
    // TODO: Rename and change types and number of parameters
    public static HasilBuah newInstance(String param1, String param2) {
        HasilBuah fragment = new HasilBuah();
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
        FragmentHasilBuahBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_hasil_buah, container, false);
        final BuahViewModels model = new ViewModelProvider(this).get(BuahViewModels.class);
        model.getBuah().observe(getViewLifecycleOwner(), new Observer<Buah>() {
            @Override
            public void onChanged(Buah buah) {
                binding.textView.setText(buah.getNama().toString());
                binding.textView15.setText("cek");
            }
        });
        return binding.getRoot();
    }
}