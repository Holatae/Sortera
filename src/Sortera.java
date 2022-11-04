/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author victor
 */
public class Sortera extends javax.swing.JFrame {

    /**
     * Creates new form Sortera
     */
    public Sortera() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lowerBoundsValue = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        upperBoundsValue = new javax.swing.JSpinner();
        amountValue = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        arrayWriteThiny = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        Sort = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        timeToExec = new javax.swing.JLabel();
        sortingAlgorithm = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Test sortering");

        jLabel2.setText("Lower Bounds");

        lowerBoundsValue.setName("lowerValue"); // NOI18N
        lowerBoundsValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lowerBoundsValueKeyPressed(evt);
            }
        });

        jLabel3.setText("Upper bounds");

        upperBoundsValue.setName("upperValue"); // NOI18N
        upperBoundsValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                upperBoundsValueKeyPressed(evt);
            }
        });

        amountValue.setName("amount"); // NOI18N
        amountValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                amountValueKeyPressed(evt);
            }
        });

        jLabel4.setText("Hur många?");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setName("arrayWriteThingy"); // NOI18N
        arrayWriteThiny.setViewportView(jTextArea1);

        jLabel5.setText("Ditt svar");

        Sort.setText("Sort");
        Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    SortActionPerformed(evt);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        });

        jLabel6.setText("Time to excecute:");

        timeToExec.setText("");

        sortingAlgorithm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"BubbleSort", "BogoSort"}));
        sortingAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortingAlgorithmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(amountValue, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(upperBoundsValue, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(lowerBoundsValue, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel6)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(sortingAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(generateButton)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Sort)
                                                                        .addComponent(timeToExec, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(arrayWriteThiny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(14, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(lowerBoundsValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(upperBoundsValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(amountValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                                .addComponent(sortingAlgorithm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(generateButton)
                                                        .addComponent(Sort))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(timeToExec))
                                                .addGap(5, 5, 5))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(arrayWriteThiny)
                                                .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lowerBoundsValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lowerBoundsValueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lowerBoundsValueKeyPressed

    private void upperBoundsValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upperBoundsValueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_upperBoundsValueKeyPressed

    private void amountValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountValueKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountValueKeyPressed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        int lowerBounds = (int) lowerBoundsValue.getValue();
        int upperBounds = (int) upperBoundsValue.getValue();
        int amount = (int) amountValue.getValue();

        //Makes so program don't throw an error when the amount is negative
        if (amount <= 0) return;

        Random random = new Random();
        ArrayList<Integer> randomArray = new ArrayList<>();
        int x = 0;

        try {
            while (x < amount) {
                randomArray.add(random.nextInt(lowerBounds, upperBounds));
                x += 1;
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Grattis du lyckades krascha detta jävla simpla program.");
            return;
        }
        for (int number : randomArray
        ) {
            jTextArea1.append(String.valueOf(number));
            jTextArea1.append(", ");
        }


    }//GEN-LAST:event_generateButtonActionPerformed

    private void SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortActionPerformed
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        String numberArrayString = jTextArea1.getText();
        String[] tempArr = numberArrayString.split(", ");

        String[] textAreaList = jTextArea1.getText().split(", ");
        int[] arr = new int[textAreaList.length];

        SortingAlgorithm sort = new SortingAlgorithm();
        long startTime = System.nanoTime();
        int[] sortedArr = new int[0];

        if (sortingAlgorithm.getSelectedIndex() == 1) {

            try {
                sortedArr = sort.BogoSort((Integer) lowerBoundsValue.getValue(),
                        (Integer) upperBoundsValue.getValue(),
                        (Integer) amountValue.getValue());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            // sortedArr can be null if the length is negative
            if (sortedArr == null) {
                return;
            }

            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1000000;

            ArrayList<String> stringList = new ArrayList<String>();

            ConvertArrayToStringList(sortedArr, stringList);
            WriteDurationAndTimeToExec(duration, stringList);
            return;
        }

        // No stupid errors
        try {
            for (int i = 0; i < textAreaList.length; i++) {
                arr[i] = Integer.parseInt(textAreaList[i]);
            }
        } catch (Exception e) {
            return;
        }


        if (sortingAlgorithm.getSelectedIndex() == 0) {
            sortedArr = sort.BubbleSort(arr);
        }


        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        ArrayList<String> stringList = new ArrayList<String>();
        ConvertArrayToStringList(sortedArr, stringList);
        WriteDurationAndTimeToExec(duration, stringList);

    }//GEN-LAST:event_SortActionPerformed

    private void WriteDurationAndTimeToExec(long duration, ArrayList<String> stringList) {
        jTextArea1.setText(String.valueOf(stringList));
        timeToExec.setText(String.valueOf(duration));
    }

    private static void ConvertArrayToStringList(int[] sortedArr, ArrayList<String> stringList) {
        for (int j : sortedArr) {
            stringList.add(String.valueOf(j));
        }
    }

    private void sortingAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortingAlgorithmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortingAlgorithmActionPerformed

/*
    private ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
        return ArrayList<Integer>;
    }
*/

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
            java.util.logging.Logger.getLogger(Sortera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sortera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sortera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sortera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sortera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sort;
    private javax.swing.JSpinner amountValue;
    private javax.swing.JScrollPane arrayWriteThiny;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSpinner lowerBoundsValue;
    private javax.swing.JComboBox<String> sortingAlgorithm;
    private javax.swing.JLabel timeToExec;
    private javax.swing.JSpinner upperBoundsValue;
    // End of variables declaration//GEN-END:variables
}
