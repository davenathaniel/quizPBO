/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author LENOVO G4-45
 */
public class Jurusan {
    private String kode;
    private String nama_jurusan;
    
    public Jurusan(){}
    
    public Jurusan(String kode, String nama_jurusan) {
        this.kode = kode;
        this.nama_jurusan = nama_jurusan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama_jurusan() {
        return nama_jurusan;
    }

    public void setNama_jurusan(String nama_jurusan) {
        this.nama_jurusan = nama_jurusan;
    }
    
}
