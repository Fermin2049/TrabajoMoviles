package com.example.listaimuebles;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import Modelos.Inmueble;

public class MainActivityViewModel extends AndroidViewModel {
    public MutableLiveData<List<Inmueble>> inmueblesMutable;
    public MainActivityViewModel(@NotNull Application application){
        super(application);
    }

    public LiveData<List<Inmueble>> getInmueblesMutable(){
        if (inmueblesMutable==null){
            this.inmueblesMutable=new MutableLiveData<>();
        }
        return inmueblesMutable;
    }

    public void crearLista(){
        ArrayList<Inmueble> lista = new ArrayList<>();
        lista.add(new Inmueble(R.drawable.casa1,10000,"Anexo 5"));
        lista.add(new Inmueble(R.drawable.casa2,30000,"1 de mayo"));
        lista.add(new Inmueble(R.drawable.casa3,40000,"Tibileti"));
        lista.add(new Inmueble(R.drawable.casa4,50000,"Eva Peron"));
        lista.add(new Inmueble(R.drawable.casa5,15000,"Quebrachos"));
        inmueblesMutable.setValue(lista);
    }
}
