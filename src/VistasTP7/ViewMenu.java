/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasTP7;

import TP7.Alumno;
import TP7.Materia;
import java.util.HashSet;



/**
 *
 * @author Chony
 */
public class ViewMenu extends javax.swing.JFrame {
    private HashSet<Alumno> listaAlumnos=new HashSet<>();
    private HashSet<Materia> listaMaterias=new HashSet<>();
    /**
     * Creates new form ViewMenu
     */
    public ViewMenu() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiAgregarMateria = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiAltadeAlumno = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiInscripcion = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Materias");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jmiAgregarMateria.setText("Agregar Materia");
        jmiAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarMateriaActionPerformed(evt);
            }
        });
        jMenu1.add(jmiAgregarMateria);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Alumnos");

        jmiAltadeAlumno.setText("Alta de Alumno");
        jmiAltadeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltadeAlumnoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAltadeAlumno);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Registro");

        jmiInscripcion.setText("Inscripción ");
        jmiInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInscripcionActionPerformed(evt);
            }
        });
        jMenu3.add(jmiInscripcion);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Salida");

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenu4.add(jmiSalir);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        
        ViewAltaDeMaterias vam=new ViewAltaDeMaterias(listaMaterias);
        escritorio.add(vam);
        vam.setVisible(true);
        escritorio.moveToFront(vam);
        
    }//GEN-LAST:event_jmiAgregarMateriaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jmiAltadeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltadeAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        
        ViewAltaDeAlumno vaa=new ViewAltaDeAlumno(listaAlumnos);
        escritorio.add(vaa);
        vaa.setVisible(true);
        escritorio.moveToFront(vaa);
    }//GEN-LAST:event_jmiAltadeAlumnoActionPerformed

    private void jmiInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInscripcionActionPerformed
       escritorio.removeAll();
        escritorio.repaint();
        
        ViewFormularioDeInscripcion vfi=new ViewFormularioDeInscripcion(listaAlumnos,listaMaterias);
        escritorio.add(vfi);
        vfi.setVisible(true);
        escritorio.moveToFront(vfi);
    }//GEN-LAST:event_jmiInscripcionActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmiAgregarMateria;
    private javax.swing.JMenuItem jmiAltadeAlumno;
    private javax.swing.JMenuItem jmiInscripcion;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
