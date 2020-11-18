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
public class Mahasiswa {
    private String nim;
    private String nama_mhs;
    private int angkatan;
    private String kode_jurusan;
    
    public Mahasiswa(){}
    
    public Mahasiswa(String nim, String nama_mhs, int angkatan, String kode_jurusan) {
        this.nim = nim;
        this.nama_mhs = nama_mhs;
        this.angkatan = angkatan;
        this.kode_jurusan = kode_jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getKode_jurusan() {
        return kode_jurusan;
    }

    public void setKode_jurusan(String kode_jurusan) {
        this.kode_jurusan = kode_jurusan;
    }
    
}
