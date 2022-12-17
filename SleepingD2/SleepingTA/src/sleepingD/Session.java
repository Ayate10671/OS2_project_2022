/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingD;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmo
 */
public class Session extends javax.swing.JFrame {

    /**
     * Creates new form Session
     */
    
    private boolean[] Busy, waiting;
    private final int MaxSleep = 5;
    private final int MaxBusy = 5;
    private final int Waiting = 6;
    private static int noOfDs, noOfPatients, noOfChairs;
    
    public Session(int noOfDs, int noOfPatient, int noOfChairs) {
        initComponents();
        this.noOfDs = noOfDs;
        this.noOfPatients = noOfPatients;
        this.noOfChairs = noOfChairs;
        Busy = new boolean[this.noOfDs];
        waiting = new boolean[this.noOfChairs];
        
        for (int i = this.noOfDs; i < (MaxSleep + MaxBusy); i++) {
            DPanel.getComponent(i).setVisible(false);
        }
        
        for (int i = 0; i < Waiting; i++) {
            WaitPanel.getComponent(i).setVisible(false);
        }
        
        
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DText = new javax.swing.JLabel();
        WaitingText = new javax.swing.JLabel();
        DPanel = new javax.swing.JPanel();
        sleepD1 = new javax.swing.JLabel();
        sleepD2 = new javax.swing.JLabel();
        sleepD3 = new javax.swing.JLabel();
        sleepD4 = new javax.swing.JLabel();
        sleepD5 = new javax.swing.JLabel();
        Busy1 = new javax.swing.JLabel();
        Busy2 = new javax.swing.JLabel();
        Busy3 = new javax.swing.JLabel();
        Busy4 = new javax.swing.JLabel();
        Busy5 = new javax.swing.JLabel();
        WaitPanel = new javax.swing.JPanel();
        waiting1 = new javax.swing.JLabel();
        waiting2 = new javax.swing.JLabel();
        waiting3 = new javax.swing.JLabel();
        waiting4 = new javax.swing.JLabel();
        waiting5 = new javax.swing.JLabel();
        waiting6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        DText.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        DText.setForeground(new java.awt.Color(255, 0, 0));
        DText.setText("All Ds are sleeping");
        getContentPane().add(DText);
        DText.setBounds(170, 200, 490, 80);

        WaitingText.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        WaitingText.setForeground(new java.awt.Color(255, 0, 0));
        WaitingText.setText("waiting chairs are available");
        getContentPane().add(WaitingText);
        WaitingText.setBounds(160, 420, 370, 50);

        DPanel.setLayout(null);

        sleepD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepD1.setText("jLabel5");
        DPanel.add(sleepD1);
        sleepD1.setBounds(0, 0, 170, 150);

        sleepD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepD2.setText("jLabel5");
        DPanel.add(sleepD2);
        sleepD2.setBounds(170, 0, 170, 150);

        sleepD3.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepD3.setText("jLabel5");
        DPanel.add(sleepD3);
        sleepD3.setBounds(340, 0, 170, 150);

        sleepD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepD4.setText("jLabel5");
        DPanel.add(sleepD4);
        sleepD4.setBounds(510, 0, 170, 150);

        sleepD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("sleep.jpg"))); // NOI18N
        sleepD5.setText("jLabel5");
        DPanel.add(sleepD5);
        sleepD5.setBounds(680, 0, 170, 150);

        Busy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Ask.jpg"))); // NOI18N
        Busy1.setText("jLabel2");
        DPanel.add(Busy1);
        Busy1.setBounds(0, 0, 170, 150);

        Busy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Ask.jpg"))); // NOI18N
        Busy2.setText("jLabel2");
        DPanel.add(Busy2);
        Busy2.setBounds(170, 0, 170, 150);

        Busy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Ask.jpg"))); // NOI18N
        Busy3.setText("jLabel2");
        DPanel.add(Busy3);
        Busy3.setBounds(340, 0, 170, 150);

        Busy4.setIcon(new javax.swing.ImageIcon(getClass().getResource("Ask.jpg"))); // NOI18N
        Busy4.setText("jLabel2");
        DPanel.add(Busy4);
        Busy4.setBounds(510, 0, 170, 150);

        Busy5.setIcon(new javax.swing.ImageIcon(getClass().getResource("Ask.jpg"))); // NOI18N
        Busy5.setText("jLabel2");
        DPanel.add(Busy5);
        Busy5.setBounds(680, 0, 170, 150);

        getContentPane().add(DPanel);
        DPanel.setBounds(10, 30, 850, 150);

        WaitPanel.setLayout(null);

        waiting1.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting1.setText("jLabel2");
        WaitPanel.add(waiting1);
        waiting1.setBounds(0, 0, 140, 110);

        waiting2.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting2.setText("jLabel2");
        WaitPanel.add(waiting2);
        waiting2.setBounds(140, 0, 140, 110);

        waiting3.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting3.setText("jLabel2");
        WaitPanel.add(waiting3);
        waiting3.setBounds(280, 0, 140, 110);

        waiting4.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting4.setText("jLabel2");
        WaitPanel.add(waiting4);
        waiting4.setBounds(420, 0, 140, 110);

        waiting5.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting5.setText("jLabel2");
        WaitPanel.add(waiting5);
        waiting5.setBounds(560, 0, 140, 110);

        waiting6.setIcon(new javax.swing.ImageIcon(getClass().getResource("wait.jpg"))); // NOI18N
        waiting6.setText("jLabel2");
        WaitPanel.add(waiting6);
        waiting6.setBounds(700, 0, 140, 110);

        getContentPane().add(WaitPanel);
        WaitPanel.setBounds(10, 290, 840, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("Back.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-9, 0, 980, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
//       Session form = new Session(noOfTAs, noOfStudents, noOfChairs);
//       SleepingTA s = new SleepingTA(noOfStudents, noOfChairs, noOfTAs);
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
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Session.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new Session(noOfTAs, noOfStudents, noOfChairs).setVisible(true);
//                
//        }    
//        });
        
        
        
        
    }
    
    public void BusyD(int D_ID){
        try {
           
            Thread.sleep(500);
            Busy[D_ID - 1] = true;
            DPanel.getComponent( D_ID - 1 ).setVisible(false);
            DPanel.getComponent( D_ID + MaxSleep - 1 ).setVisible(true);
            int c = getBusyD();
            if (c == noOfDs) {
                DText.setText("All Ds are Busy");
            }
            else if (c == 0){
                DText.setText("All Ds are available");
            }
            else{
                DText.setText(c + " Ds are Busy, " +(noOfDs - c)
                        +" Ds are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void SleepD(int D_ID){
        
        try {
            Thread.sleep(500);
            Busy[D_ID - 1] = false;
            DPanel.getComponent( D_ID - 1 ).setVisible(true);
            DPanel.getComponent( D_ID + MaxSleep - 1 ).setVisible(false);
            int c = getBusyD();
            if (c == noOfDs) {
                DText.setText("All Ds are Busy");
            }
            else if (c == 0){
                DText.setText("All Ds are available");
            }
            else{
                DText.setText(c + " Ds are Busy, " +(noOfDs - c)
                        +" Ds are avaliable");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Session.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void TakeChair() throws InterruptedException{
        
        for (int i = 0; i < noOfChairs; i++) {
            if (!waiting[i]) {
                waiting[i] = true;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(true);
                int c = getWaitingChairs();
                if (c == noOfChairs) {
                WaitingText.setText("There is no Chair available");
            }
            else if(c == 0){
                WaitingText.setText("All Chairs are available");
            }
            else{
                WaitingText.setText(c + " Chairs are Taken, " +(noOfChairs - c)
                        +" Chairs are available");
            }
            }
        }
    }
    
    public void ReturnChair(int D_ID) throws InterruptedException{
        
        for (int i = 0; i < noOfChairs; i++) {
            if (waiting[i]) {
                waiting[i] = false;
                Thread.sleep(500);
                WaitPanel.getComponent(i).setVisible(false);
                int c = getWaitingChairs();
                if (c == noOfChairs) {
                WaitingText.setText("There is no Chair available");
            }
            else if(c == 0){
                WaitingText.setText("All Chairs are available");
            }
            else{
                WaitingText.setText(c + " Chairs are Taken, " +(noOfChairs - c)
                        +" Chairs are available");
            }
            }
        }
    }
    
    
    public int getBusyD(){
        int c = 0;
        for (int i = 0; i < noOfDs; i++) {
            if (Busy[i]) {
                c++;
            }
            
        }
        return c;
    }
    
    public int getWaitingChairs(){
        int c = 0;
        for (int i = 0; i < noOfChairs; i++) {
            if (waiting[i]) {
                c++;
            }
           
        }
        return c;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Busy1;
    private javax.swing.JLabel Busy2;
    private javax.swing.JLabel Busy3;
    private javax.swing.JLabel Busy4;
    private javax.swing.JLabel Busy5;
    private javax.swing.JPanel DPanel;
    private javax.swing.JLabel DText;
    private javax.swing.JPanel WaitPanel;
    private javax.swing.JLabel WaitingText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel sleepD1;
    private javax.swing.JLabel sleepD2;
    private javax.swing.JLabel sleepD3;
    private javax.swing.JLabel sleepD4;
    private javax.swing.JLabel sleepD5;
    private javax.swing.JLabel waiting1;
    private javax.swing.JLabel waiting2;
    private javax.swing.JLabel waiting3;
    private javax.swing.JLabel waiting4;
    private javax.swing.JLabel waiting5;
    private javax.swing.JLabel waiting6;
    // End of variables declaration//GEN-END:variables

    void Sleep(int D_ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Busy(int D_ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private class Object {
        public void setLayout(java.lang.Object object) {
        }

        public void add(javax.swing.JLabel busy4) {
        }

        private void add(Object DPanel) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setBounds(int i, int i0, int i1, int i2) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void add(javax.swing.JPanel WaitPanel) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private class JPanel extends Object {
    }
}
