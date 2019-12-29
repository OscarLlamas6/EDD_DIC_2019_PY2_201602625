
package EDDLearning;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TablaRechazados extends javax.swing.JDialog {

    String header[]={"Nombre","Carnet","Password","Motivo"};
    String datos[][] = {};
    DefaultTableModel modelo = new DefaultTableModel(datos, header){
         public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
        };
    UsuarioRechazado [] usuarios;
    int x;
   
    public TablaRechazados(java.awt.Frame parent, boolean modal, UsuarioRechazado[] usuarios, int x) {
        super(parent, modal);
        this.usuarios = usuarios;
        this.x = x;
        initComponents();
        tablausuarios.setModel(modelo);
        AgregarUsuarios(usuarios, x);
        this.setTitle("EDD Learning | USUARIOS RECHAZADOS - By Oscar Llamas");
        this.setLocationRelativeTo(null);
        
    }
    
    private void AgregarUsuarios(UsuarioRechazado[] usuarios, int size){
              
      for(int i = 0; i<size; i++){
            if(usuarios[i]!=null){
            String nombre = usuarios[i].getNombre();
            String carnet = usuarios[i].getCarnet();
            String pass = usuarios[i].getPass();
            String motivo = usuarios[i].getMotivo();
            String fila[] = {nombre, carnet, pass, motivo};
            modelo.addRow(fila);
            }
        }
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrolltabla = new javax.swing.JScrollPane();
        tablausuarios = new javax.swing.JTable();
        lloadusers = new javax.swing.JLabel();
        lfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablausuarios.setBackground(new java.awt.Color(255, 255, 255));
        tablausuarios.setForeground(new java.awt.Color(0, 0, 0));
        tablausuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        scrolltabla.setViewportView(tablausuarios);

        getContentPane().add(scrolltabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 590, 290));

        lloadusers.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lloadusers.setForeground(new java.awt.Color(255, 255, 255));
        lloadusers.setText("USUARIOS RECHAZADOS");
        getContentPane().add(lloadusers, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        lfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jdialog-wallpaper.jpg"))); // NOI18N
        getContentPane().add(lfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lfondo;
    private javax.swing.JLabel lloadusers;
    private javax.swing.JScrollPane scrolltabla;
    private javax.swing.JTable tablausuarios;
    // End of variables declaration//GEN-END:variables
}
