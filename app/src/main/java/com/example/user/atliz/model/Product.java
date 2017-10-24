package com.example.user.atliz.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joshua on 22/10/2017.
 */

public class Product implements Parcelable {
    public static final String BUNDLE_EXTRA_NAME = "product";

    private String name;
    private double amount;
    private double weight;
    private String message;

    public Product(String name, Double amount, Double weight, String message) {
        this.name = name;
        this.amount = amount;
        this.weight = weight;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private Product(Parcel in) {
        name = in.readString();
        amount = in.readDouble();
        weight = in.readDouble();
        message = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeDouble(amount);
        parcel.writeDouble(weight);
        parcel.writeString(message);
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };
}
