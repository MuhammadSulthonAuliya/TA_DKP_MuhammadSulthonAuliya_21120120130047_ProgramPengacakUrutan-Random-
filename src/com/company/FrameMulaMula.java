package com.company;

//import com.company.settergetter;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//import com.company.FrameHasil;


public class FrameMulaMula {

    public JPanel PanelUtama;
    private JRadioButton RadioBInput;
    private JRadioButton RadioBUrutan;
    private JPanel PanelPilihan;
    private JPanel PanelHasil;
    private JPanel PanelInput1;
    private JButton clear;
    private JButton submit2;
    private JTextField B1;
    private JTextField B5;
    private JTextField B7;
    private JTextField B8;
    private JTextField B3;
    private JTextField B2;
    private JPanel PanelUrut1;
    private JButton submit1;
    public JRadioButton huruf;
    public JRadioButton angka;
    private JPanel PanelKosong1;
    private JButton ButtonBack2;
    private JButton ButtonBack1;
    private JButton ButtonNext3;
    public JTextField Min;
    public JTextField Max;
    private JTextField B4;
    private JTextField B6;
    private JButton ButtonNextInput;
    public JFrame Frame;
    public boolean hurufX;
    public boolean angkaX;
    public boolean InputX;
    public List<String> inputZ = new ArrayList<>();

    public FrameMulaMula() {
        Frame = new JFrame("Program Pengacak Urutan (Random)");
        RadioBUrutan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelHasil.removeAll();
                PanelHasil.repaint();
                PanelHasil.revalidate();

                PanelHasil.add(new FrameMulaMula().PanelUrut1);
                PanelHasil.repaint();
                PanelHasil.revalidate();
            }
        });
        RadioBInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelHasil.removeAll();
                PanelHasil.repaint();
                PanelHasil.revalidate();

                PanelHasil.add(new FrameMulaMula().PanelInput1);
                PanelHasil.repaint();
                PanelHasil.revalidate();
            }
        });

        ButtonNext3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int Jangkauan= inputZ.size();
                String[] inputY = new String[Jangkauan];
                for (int i = 0; i < Jangkauan; i++) {
                    inputY[i]= inputZ.get(i);
                }

                //pengacakan indeks
                int[] indeks = getRandom(Jangkauan);
                for (int i = 0; i < inputZ.size(); i++){ //for loop to print the array
                    System.out.print( indeks[i]+ " ");
                }
                inputZ.removeAll(inputZ);
                for (int i = 0; i < indeks.length; i++) { //for loop to print the array
                    inputZ.add(inputY[indeks[i]]);
                }
                /*for (int i = 0; i < indeks.length; i++) { //for loop to print the array
                    inputZ.removeAll();
                    inputZ.add(Y[indeks[i]]);
                    System.out.println(Y[indeks[i]]);
                }

                 */

                JFrame j2 = new JFrame();
                j2.setContentPane(new FrameHasilAkhir(null, null, inputZ, Jangkauan).PanelQ);
                j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                j2.pack();
                j2.setVisible(true);
                //FrameHasilAkhir F = new FrameHasilAkhir();
                //F.BuatFrame();
                /*new Form5().InputX = true;
                new Form5().angkaX = false;
                new Form5().hurufX = false;
                 */
            }
        });
        submit1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (huruf.isSelected()) {
                    char minimum = Min.getText().charAt(0);
                    int MIN = (int) minimum;
                    char maximum = Max.getText().charAt(0);
                    int MAX = (int) maximum;
                    int Jangkauan= MAX - MIN + 1;

                    getRandom(Jangkauan);
                    //pengacakan indeks
                    int[] indeks = getRandom(Jangkauan);
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
                    JFrame j2 = new JFrame();
                    j2.setContentPane(new FrameHasilAkhir(hurufY, null, null, Jangkauan).PanelQ);
                    j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    j2.pack();
                    j2.setVisible(true);

                } else if (angka.isSelected()) {
                    Integer MAX = Integer.parseInt(Max.getText());
                    Integer MIN = Integer.parseInt(Min.getText());
                    int Jangkauan= MAX - MIN + 1;
                    //pengacakan indeks
                    int[] indeks = getRandom(Jangkauan);
                    for (int i = 0; i < indeks.length; i++) //for loop to print the array
                        System.out.print( indeks[i]+ " ");System.out.print("\n");
                    int[] angka = getRandom(Jangkauan);
                    List<String> angkaY = new ArrayList<>();
                    for (int i = 0; i < angka.length; i++) { //for loop to print the array
                        String angkaZ = String.valueOf(angka[i] + MIN);
                        angkaY.add(angkaZ);
                    }
                    System.out.print(angkaY);
                    JFrame j2 = new JFrame();
                    j2.setContentPane(new FrameHasilAkhir(null, angkaY, null, Jangkauan).PanelQ);
                    j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    j2.pack();
                    j2.setVisible(true);
                }
            }
        });

        huruf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(huruf.isSelected()){
                    Min.setText("a");
                }
            }
        });
        submit2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputZ.add(B1.getText());
                inputZ.add(B2.getText());
                inputZ.add(B3.getText());
                inputZ.add(B4.getText());
                inputZ.add(B5.getText());
                inputZ.add(B6.getText());
                inputZ.add(B7.getText());
                inputZ.add(B8.getText());
                while(inputZ.remove(""));
                System.out.println(inputZ);
                System.out.println(inputZ.size());
                B1.setText("");
                B2.setText("");
                B3.setText("");
                B4.setText("");
                B5.setText("");
                B7.setText("");
                B6.setText("");
                B8.setText("");
                for (int i = 0; i < inputZ.size(); i++) {
                    while(inputZ.remove(""));
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < inputZ.size(); i++) { //for loop to print the array
                    inputZ.removeAll(inputZ);
                    while(inputZ.remove(""));
                }
                System.out.println(inputZ);
            }
        });
    }

    public static int[] getRandom(int i){
        ArrayList<Integer> Nilai_Random = new ArrayList<>();
        int nilai;
        Random r = new Random();
        while(Nilai_Random.size() < i) {
            boolean sama = false;
            nilai = r.nextInt(i);
            if (Nilai_Random.size() > 0) {
                for (int j = 0; j < Nilai_Random.size(); j++) {
                    if (nilai == Nilai_Random.get(j)) {
                        sama = true;
                        break;
                    }
                }
                if(sama == false){
                    Nilai_Random.add(nilai);
                }
            } else {
                Nilai_Random.add(nilai);
            }
        }
        int[] indeks = new int[i];
        for (int j = 0; j < Nilai_Random.size(); j++) {
            indeks[j] = Nilai_Random.get(j);
        }
        return indeks;
    }
    public static void main(String[] args) {

        FrameMulaMula var= new FrameMulaMula();
        var.Frame.setContentPane(var.PanelUtama);
        var.Frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        var.Frame.pack();
        var.Frame.setVisible(true);


    }
}
