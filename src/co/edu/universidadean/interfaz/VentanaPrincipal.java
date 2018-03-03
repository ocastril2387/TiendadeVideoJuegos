package co.edu.universidadean.interfaz;

import co.edu.universidadean.modelos.Categoria;
import co.edu.universidadean.modelos.Juego;
import co.edu.universidadean.modelos.Tienda;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Castrillón
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Tienda tiendaJuegos;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        setLayout(new FlowLayout());
        tiendaJuegos = new Tienda("Tienda Vídeo Juegos");

        // Creación de juegos:
        Juego fifa = new Juego("Fifa 17", 7.67, 30, "fifa.png", Categoria.DEPORTES);
        tiendaJuegos.agregarJuego(fifa);
        JuegoJPanel panelFifa17 = new JuegoJPanel(this);
        panelFifa17.actualizarPanel(fifa);
        panelFifa17.setPreferredSize(new Dimension(450, 250));

        Juego nexomon = new Juego("Nexomon", 5.5, 25, "nexomon.jpg", Categoria.RPG);
        tiendaJuegos.agregarJuego(nexomon);
        JuegoJPanel panelNexomon = new JuegoJPanel(this);
        panelNexomon.actualizarPanel(nexomon);
        panelNexomon.setPreferredSize(new Dimension(450, 250));

        Juego pinball = new Juego("Pinball", 3.8, 10, "pinball.jpg", Categoria.ARCADE);
        tiendaJuegos.agregarJuego(pinball);
        JuegoJPanel panelPinball = new JuegoJPanel(this);
        panelPinball.actualizarPanel(pinball);
        panelPinball.setPreferredSize(new Dimension(450, 250));

        Juego modernCombat = new Juego("Modern Strike", 4.3, 20, "modern_strike.png", Categoria.FPS);
        tiendaJuegos.agregarJuego(modernCombat);
        JuegoJPanel panelModernCombat = new JuegoJPanel(this);
        panelModernCombat.setPreferredSize(new Dimension(450, 250));
        panelModernCombat.actualizarPanel(modernCombat);

        add(panelFifa17);
        add(panelNexomon);
        add(panelPinball);
        add(panelModernCombat);
        
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        lblHeader = new javax.swing.JLabel();
        jmbPrincipal = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();
        mnuOperaciones = new javax.swing.JMenu();
        mniMasVendido = new javax.swing.JMenuItem();
        mniTotalVendidos = new javax.swing.JMenuItem();
        mniVentasTotales = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(930, 710));

        lblHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datos/fondo-tienda-juegos.png"))); // NOI18N
        lblHeader.setPreferredSize(new java.awt.Dimension(897, 120));

        mnuArchivo.setText("Archivo");

        mniSalir.setLabel("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mniSalir);

        jmbPrincipal.add(mnuArchivo);

        mnuOperaciones.setText("Operaciones");

        mniMasVendido.setText("Más Vendido");
        mniMasVendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMasVendidoActionPerformed(evt);
            }
        });
        mnuOperaciones.add(mniMasVendido);

        mniTotalVendidos.setText("Total Vendidos");
        mniTotalVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTotalVendidosActionPerformed(evt);
            }
        });
        mnuOperaciones.add(mniTotalVendidos);

        mniVentasTotales.setText("Ventas Totales");
        mniVentasTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVentasTotalesActionPerformed(evt);
            }
        });
        mnuOperaciones.add(mniVentasTotales);

        jmbPrincipal.add(mnuOperaciones);

        setJMenuBar(jmbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 638, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniMasVendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMasVendidoActionPerformed
        Juego juegoMasVendido = tiendaJuegos.obtenerJuegoMasVendido();

        if (juegoMasVendido != null) {
            if (juegoMasVendido.getCantidadVendida() != 0) {
                JOptionPane.showMessageDialog(this, String.format("El juego más vendido es: %s", juegoMasVendido.getNombre()), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se han vendido juegos aún.", "Mensaje", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay juegos en la tienda.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mniMasVendidoActionPerformed

    private void mniTotalVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTotalVendidosActionPerformed
        int totalVendidos = tiendaJuegos.calcularCantidadJuegosVendidos();

        if (totalVendidos != 0) {
            JOptionPane.showMessageDialog(this, String.format("Cantidad total de juegos vendidos: %d", totalVendidos), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se han vendido juegos aún.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mniTotalVendidosActionPerformed

    private void mniVentasTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVentasTotalesActionPerformed
        double ventasTotales = tiendaJuegos.calcularMontoJuegosVendidos();

        if (ventasTotales != 0) {
            JOptionPane.showMessageDialog(this, String.format("Total ventas generales: $%.2f", ventasTotales), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se han vendido juegos aún.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mniVentasTotalesActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar jmbPrincipal;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JMenuItem mniMasVendido;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniTotalVendidos;
    private javax.swing.JMenuItem mniVentasTotales;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuOperaciones;
    // End of variables declaration//GEN-END:variables

    boolean venderJuego(Juego juego) {
        return tiendaJuegos.vender(juego);
    }
}
