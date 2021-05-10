/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import Ruang.Balok;
import Bidang.PersegiPanjang;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 *
 * @author ASUS
 */
public class View extends JFrame implements ActionListener{
    JLabel lkalkulator = new JLabel("KALKULATOR BALOK");
    
    JLabel lPanjang = new JLabel("Panjang");
    final JTextField fPanjang = new JTextField(11);
    
    JLabel lLebar = new JLabel("Lebar");
    final JTextField fLebar = new JTextField(11);
    
    JLabel lTinggi = new JLabel("Tinggi");
    final JTextField fTinggi = new JTextField(11);
    
    JLabel lHasil = new JLabel("Hasil :");
    
    JLabel lLuasP = new JLabel(); 
    
    JLabel lKelilingP = new JLabel();
    
    JLabel lVolumeB = new JLabel();
    
    JLabel lLuasPer = new JLabel();
    
    
    JButton bHitung = new JButton("Hitung");
    JButton bReset = new JButton("Reset");
    
    
    View(){
        setTitle("Tugas Pertemuan 5");
        setSize(400,500);
        setLayout(null);

        add(lkalkulator);
        add(lPanjang);
        add(fPanjang);
        add(lLebar);
        add(fLebar);
        add(lTinggi);
        add(fTinggi);
        add(lHasil);
        add(bHitung);
        add(bReset);
        
        lkalkulator.setBounds(135,15,200,20);
        lPanjang.setBounds(10,55,200,20);
        fPanjang.setBounds(90, 55, 200, 20);
        lLebar.setBounds(10,85,150,20);
        fLebar.setBounds(90, 85, 200, 20);
        lTinggi.setBounds(10,115,150,20);
        fTinggi.setBounds(90, 115, 200, 20);
        lHasil.setBounds(50, 155, 150, 20);
        bHitung.setBounds(90, 315, 100, 30);
        bReset.setBounds(195, 315, 100, 30);
        bHitung.addActionListener(this);
        bReset.addActionListener(this);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bHitung) {
            
            try{
                double p, l, t;
               

                p = Double.parseDouble(fPanjang.getText());
                l = Double.parseDouble(fLebar.getText());
                t = Double.parseDouble(fTinggi.getText());
                
                PersegiPanjang per = new PersegiPanjang(p,l);
                Balok bal = new Balok(p,l,t);
                          
                lLuasP.setText("Luas Persegi                   : " + Double.toString(per.Luas()));
                add(lLuasP);
                lLuasP.setBounds(50, 175, 200, 20);
                
                lKelilingP.setText("Keliling Persegi              : " + Double.toString(per.Keliling()));
                add(lKelilingP);
                lKelilingP.setBounds(50, 195, 200, 20);
                
                lVolumeB.setText("Volume Balok                  : " + Double.toString(bal.Volume()));
                add(lVolumeB);
                lVolumeB.setBounds(50, 215, 200, 20);
                
                lLuasPer.setText("Luas Permukaan Balok  : " + Double.toString(bal.Luas()));
                add(lLuasPer);
                lLuasPer.setBounds(50, 235, 200, 20);
                
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            
        }
        
        if (ae.getSource() == bReset) {
            fPanjang.setText(null);
            fLebar.setText(null);
            fTinggi.setText(null);
            lLuasP.setText(null);
            lKelilingP.setText(null);
            lVolumeB.setText(null);
            lLuasPer.setText(null);
        }
    }

    
}
