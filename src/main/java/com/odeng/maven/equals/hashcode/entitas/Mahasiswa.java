/*
 * maven-equals-hashcode

 * Copyright (c) 2019
 * All rights reserved.
 * Written by od3ng created on Jun 24, 2019 6:34:59 AM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */
package com.odeng.maven.equals.hashcode.entitas;

import java.util.Objects;

/**
 *
 * @author od3ng
 */

public class Mahasiswa{

    private long id;
    private String nim;
    private String nama;
    private float ipk;
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, float ipk, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 17 * hash + Objects.hashCode(this.nim);
        hash = 17 * hash + Objects.hashCode(this.nama);
        hash = 17 * hash + Float.floatToIntBits(this.ipk);
        hash = 17 * hash + Objects.hashCode(this.jurusan);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mahasiswa other = (Mahasiswa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.ipk) != Float.floatToIntBits(other.ipk)) {
            return false;
        }
        if (!Objects.equals(this.nim, other.nim)) {
            return false;
        }
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.jurusan, other.jurusan)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + ", jurusan=" + jurusan + '}';
    }

}
