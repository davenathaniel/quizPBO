/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author LENOVO G4-45
 */
public class Controller {
    
    static DatabaseHandler conn = new DatabaseHandler();
    
    public static ArrayList<Jurusan> getAllJurusan() {
        ArrayList<Jurusan> listJurusan = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM jurusan";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Jurusan jurusan = new Jurusan();
                jurusan.setKode(rs.getString("kode"));
                jurusan.setNama_jurusan(rs.getString("nama_jurusan"));
                listJurusan.add(jurusan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listJurusan);
    }

    public static boolean insertJurusan(Jurusan jurusan) {
        conn.connect();
        String query = "INSERT INTO jurusan VALUES(?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, jurusan.getKode());
            stmt.setString(2, jurusan.getNama_jurusan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
    public static ArrayList<Mahasiswa> getAllMahasiswa() {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        conn.connect();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement stmt = conn.con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(rs.getString("kode"));
                mhs.setNama_mhs(rs.getString("nama_mhs"));
                mhs.setAngkatan(rs.getInt("angkatan"));
                mhs.setKode_jurusan(rs.getString("kode_jurusan"));
                listMahasiswa.add(mhs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (listMahasiswa);
    }
    
    public static boolean insertMahasiswa(Jurusan jurusan) {
        conn.connect();
        String query = "INSERT INTO mahasiswa VALUES(?,?)";
        try {
            PreparedStatement stmt = conn.con.prepareStatement(query);
            stmt.setString(1, jurusan.getKode());
            stmt.setString(2, jurusan.getNama_jurusan());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }
    
}
