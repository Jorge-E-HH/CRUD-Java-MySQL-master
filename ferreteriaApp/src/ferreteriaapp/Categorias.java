
package ferreteriaapp;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mau
 */
public class Categorias extends JPanel {
    
    public Categorias() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ferreteria?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Categorias_1 c");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        nomcategoLabel = new javax.swing.JLabel();
        nomProduLabel = new javax.swing.JLabel();
        stockLabel = new javax.swing.JLabel();
        nomcategoField = new javax.swing.JTextField();
        nomProduField = new javax.swing.JTextField();
        stockField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        nomFerreLabel1 = new javax.swing.JLabel();
        nomFerreLabel2 = new javax.swing.JLabel();
        nomFerreLabel4 = new javax.swing.JLabel();

        FormListener formListener = new FormListener();

        setToolTipText("");
        setFocusable(false);
        setName(""); // NOI18N

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${IDcatego}"));
        columnBinding.setColumnName("IDcatego");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomcatego}"));
        columnBinding.setColumnName("Nomcatego");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomProdu}"));
        columnBinding.setColumnName("Nom Produ");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${stock}"));
        columnBinding.setColumnName("Stock");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);

        masterScrollPane.setViewportView(masterTable);

        nomcategoLabel.setText("Categoria:");

        nomProduLabel.setText("Nombre:");

        stockLabel.setText("Stock:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomcatego}"), nomcategoField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nomcategoField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nomProdu}"), nomProduField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), nomProduField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.stock}"), stockField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), stockField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        saveButton.setText("Guardar");
        saveButton.setActionCommand("Guardar");
        saveButton.addActionListener(formListener);

        refreshButton.setText("Actualizar");
        refreshButton.addActionListener(formListener);

        newButton.setText("Agregar");
        newButton.addActionListener(formListener);

        deleteButton.setText("Borrar");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), deleteButton, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        deleteButton.addActionListener(formListener);

        nomFerreLabel1.setFont(new java.awt.Font("Meiryo UI", 1, 18)); // NOI18N
        nomFerreLabel1.setText("Ferreteria Ilobasco");

        nomFerreLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ferreteriaapp/images/ferreterialogo_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(newButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomcategoLabel)
                                    .addComponent(nomProduLabel)
                                    .addComponent(stockLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomcategoField)
                                    .addComponent(nomProduField)
                                    .addComponent(stockField)))
                            .addComponent(masterScrollPane)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(nomFerreLabel2)
                        .addGap(0, 326, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nomFerreLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(nomFerreLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteButton, newButton, refreshButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nomFerreLabel2)
                .addGap(13, 13, 13)
                .addComponent(nomFerreLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomFerreLabel1)
                .addGap(27, 27, 27)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomcategoLabel)
                    .addComponent(nomcategoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomProduLabel)
                    .addComponent(nomProduField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockLabel)
                    .addComponent(stockField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(refreshButton)
                    .addComponent(deleteButton)
                    .addComponent(newButton))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                Categorias.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                Categorias.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == newButton) {
                Categorias.this.newButtonActionPerformed(evt);
            }
            else if (evt.getSource() == deleteButton) {
                Categorias.this.deleteButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<ferreteriaapp.Categorias_1> toRemove = new ArrayList<ferreteriaapp.Categorias_1>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            ferreteriaapp.Categorias_1 c = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(c);
            entityManager.remove(c);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        ferreteriaapp.Categorias_1 c = new ferreteriaapp.Categorias_1();
        entityManager.persist(c);
        list.add(c);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_newButtonActionPerformed
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<ferreteriaapp.Categorias_1> merged = new ArrayList<ferreteriaapp.Categorias_1>(list.size());
            for (ferreteriaapp.Categorias_1 c : list) {
                merged.add(entityManager.merge(c));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<ferreteriaapp.Categorias_1> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel nomFerreLabel1;
    private javax.swing.JLabel nomFerreLabel2;
    private javax.swing.JLabel nomFerreLabel4;
    private javax.swing.JTextField nomProduField;
    private javax.swing.JLabel nomProduLabel;
    private javax.swing.JTextField nomcategoField;
    private javax.swing.JLabel nomcategoLabel;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField stockField;
    private javax.swing.JLabel stockLabel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JFrame frame = new JFrame();
                frame.setContentPane(new Categorias());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
}
