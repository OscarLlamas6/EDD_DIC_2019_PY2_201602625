
package EDDLearning;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ReporteTablaHash extends javax.swing.JDialog {

   
    public ReporteTablaHash(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();;
        this.validate();
        this.setTitle("EDD Learning | REPORTE USUARIO - By Oscar Llamas");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollimagen = new javax.swing.JScrollPane();
        label_reporte = new javax.swing.JLabel();
        lloadusers = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImageIcon i = new ImageIcon("src/Images/HashTableReport.png");
        i.getImage().flush();
        label_reporte.setIcon(i);
        scrollimagen.setViewportView(label_reporte);
        this.revalidate();
        this.validate();
        this.repaint();

        getContentPane().add(scrollimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 620, 310));

        lloadusers.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lloadusers.setForeground(new java.awt.Color(255, 255, 255));
        lloadusers.setText("REPORTE USUARIOS");
        getContentPane().add(lloadusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jdialog-wallpaper.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    public javax.swing.JLabel label_reporte;
    private javax.swing.JLabel lloadusers;
    public javax.swing.JScrollPane scrollimagen;
    // End of variables declaration//GEN-END:variables
}
