
package com.felix.nontransitivedice;

import javax.swing.ButtonModel;
import com.felix.nontransitivedice.Dice;

/**
 *
 * @author alexgray
 */
public class Window extends javax.swing.JFrame
{
    private int dieOne = 0;
    private int dieTwo = 0;
    public Window()
    {
        initComponents();
        //first colum
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        buttonGroup1.add(jRadioButton3);
        buttonGroup1.add(jRadioButton4);
        //second colum
        buttonGroup2.add(jRadioButton5);
        buttonGroup2.add(jRadioButton6);
        buttonGroup2.add(jRadioButton7);
        buttonGroup2.add(jRadioButton8);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Non-Transitive Dice");
        setLocation(new java.awt.Point(460, 300));
        setResizable(false);

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Green");
        jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jRadioButton1StateChanged(evt);
            }
        });

        jRadioButton2.setText("Red");
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jRadioButton2StateChanged(evt);
            }
        });

        jRadioButton3.setText("Yellow");
        jRadioButton3.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jRadioButton3StateChanged(evt);
            }
        });
        jRadioButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Purple");
        jRadioButton4.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                jRadioButton4StateChanged(evt);
            }
        });

        jButton1.setText("Throw Dice!");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("Purple");

        jRadioButton6.setText("Yellow");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jRadioButton6ActionPerformed(evt);
            }
        });

        jRadioButton7.setText("Red");

        jRadioButton8.setSelected(true);
        jRadioButton8.setText("Green");

        jLabel1.setText("Dice One");

        jLabel2.setText("Dice Two");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(15);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(76, 76, 76)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton5))))
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4, jRadioButton5, jRadioButton6, jRadioButton7, jRadioButton8});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton3ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton3ActionPerformed
        //not needed
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        updateButtons();
        rollDice(dieOne, dieTwo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateButtons(){
        //get selected, select for second column
        
        if(jRadioButton1.isSelected()){         //green
            jRadioButton7.setSelected(true);    //red
            dieOne = 1;
            dieTwo = 2;
        }
        else if(jRadioButton2.isSelected()){    //red
            jRadioButton6.setSelected(true);    //yellow
            dieOne = 2;
            dieTwo = 3;
        }
        else if(jRadioButton3.isSelected()){    //yellow
            jRadioButton5.setSelected(true);    //purple
            dieOne = 3;
            dieTwo = 4;
        }
        else if(jRadioButton4.isSelected()){    //purple
            jRadioButton8.setSelected(true);    //green
            dieOne = 4;
            dieTwo = 1;
        }
    }
    
    private int getDiceValue(int die){
        switch(die){
            case 1:
                return Dice.getGreen();
            case 2:
                return Dice.getRed();
            case 3:
                return Dice.getYellow();
            case 4:
                return Dice.getPurple();
            default:
                System.err.print("No dice valid dice number passed to getDiceValue");
                System.exit(1);
                return 0;
        }
    }
    
    private void rollDice(int dieOne, int dieTwo){
        int[] oneResults = new int[10];
        int[] twoResults = new int[10];
        for (int i = 0; i < 10; i++)
        {
            oneResults[i] = getDiceValue(dieOne);
            twoResults[i] = getDiceValue(dieTwo);
        }
        
        outputResults(oneResults, twoResults);
    }
    
    private void outputResults(int[] oneR, int[] twoR){
        jTextArea1.setText("");
        StringBuilder sb = new StringBuilder();
        int oneWins = 0;
        int twoWins = 0;
        int winner = 0;
        for (int i = 0; i < 10; i++)
        {
            winner = getHighest(oneR[i], twoR[i]);
            if(winner == oneR[i]){
                oneWins++;
            } else {
                twoWins++;
            }
            jTextArea1.append("You: " + oneR[i] + "    PC: " + twoR[i] +"\n");
        }
        if(getHighest(oneWins, twoWins) == oneWins){
            jTextArea1.append("YOU WIN!");
        } else
        {
            jTextArea1.append("PC WINS!");
        }
    }
    
    private int getHighest(int one, int two){
        if (one > two){
            return one;
        } else {
            return two;
        }
    }
    
    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jRadioButton6ActionPerformed
    {//GEN-HEADEREND:event_jRadioButton6ActionPerformed
        //not needed
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton3StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jRadioButton3StateChanged
    {//GEN-HEADEREND:event_jRadioButton3StateChanged
        updateButtons();
    }//GEN-LAST:event_jRadioButton3StateChanged

    private void jRadioButton1StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jRadioButton1StateChanged
    {//GEN-HEADEREND:event_jRadioButton1StateChanged
        updateButtons();
    }//GEN-LAST:event_jRadioButton1StateChanged

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jRadioButton2StateChanged
    {//GEN-HEADEREND:event_jRadioButton2StateChanged
        updateButtons();
    }//GEN-LAST:event_jRadioButton2StateChanged

    private void jRadioButton4StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jRadioButton4StateChanged
    {//GEN-HEADEREND:event_jRadioButton4StateChanged
        updateButtons();
    }//GEN-LAST:event_jRadioButton4StateChanged

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Window().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
