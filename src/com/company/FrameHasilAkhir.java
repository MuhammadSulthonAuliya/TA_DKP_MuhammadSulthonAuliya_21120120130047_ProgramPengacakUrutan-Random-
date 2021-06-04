package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import com.company.settergetter;
import java.util.ArrayList;
import java.util.List;

public class FrameHasilAkhir {
    public JPanel PanelQ;
    private JTextArea TextAreaHasil;
    private JButton ListButton;
    private JButton LISTButton;

    public Integer getJangkauan() {
        return Jangkauan;
    }

    public void setJangkauan(Integer jangkauan) {
        Jangkauan = jangkauan;
    }

    private Integer Jangkauan;


    public List<String> getInput() {
        return input;
    }

    public void setInput(List<String> input) {
        this.input = input;
    }

    private List<String> input;

    public List<String> getAngka() {
        return angka;
    }

    public void setAngka(List<String> angka) {
        this.angka = angka;
    }

    private List<String> angka;


    public List<String> getHuruf() {
        return huruf;
    }

    public void setHuruf(List<String> huruf) {
        this.huruf = huruf;
    }

    private List<String> huruf;


    public FrameHasilAkhir(List<String> huruf, List<String> angka, List<String> input, Integer Jangkauan) {
        this.huruf = huruf;
        this.Jangkauan = Jangkauan;
        this.angka = angka;
        this.input = input;
        ListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /*Form5 L= new Form5();
                if (L.huruf.isSelected()) {
                    char minimum = L.Min.getText().charAt(0);
                    int MIN = (int) minimum;
                    char maximum = L.Max.getText().charAt(0);
                    int MAX = (int) maximum;
                    int Jangkauan= MAX - MIN + 1;
                    setJangkauan(Jangkauan);
                    System.out.print(getJangkauan());
                    L.getRandom(Jangkauan);
                    //pengacakan indeks
                    int[] indeks = L.getRandom(Jangkauan);
                    for (int i = 0; i < indeks.length; i++){ //for loop to print the array
                        System.out.print( indeks[i]+ " ");
                        System.out.print("\n");
                    }
                    //char[] huruf={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                    String[] huruf={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
                    List<String> hurufY = new ArrayList<>();
                    for (int i = 0; i < indeks.length; i++) { //for loop to print the array
                        hurufY.add(huruf[indeks[i]]);
                    }
                    setHuruf(hurufY);
                    //System.out.print(getHuruf());
                } else if (angka.isSelected()) {
                    Integer MAX = Integer.parseInt(Max.getText());
                    Integer MIN = Integer.parseInt(Min.getText());
                    int Jangkauan= MAX - MIN + 1;
                    F.setJangkauan(Jangkauan);
                    getRandom(Jangkauan);
                    //pengacakan indeks
                    int[] indeks = getRandom(Jangkauan);
                    for (int i = 0; i < indeks.length; i++) //for loop to print the array
                        System.out.print( indeks[i]+ " ");System.out.print("\n");
                    int[] angka = getRandom(Jangkauan);
                    for (int i = 0; i < angka.length; i++) //for loop to print the array
                        angka[i]=angka[i]+MIN;
                    F.setAngka(angka);
                    System.out.print(F.getAngka());
                }
                */
                if (angka==null && input==null) {
                    TextAreaHasil.setText(""+getHuruf());
                } else if (huruf==null && input==null) {
                    TextAreaHasil.setText(""+getAngka());
                }else if (angka==null && huruf==null) {
                TextAreaHasil.setText(""+getInput());
                }
            }
        });
    }


    public static void BuatFrame(){
        JFrame j2 = new JFrame();
        j2.setContentPane(new FrameHasilAkhir(null, null, null, null).PanelQ);
        j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j2.pack();
        j2.setVisible(true);
    }

}
