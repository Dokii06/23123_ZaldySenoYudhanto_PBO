/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javadb;

/**
 *
 * @author user
 */
public class Kalkulator extends javax.swing.JFrame {
    private String angka = "";
    private double total, angkaPertama, angkaKedua;
    private String operasi;

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelKalkulator = new javax.swing.JPanel();
        panelAngka = new javax.swing.JPanel();
        btnTujuh = new javax.swing.JButton();
        btnDelapan = new javax.swing.JButton();
        btnSembilan = new javax.swing.JButton();
        btnEmpat = new javax.swing.JButton();
        btnLima = new javax.swing.JButton();
        btnEnam = new javax.swing.JButton();
        btnSatu = new javax.swing.JButton();
        btnTiga = new javax.swing.JButton();
        btnDua = new javax.swing.JButton();
        btnTitik = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnKosong = new javax.swing.JButton();
        panelPerhitungan = new javax.swing.JPanel();
        btnKurang = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnSamaDengan = new javax.swing.JButton();
        btnModulus = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));

        panelKalkulator.setBackground(new java.awt.Color(36, 54, 66));

        panelAngka.setBackground(new java.awt.Color(56, 116, 120));

        btnTujuh.setBackground(new java.awt.Color(226, 241, 231));
        btnTujuh.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTujuh.setText("7");
        btnTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTujuhActionPerformed(evt);
            }
        });

        btnDelapan.setBackground(new java.awt.Color(226, 241, 231));
        btnDelapan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelapan.setText("8");
        btnDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelapanActionPerformed(evt);
            }
        });

        btnSembilan.setBackground(new java.awt.Color(226, 241, 231));
        btnSembilan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSembilan.setText("9");
        btnSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSembilanActionPerformed(evt);
            }
        });

        btnEmpat.setBackground(new java.awt.Color(226, 241, 231));
        btnEmpat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmpat.setText("4");
        btnEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpatActionPerformed(evt);
            }
        });

        btnLima.setBackground(new java.awt.Color(226, 241, 231));
        btnLima.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLima.setText("5");
        btnLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimaActionPerformed(evt);
            }
        });

        btnEnam.setBackground(new java.awt.Color(226, 241, 231));
        btnEnam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEnam.setText("6");
        btnEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnamActionPerformed(evt);
            }
        });

        btnSatu.setBackground(new java.awt.Color(226, 241, 231));
        btnSatu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSatu.setText("1");
        btnSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatuActionPerformed(evt);
            }
        });

        btnTiga.setBackground(new java.awt.Color(226, 241, 231));
        btnTiga.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTiga.setText("3");
        btnTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTigaActionPerformed(evt);
            }
        });

        btnDua.setBackground(new java.awt.Color(226, 241, 231));
        btnDua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDua.setText("2");
        btnDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDuaActionPerformed(evt);
            }
        });

        btnTitik.setBackground(new java.awt.Color(226, 241, 231));
        btnTitik.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTitik.setText(".");
        btnTitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTitikActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(226, 241, 231));
        btnC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnKosong.setBackground(new java.awt.Color(226, 241, 231));
        btnKosong.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKosong.setText("0");
        btnKosong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKosongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAngkaLayout = new javax.swing.GroupLayout(panelAngka);
        panelAngka.setLayout(panelAngkaLayout);
        panelAngkaLayout.setHorizontalGroup(
            panelAngkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAngkaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelAngkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAngkaLayout.createSequentialGroup()
                        .addComponent(btnTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelapan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAngkaLayout.createSequentialGroup()
                        .addComponent(btnEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLima, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAngkaLayout.createSequentialGroup()
                        .addComponent(btnSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAngkaLayout.createSequentialGroup()
                        .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKosong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelAngkaLayout.setVerticalGroup(
            panelAngkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAngkaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelAngkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelapan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelAngkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLima, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelAngkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelAngkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTitik, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKosong, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPerhitungan.setBackground(new java.awt.Color(56, 116, 120));

        btnKurang.setBackground(new java.awt.Color(226, 241, 231));
        btnKurang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(226, 241, 231));
        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnBagi.setBackground(new java.awt.Color(226, 241, 231));
        btnBagi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnKali.setBackground(new java.awt.Color(226, 241, 231));
        btnKali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKali.setText("X");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnSamaDengan.setBackground(new java.awt.Color(226, 241, 231));
        btnSamaDengan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSamaDengan.setText("=");
        btnSamaDengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamaDenganActionPerformed(evt);
            }
        });

        btnModulus.setBackground(new java.awt.Color(226, 241, 231));
        btnModulus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModulus.setText("%");
        btnModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModulusActionPerformed(evt);
            }
        });

        btnE.setBackground(new java.awt.Color(226, 241, 231));
        btnE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnB.setBackground(new java.awt.Color(226, 241, 231));
        btnB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPerhitunganLayout = new javax.swing.GroupLayout(panelPerhitungan);
        panelPerhitungan.setLayout(panelPerhitunganLayout);
        panelPerhitunganLayout.setHorizontalGroup(
            panelPerhitunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerhitunganLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPerhitunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPerhitunganLayout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPerhitunganLayout.createSequentialGroup()
                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPerhitunganLayout.createSequentialGroup()
                        .addComponent(btnModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPerhitunganLayout.createSequentialGroup()
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelPerhitunganLayout.setVerticalGroup(
            panelPerhitunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerhitunganLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPerhitunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelPerhitunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelPerhitunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelPerhitunganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        hasil.setBackground(new java.awt.Color(0, 0, 0));
        hasil.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        hasil.setForeground(new java.awt.Color(255, 255, 255));
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKalkulatorLayout = new javax.swing.GroupLayout(panelKalkulator);
        panelKalkulator.setLayout(panelKalkulatorLayout);
        panelKalkulatorLayout.setHorizontalGroup(
            panelKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKalkulatorLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(panelKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(hasil)
                    .addGroup(panelKalkulatorLayout.createSequentialGroup()
                        .addComponent(panelAngka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(panelPerhitungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        panelKalkulatorLayout.setVerticalGroup(
            panelKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKalkulatorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panelKalkulatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPerhitungan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAngka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKalkulator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelKalkulator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasilActionPerformed

    private void btnTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTujuhActionPerformed
        // TODO add your handling code here:
        angka += "7";
        hasil.setText(angka);
    }//GEN-LAST:event_btnTujuhActionPerformed

    private void btnDelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelapanActionPerformed
        // TODO add your handling code here:
        angka += "8";
        hasil.setText(angka);
    }//GEN-LAST:event_btnDelapanActionPerformed

    private void btnSembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSembilanActionPerformed
        // TODO add your handling code here:
        angka += "9";
        hasil.setText(angka);
    }//GEN-LAST:event_btnSembilanActionPerformed

    private void btnEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpatActionPerformed
        // TODO add your handling code here:
        angka += "4";
        hasil.setText(angka);
    }//GEN-LAST:event_btnEmpatActionPerformed

    private void btnLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimaActionPerformed
        // TODO add your handling code here:
        angka += "5";
        hasil.setText(angka);
    }//GEN-LAST:event_btnLimaActionPerformed

    private void btnEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnamActionPerformed
        // TODO add your handling code here:
        angka += "6";
        hasil.setText(angka);
    }//GEN-LAST:event_btnEnamActionPerformed

    private void btnSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatuActionPerformed
        // TODO add your handling code here:
        angka += "1";
        hasil.setText(angka);
    }//GEN-LAST:event_btnSatuActionPerformed

    private void btnTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTigaActionPerformed
        // TODO add your handling code here:
        angka += "3";
        hasil.setText(angka);
    }//GEN-LAST:event_btnTigaActionPerformed

    private void btnDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDuaActionPerformed
        // TODO add your handling code here:
        angka += "2";
        hasil.setText(angka);
    }//GEN-LAST:event_btnDuaActionPerformed

    private void btnTitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTitikActionPerformed
        // TODO add your handling code here:
        angka += ",";
        hasil.setText(angka);
    }//GEN-LAST:event_btnTitikActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        angka = "";
        angkaPertama = 0;
        angkaKedua = 0;
        total = 0;
        operasi = "";
        hasil.setText("");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnKosongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKosongActionPerformed
        // TODO add your handling code here:
        angka += "0";
        hasil.setText(angka);
    }//GEN-LAST:event_btnKosongActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        // TODO add your handling code here:
        if (angka.equals("")) {
            angka += "-";
            hasil.setText(angka);
        }else{
            angkaPertama = Double.parseDouble(angka);
            operasi = "-";
            angka = "";
            hasil.setText(angka);
        }

    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        angkaPertama = Double.parseDouble(angka);
        operasi = "+";
        angka = "";
        hasil.setText(angka);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
        // TODO add your handling code here:
        angkaPertama = Double.parseDouble(angka);
        operasi = "/";
        angka = "";
        hasil.setText(angka);
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        // TODO add your handling code here:
        angkaPertama = Double.parseDouble(angka);
        operasi = "X";
        angka = "";
        hasil.setText(angka);
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamaDenganActionPerformed
        // TODO add your handling code here:
        angkaKedua = Double.parseDouble(angka);
        switch(operasi) {
            case "+":
                total = angkaPertama + angkaKedua;
                break;
            case "-":
                total = angkaPertama - angkaKedua;
                break;
            case "X":
                total = angkaPertama * angkaKedua;
                break;
            case "/":
                total = angkaPertama / angkaKedua;
                if (operasi.equals("/") && angkaKedua == 0) {
                    hasil.setText("Error: Division by zero");
                    angka = "";
                    return;
                    }
                break;
            case "%":
                total = angkaPertama % angkaKedua;
                break;
        }
        if (total == (int) total) {
            hasil.setText(String.valueOf((int) total));
        }else{
            hasil.setText(String.valueOf(total));
        }
        angka = String.valueOf(total);
    }//GEN-LAST:event_btnSamaDenganActionPerformed

    private void btnModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModulusActionPerformed
        // TODO add your handling code here:
        angkaPertama = Double.parseDouble(angka);
        operasi = "%";
        angka = "";
        hasil.setText(angka);
    }//GEN-LAST:event_btnModulusActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
        angka = String.valueOf(Math.E);
        hasil.setText(angka);
    }//GEN-LAST:event_btnEActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
        //B digunakan untuk menghapus atau backspace
        if (angka.length() > 0) {
            angka = angka.substring(0, angka.length() - 1);
            hasil.setText(angka);
        }
    }//GEN-LAST:event_btnBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDelapan;
    private javax.swing.JButton btnDua;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEmpat;
    private javax.swing.JButton btnEnam;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKosong;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnLima;
    private javax.swing.JButton btnModulus;
    private javax.swing.JButton btnSamaDengan;
    private javax.swing.JButton btnSatu;
    private javax.swing.JButton btnSembilan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTiga;
    private javax.swing.JButton btnTitik;
    private javax.swing.JButton btnTujuh;
    private javax.swing.JTextField hasil;
    private javax.swing.JPanel panelAngka;
    private javax.swing.JPanel panelKalkulator;
    private javax.swing.JPanel panelPerhitungan;
    // End of variables declaration//GEN-END:variables
}
