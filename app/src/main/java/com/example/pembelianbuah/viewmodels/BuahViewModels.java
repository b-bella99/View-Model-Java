package com.example.pembelianbuah.viewmodels;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pembelianbuah.models.Buah;

public class BuahViewModels extends ViewModel {
    private MutableLiveData<Buah> buahMutableLiveData = new MutableLiveData<>();
    //private final MutableLiveData mutableBuah = new MutableLiveData();
    public Buah buah = new Buah();

    public LiveData<Buah> getBuah(){
        return buahMutableLiveData;
    }

    public void addLog(String tgl, String nm, String hrg, String jml, String merk){
        buah.setTanggal(tgl);
        buah.setNama(nm);
        buah.setHarga(hrg);
        buah.setJumlah(jml);
        buah.setMerk(merk);
        buahMutableLiveData.setValue(buah);
        Log.d("Buah : ", String.valueOf(buah.getNama()));
        //mutableBuah.setValue(buah);
    }

    //public MutableLiveData getMutableBuah(){
      //  return mutableBuah;
    //}
}
