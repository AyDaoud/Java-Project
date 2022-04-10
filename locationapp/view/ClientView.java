package locationapp.view;

import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClientView extends javax.swing.JFrame {

    public ClientView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryFrame = new javax.swing.JFrame();
        Titre = new javax.swing.JLabel();
        prenomTf2 = new javax.swing.JTextField();
        nomTf2 = new javax.swing.JTextField();
        adrTf = new javax.swing.JTextField();
        nperTf = new javax.swing.JTextField();
        okBut = new javax.swing.JButton();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        nomTf = new javax.swing.JTextField();
        prenomTf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rechBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        ajBut = new javax.swing.JButton();
        supBut = new javax.swing.JButton();
        modBut = new javax.swing.JButton();
        retBut = new javax.swing.JButton();

        entryFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        entryFrame.setPreferredSize(new java.awt.Dimension(260, 300));
        entryFrame.setSize(new java.awt.Dimension(260, 300));

        Titre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nom :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Prenom :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Adresse :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("N° Permis :");

        okBut.setText("Ajouter");

        anBut.setText("Annuler");
        anBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout entryFrameLayout = new javax.swing.GroupLayout(entryFrame.getContentPane());
        entryFrame.getContentPane().setLayout(entryFrameLayout);
        entryFrameLayout.setHorizontalGroup(
            entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryFrameLayout.createSequentialGroup()
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Titre))
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(22, 22, 22)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenomTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adrTf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nperTf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(anBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okBut)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        entryFrameLayout.setVerticalGroup(
            entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryFrameLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Titre)
                .addGap(27, 27, 27)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomTf2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, entryFrameLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(prenomTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(adrTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nperTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBut)
                    .addComponent(anBut))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPopupMenu1.setPopupSize(new java.awt.Dimension(100, 100));
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestion des Clients");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Rechercher un client :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nom :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Prénom :");

        rechBut.setText("Rechercher");

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tab);

        ajBut.setText("Ajouter un client");

        supBut.setText("Supprimer un client");

        modBut.setText("Modifier un client");

        retBut.setText("Retour");
        retBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prenomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(rechBut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 62, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(retBut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(ajBut, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modBut, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supBut, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(prenomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rechBut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ajBut)
                            .addComponent(modBut)
                            .addComponent(supBut))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(retBut)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retButActionPerformed
        entryFrame.dispatchEvent(new WindowEvent(entryFrame, WindowEvent.WINDOW_CLOSING));
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_retButActionPerformed

    private void anButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anButActionPerformed
        entryFrame.dispatchEvent(new WindowEvent(entryFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_anButActionPerformed

    public void RechercheListener(java.awt.event.ActionListener lis ){
        rechBut.addActionListener(lis);
    }
    
    public void AjouterListener(java.awt.event.ActionListener lis ){
        ajBut.addActionListener(lis);
    }
    
    public void ModifierListener(java.awt.event.ActionListener lis ){
        modBut.addActionListener(lis);
    }
    
    public void SupprumerListener(java.awt.event.ActionListener lis ){
        supBut.addActionListener(lis);
    }
    
    public void OkButListener(java.awt.event.ActionListener lis ){
        okBut.addActionListener(lis);
    }

    public void setTitre(String Titre) {
        this.Titre.setText(Titre);
    }

    public String getAdrTf() {
        return adrTf.getText();
    }

    public String getNomTf2() {
        return nomTf2.getText();
    }

    public String getNperTf() {
        return nperTf.getText();
    }

    public String getPrenomTf2() {
        return prenomTf2.getText();
    }

    public void setAdrTf(String adrTf) {
        this.adrTf.setText(adrTf);
    }

    public void setNomTf2(String nomTf2) {
        this.nomTf2.setText(nomTf2);
    }

    public void setNperTf(String nperTf) {
        this.nperTf.setText(nperTf);
    }

    public void setPrenomTf2(String prenomTf2) {
        this.prenomTf2.setText(prenomTf2);
    }
    
    public String getNom() {
        return nomTf.getText();
    }

    public String getPrenom() {
        return prenomTf.getText();
    }

    public void setTab(DefaultTableModel m) {
        this.tab.setModel(m);
    }

    public JFrame getEntryFrame() {
        return entryFrame;
    }

    public JTable getTab() {
        return tab;
    }
    
    public void setOkButName(String name){
        okBut.setText(name);
    }
    
    public void verPopUp(){
        popup=new javax.swing.JOptionPane();
        popup.showMessageDialog(entryFrame, "Vérifier les entrées", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    public void selPopUp(){
        popup=new javax.swing.JOptionPane();
        popup.showMessageDialog(this, "selectionner un client !", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    public void supPopUp(){
        popup=new javax.swing.JOptionPane();
        popup.showMessageDialog(this, "On ne peut pas effacer ce client car il a au"
                + " moins une reservation ou une location","Erreur", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titre;
    private javax.swing.JTextField adrTf;
    private javax.swing.JButton ajBut;
    private final javax.swing.JButton anBut = new javax.swing.JButton();
    private javax.swing.JFrame entryFrame;
    private final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton modBut;
    private javax.swing.JTextField nomTf;
    private javax.swing.JTextField nomTf2;
    private javax.swing.JTextField nperTf;
    private javax.swing.JButton okBut;
    private javax.swing.JTextField prenomTf;
    private javax.swing.JTextField prenomTf2;
    private javax.swing.JButton rechBut;
    private javax.swing.JButton retBut;
    private javax.swing.JButton supBut;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JOptionPane popup;
}