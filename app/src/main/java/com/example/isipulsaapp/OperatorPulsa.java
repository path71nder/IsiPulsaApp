package com.example.isipulsaapp;

import android.os.Parcel;
import android.os.Parcelable;

public class OperatorPulsa implements Parcelable {
    private String operator;
    private int nominal;
    private int harga;

    public OperatorPulsa(String operator, int nominal, int harga) {
        this.operator = operator;
        this.nominal = nominal;
        this.harga = harga;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.operator);
        dest.writeInt(this.nominal);
        dest.writeInt(this.harga);
    }

    protected OperatorPulsa(Parcel in) {
        this.operator = in.readString();
        this.nominal = in.readInt();
        this.harga = in.readInt();
    }

    public static final Parcelable.Creator<OperatorPulsa> CREATOR = new Parcelable.Creator<OperatorPulsa>() {
        @Override
        public OperatorPulsa createFromParcel(Parcel source) {
            return new OperatorPulsa(source);
        }

        @Override
        public OperatorPulsa[] newArray(int size) {
            return new OperatorPulsa[size];
        }
    };
}
