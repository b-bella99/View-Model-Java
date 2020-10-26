package com.example.pembelianbuah.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pembelianbuah.models.Buah;

public class BuahViewModels extends ViewModel {
    public MutableLiveData<Buah> buahMutableLiveData = new MutableLiveData<>();
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
    }
}
