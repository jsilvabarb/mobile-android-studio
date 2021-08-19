package com.example.pizzariapalestra;

import android.os.Parcel;
import android.os.Parcelable;

public class DadosParcelable implements Parcelable {

    String sabor;
    String ingredientes;


    public DadosParcelable(String sabor, String ingredientes) {
        this.sabor = sabor;
        this.ingredientes = ingredientes;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public static final Parcelable.Creator<DadosParcelable> CREATOR = new Parcelable.Creator<DadosParcelable>() {
        @Override
        public DadosParcelable createFromParcel(Parcel in) {
            return new DadosParcelable(in);
        }

        @Override
        public DadosParcelable[] newArray(int size) {
            return new DadosParcelable[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(sabor);
        parcel.writeString(ingredientes);
    }
    public DadosParcelable(Parcel p) {
        sabor = p.readString();
        ingredientes = p.readString();
    }
}
