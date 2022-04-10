package locationapp.view;

import java.awt.event.WindowEvent;
import java.util.Locale;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;
import javax.swing.JOptionPane;

public class ReservationView extends javax.swing.JFrame {

    public ReservationView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryFrame = new javax.swing.JFrame();
        nomTf2 = new javax.swing.JTextField();
        prenomTf2 = new javax.swing.JTextField();
        matTf = new javax.swing.JTextField();
        VoitTf = new javax.swing.JTextField();
        prixTf = new javax.swing.JTextField();
        kiloTf = new javax.swing.JTextField();
        montTf = new javax.swing.JTextField();
        okBut = new javax.swing.JButton();
        idcCom = new javax.swing.JComboBox<>();
        idvCom = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        ddPk = new org.jdesktop.swingx.JXDatePicker(new Locale("en"));
        dfPk = new org.jdesktop.swingx.JXDatePicker(new Locale("en"));
        hdSp = new javax.swing.JSpinner();
        hfSp = new javax.swing.JSpinner();
        mdSp = new javax.swing.JSpinner();
        mfSp = new javax.swing.JSpinner();
        wkndCh = new javax.swing.JCheckBox();
        EtatFrame = new javax.swing.JFrame();
        etatCom = new javax.swing.JComboBox<>();
        raTf = new javax.swing.JTextField();
        ok3But = new javax.swing.JButton();
        an3But = new javax.swing.JButton();
        idTf = new javax.swing.JTextField();
        nomTf = new javax.swing.JTextField();
        prenomTf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        rechBut = new javax.swing.JButton();
        ajBut = new javax.swing.JButton();
        modBut = new javax.swing.JButton();
        retBut = new javax.swing.JButton();
        chBut = new javax.swing.JButton();

        entryFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        entryFrame.setResizable(false);
        entryFrame.setSize(new java.awt.Dimension(700, 400));
        entryFrame.setLocationRelativeTo(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Client :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Prenom :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Prix du Kilomètre :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Nom :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ID :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("ID :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Voiture :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Voiture :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Matricule : ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("De");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("à");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("à");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Jusqu'au ");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Kilometrage forfaitair :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("DT");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Montant Total :");

        nomTf2.setEditable(false);

        prenomTf2.setEditable(false);

        matTf.setEditable(false);

        VoitTf.setEditable(false);

        prixTf.setEditable(false);

        kiloTf.setEditable(false);
        kiloTf.setText("0");

        montTf.setEditable(false);
        montTf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        montTf.setText("100,000");

        okBut.setText("Confirmer");

        anBut.setText("Annuler");
        anBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anButActionPerformed(evt);
            }
        });

        idcCom.setEditable(true);
        idcCom.setMaximumRowCount(10000);
        idcCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        idvCom.setEditable(true);
        idvCom.setMaximumRowCount(10000);
        idvCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        hdSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        hfSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        mdSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        mfSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        wkndCh.setText("Option Weekend");

        javax.swing.GroupLayout entryFrameLayout = new javax.swing.GroupLayout(entryFrame.getContentPane());
        entryFrame.getContentPane().setLayout(entryFrameLayout);
        entryFrameLayout.setHorizontalGroup(
            entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(entryFrameLayout.createSequentialGroup()
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kiloTf, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idcCom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entryFrameLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idvCom, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(prixTf, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(matTf)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prenomTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(VoitTf, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(entryFrameLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ddPk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hdSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mdSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dfPk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(hfSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(mfSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(wkndCh))
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(montTf, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(anBut, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(okBut))
                                    .addComponent(jLabel20))))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        entryFrameLayout.setVerticalGroup(
            entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryFrameLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(idcCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(nomTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(prenomTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(idvCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(matTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(VoitTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(prixTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wkndCh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddPk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(hdSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(dfPk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(hfSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(mdSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mfSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(kiloTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(montTf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(31, 31, 31)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBut)
                    .addComponent(anBut))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        EtatFrame.setSize(new java.awt.Dimension(350, 200));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Etat :");

        etatCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Cours", "Annulée", "Terminée" }));
        etatCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etatComActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Raison d'annulation :");

        ok3But.setText("Confirmer");

        an3But.setText("Annuler");
        an3But.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                an3ButActionPerformed(evt);
            }
        });

        EtatFrame.setLocationRelativeTo(null);

        javax.swing.GroupLayout EtatFrameLayout = new javax.swing.GroupLayout(EtatFrame.getContentPane());
        EtatFrame.getContentPane().setLayout(EtatFrameLayout);
        EtatFrameLayout.setHorizontalGroup(
            EtatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EtatFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EtatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EtatFrameLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(etatCom, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EtatFrameLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(raTf, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EtatFrameLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(an3But)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok3But)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        EtatFrameLayout.setVerticalGroup(
            EtatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EtatFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EtatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(etatCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(EtatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(raTf, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(26, 26, 26)
                .addGroup(EtatFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok3But)
                    .addComponent(an3But))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestion des Reservation");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Rechercher une reservation :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nom du Client :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Prénom du Client :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID RES :");

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
        tab.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tab);

        rechBut.setText("Rechercher");

        ajBut.setText("Enregistrer une reservation");

        modBut.setText("Modifier une reservation");

        retBut.setText("Retour");
        retBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retButActionPerformed(evt);
            }
        });

        chBut.setText("Changer l'etat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prenomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(rechBut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(retBut)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(ajBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chBut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(prenomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rechBut)
                    .addComponent(jLabel5)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ajBut)
                            .addComponent(modBut)
                            .addComponent(chBut))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(retBut)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anButActionPerformed
        entryFrame.dispatchEvent(new WindowEvent(entryFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_anButActionPerformed

    private void retButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retButActionPerformed
        entryFrame.dispatchEvent(new WindowEvent(entryFrame, WindowEvent.WINDOW_CLOSING));
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_retButActionPerformed

    private void an3ButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_an3ButActionPerformed
        EtatFrame.dispatchEvent(new WindowEvent(EtatFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_an3ButActionPerformed

    private void etatComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etatComActionPerformed
        if("Annulée".equals(etatCom.getSelectedItem().toString()))
            raTf.setEnabled(true);
        else raTf.setEnabled(false);
    }//GEN-LAST:event_etatComActionPerformed

    public void RechercheListener(java.awt.event.ActionListener lis ){
        rechBut.addActionListener(lis);
    }
    
    public void AjouterListener(java.awt.event.ActionListener lis ){
        ajBut.addActionListener(lis);
    }
    
    public void ModifierListener(java.awt.event.ActionListener lis ){
        modBut.addActionListener(lis);
    }
    
    public void OkButListener(java.awt.event.ActionListener lis ){
        okBut.addActionListener(lis);
    }
    
    public void chButListener(java.awt.event.ActionListener lis ){
        chBut.addActionListener(lis);
    }
    
    public void Ok3ButListener(java.awt.event.ActionListener lis ){
        ok3But.addActionListener(lis);
    }
    
    public void wkndChListener(java.awt.event.ActionListener lis ){
        wkndCh.addActionListener(lis);
    }
    
    public void idcComchanged(java.awt.event.ActionListener lis){
        idcCom.addActionListener(lis);
    }
    
    public void idvComchanged(java.awt.event.ActionListener lis){
        idvCom.addActionListener(lis);
    }
    
    public String getDd(){
        if(ddPk.getDate()!=null){
            String d =this.ddPk.getDate().toString();
            return d.substring(0, 11)+d.substring(24, 28);
        }
        else return "";
    }
    
    public String getDf(){
        if(dfPk.getDate()!=null){
            String d =this.dfPk.getDate().toString();
            return d.substring(0, 11)+d.substring(24, 28);
        }
        else return "";
    }

    public JComboBox<String> getEtatCom() {
        return etatCom;
    }

    public JTextField getRaTf() {
        return raTf;
    }

    public JFrame getEtatFrame() {
        return EtatFrame;
    }
    
    public String getHdSpV() {
        String s = hdSp.getValue().toString();
        String c = mdSp.getValue().toString();
        if(s.length()==1)s="0"+s;
        if(c.length()==1)c="0"+c;
        return s+":"+c;
    }

    public String getHfSpV() {
        String s = hfSp.getValue().toString();
        String c = mfSp.getValue().toString();
        if(s.length()==1)s="0"+s;
        if(c.length()==1)c="0"+c;
        return s+":"+c;
    }
    
    public boolean getWkndChState() {
        return wkndCh.isSelected();
    }
    
    public int getId() {
        if(!idTf.getText().equals(""))return Integer.valueOf(idTf.getText());
        else return 0;
    }

    public double getPrixTfV() {
        return Double.valueOf(prixTf.getText());
    }

    public JTextField getPrixTf() {
        return prixTf;
    }
    
    public Long getKiloTfV() {
        return Long.parseLong(kiloTf.getText());
    }
    
    public JTextField getKiloTf() {
        return kiloTf;
    }

    public JXDatePicker getDdPk() {
        return ddPk;
    }

    public JXDatePicker getDfPk() {
        return dfPk;
    }
    
    public String getNom() {
        return nomTf.getText();
    }

    public String getPrenom() {
        return prenomTf.getText();
    }

    public int getIdcComV() {
        return Integer.valueOf(idcCom.getSelectedItem().toString());
    }

    public int getIdvComV() {
        return Integer.valueOf(idvCom.getSelectedItem().toString());
    }

    public JComboBox<String> getIdcCom() {
        return idcCom;
    }

    public JComboBox<String> getIdvCom() {
        return idvCom;
    }

    public String getMdSpV() {
        return mdSp.getValue().toString();
    }

    public String getMfSpV() {
        return mfSp.getValue().toString();
    }

    public JSpinner getHdSp() {
        return hdSp;
    }

    public JSpinner getHfSp() {
        return hfSp;
    }

    public JSpinner getMdSp() {
        return mdSp;
    }

    public JSpinner getMfSp() {
        return mfSp;
    }
    
    public JFrame getEntryFrame() {
        return entryFrame;
    }

    public JTable getTab() {
        return tab;
    }

    public void setHdSp(int hdSp) {
        this.hdSp.setValue(hdSp);
    }

    public void setHfSp(int hfSp) {
        this.hfSp.setValue(hfSp);
    }

    public void setMdSp(int mdSp) {
        this.mdSp.setValue(mdSp);
    }

    public void setMfSp(int mfSp) {
        this.mfSp.setValue(mfSp);
    }
    
    public void setOkButName(String name){
        okBut.setText(name);
    }
    
    public void setTab(DefaultTableModel m) {
        this.tab.setModel(m);
    }

    public void setIdcCom(Vector<Integer> v) {
        for(int i = 0 ; i < v.size(); i++)this.idcCom.addItem(v.get(i).toString());
    }

    public void setIdvCom(Vector<Integer> v) {
        for(int i = 0 ; i < v.size(); i++)this.idvCom.addItem(v.get(i).toString());
    }
    
    public void setNomTf2(String nomTf2) {
        this.nomTf2.setText(nomTf2);
    }

    public void setVoitTf(String VoitTf) {
        this.VoitTf.setText(VoitTf);
    }

    public void setKiloTf(String kiloTf) {
        this.kiloTf.setText(kiloTf);
    }

    public void setMatTf(String matTf) {
        this.matTf.setText(matTf);
    }

    public void setMont_Tf(String mont_Tf) {
        this.montTf.setText(mont_Tf);
    }

    public void setPrixTf(String prixTf) {
        this.prixTf.setText(prixTf);
    }

    public void setPrenomTf2(String prenomTf2) {
        this.prenomTf2.setText(prenomTf2);
    }
    
    public void verPopUp(){
        popup=new javax.swing.JOptionPane();
        popup.showMessageDialog(entryFrame, "Vérifier les entrées", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
    
    public void selPopUp(){
        popup=new javax.swing.JOptionPane();
        popup.showMessageDialog(this, "selectionner un client !", "Erreur", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame EtatFrame;
    private javax.swing.JTextField VoitTf;
    private javax.swing.JButton ajBut;
    private javax.swing.JButton an3But;
    private final javax.swing.JButton anBut = new javax.swing.JButton();
    private javax.swing.JButton chBut;
    private org.jdesktop.swingx.JXDatePicker ddPk;
    private org.jdesktop.swingx.JXDatePicker dfPk;
    private javax.swing.JFrame entryFrame;
    private javax.swing.JComboBox<String> etatCom;
    private javax.swing.JSpinner hdSp;
    private javax.swing.JSpinner hfSp;
    private javax.swing.JTextField idTf;
    private javax.swing.JComboBox<String> idcCom;
    private javax.swing.JComboBox<String> idvCom;
    private final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel14 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel16 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel18 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel19 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel21 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField kiloTf;
    private javax.swing.JTextField matTf;
    private javax.swing.JSpinner mdSp;
    private javax.swing.JSpinner mfSp;
    private javax.swing.JButton modBut;
    private javax.swing.JTextField montTf;
    private javax.swing.JTextField nomTf;
    private javax.swing.JTextField nomTf2;
    private javax.swing.JButton ok3But;
    private javax.swing.JButton okBut;
    private javax.swing.JTextField prenomTf;
    private javax.swing.JTextField prenomTf2;
    private javax.swing.JTextField prixTf;
    private javax.swing.JTextField raTf;
    private javax.swing.JButton rechBut;
    private javax.swing.JButton retBut;
    private javax.swing.JTable tab;
    private javax.swing.JCheckBox wkndCh;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JOptionPane popup;
}