package com.example.asus.futsalngalam.Model;

import java.io.Serializable;

/**
 * Created by ASUS on 24-Nov-17.
 */

public class Penyewa implements Serializable {

    private String Nama, Telepon;

    public Penyewa() {

    }

    public String getNama() {
        return Nama;
    }

    public String getTelepon() {
        return Telepon;
    }
}