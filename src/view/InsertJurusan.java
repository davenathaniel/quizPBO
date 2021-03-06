/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import model.*;
import controller.*;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LENOVO G4-45
 */
public class InsertJurusan implements ActionListener {
    JFrame layout = new JFrame("Insert Data Jurusan Baru");
    JPanel dataPanel;
    JLabel title, labelKode, labelNama;
    JTextArea kode, nama;
    JButton back, submit;
    
    public InsertJurusan() {
        layout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        layout.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        title = new JLabel("Insert Data Jurusan Baru",JLabel.CENTER);
        title.setBounds(0,0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5);
        title.setFont(new Font("Impact",Font.PLAIN,50));
        
        labelKode = new JLabel("Kode Jurusan");
        labelKode.setBounds(600,10,200,50);
        kode =  new JTextArea();
        kode.setBounds(820, 10, 300,50);
        
        labelNama = new JLabel("Nama Jurusan");
        labelNama.setBounds(600,70,200,50);
        nama =  new JTextArea();
        nama.setBounds(820, 70, 300,50);
        
        back = new JButton("Back");
        back.setBounds(600,150,150,50);
        back.addActionListener(this);
        
        submit = new JButton("Submit");
        submit.setBounds(900, 150,150,50);
        submit.addActionListener(this);
        
        dataPanel = new JPanel();
        dataPanel.setLayout(null);
        
        dataPanel.add(labelKode);
        dataPanel.add(kode);
        dataPanel.add(labelNama);
        dataPanel.add(nama);
        dataPanel.add(back);
        dataPanel.add(submit);
        dataPanel.setBounds(0,(int)Toolkit.getDefaultToolkit().getScreenSize().getHeight()/5,(int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(),500);
        
        layout.add(title);
        layout.add(dataPanel);
        layout.setLayout(null);
        layout.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String buttonClick = e.getActionCommand();
        switch(buttonClick){
            case "Back" :
                layout.dispose();
                new MainMenu();
                break;
            case "Submit":
                String kode = this.kode.getText();
                String nama = this.nama.getText();
                Jurusan newJurusan = new Jurusan(kode,nama);
                if(controller.Controller.insertJurusan(newJurusan)){
                    layout.dispose();
                    JOptionPane.showMessageDialog(null,"Insert Berhasil");
                }else{
                    JOptionPane.showMessageDialog(null, "Insert Failed!", "Alert", JOptionPane.WARNING_MESSAGE);
                }
                break;
        }
    }
}