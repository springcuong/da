/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package lthdt.chuong3.dohoa.frames;

import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author HOAI NGUYEN
 */
public class XuatDuLieuFrame extends javax.swing.JInternalFrame {

    int[] a;
    /**
     * Creates new form XuatDuLieuFrame
     */
    public XuatDuLieuFrame() {
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

        pnPanel = new javax.swing.JPanel();
        btnVe = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vẽ dữ liệu mảng 1 chiều");

        javax.swing.GroupLayout pnPanelLayout = new javax.swing.GroupLayout(pnPanel);
        pnPanel.setLayout(pnPanelLayout);
        pnPanelLayout.setHorizontalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnPanelLayout.setVerticalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        btnVe.setText("Vẽ mảng 1 chiều ra màn hình");
        btnVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp xếp mảng 1 chiều");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(btnVe, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSapXep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(pnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVe)
                .addGap(15, 15, 15)
                .addComponent(btnSapXep)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeActionPerformed
        // TODO add your handling code here:
        Graphics2D gr = (Graphics2D) pnPanel.getGraphics();
        int maxX = pnPanel.getWidth();
        int maxY = pnPanel.getHeight();
        int step = 5;
        int n = maxX/step;
        a = new int[n];
        Random rnd = new Random();
        for ( int i = 0; i < n; i++){
            a[i] = rnd.nextInt(maxY);
        }
        int beginX = 0, beginY = 0;
        gr.clearRect(0, 0, maxX, maxY);
        for ( int i = 0; i < n; i++ ){
//            gr.drawRect(beginX, beginY, step, a[i]);
            //Đỗi cách hiển thị cột
            gr.drawRect(beginX, maxY - a[i], step, a[i]);
              beginX += step;
        }
    }//GEN-LAST:event_btnVeActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        // TODO add your handling code here:
        Graphics2D gr = (Graphics2D) pnPanel.getGraphics();
       int maxX = pnPanel.getWidth();
       int maxY = pnPanel.getHeight();
       int step = 5;
       int n = maxX/step;
       int beginX = 0; int beginX2 = 0;
       for (int i = 0; i < n - 1; i++){
           for (int j = i + 1; j < n; j++){
               if(a[i] > a[j]){
                   int temp = a[i];
                   //Xoa hinh a[i] cu
                   gr.clearRect(beginX, maxY - a[i], step, a[i]);
                   //Ve hinh a[i] moi
                   a[i] = a[j];
                   gr.drawRect(beginX, maxY - a[i], step, a[i]);
                   //Xoa hinh a[j] cu
                   beginX2 = j * step;
                   gr.clearRect(beginX2, maxY - a[j], step, a[j]);
                   //Ve hinh a[j] moi
                   a[j] = temp;
                   gr.drawRect(beginX2, maxY - a[j], step, a[j]);
               }
           }
           beginX += step;
       }
    }//GEN-LAST:event_btnSapXepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnVe;
    private javax.swing.JPanel pnPanel;
    // End of variables declaration//GEN-END:variables
}