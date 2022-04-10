package locationapp.view;

import java.awt.event.WindowEvent;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;
import javax.swing.JOptionPane;

public class VoitureView extends javax.swing.JFrame {

    public VoitureView() {
        initComponents();
        jFrame1.setLocationRelativeTo(null);
        jFrame2.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entryFrame = new javax.swing.JFrame();
        Titre = new javax.swing.JLabel();
        marTf2 = new javax.swing.JTextField();
        matTf2 = new javax.swing.JTextField();
        typeTf2 = new javax.swing.JTextField();
        puisTf2 = new javax.swing.JTextField();
        okBut = new javax.swing.JButton();
        prixTf2 = new javax.swing.JTextField();
        radioch2 = new javax.swing.JCheckBox();
        climCh2 = new javax.swing.JCheckBox();
        airCh2 = new javax.swing.JCheckBox();
        absCh2 = new javax.swing.JCheckBox();
        datePk2 = new org.jdesktop.swingx.JXDatePicker(new Locale("en"));
        clasCom2 = new javax.swing.JComboBox<>();
        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        anBut1 = new javax.swing.JButton();
        supBut1 = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        dd1 = new org.jdesktop.swingx.JXDatePicker();
        df1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        absCh3 = new javax.swing.JCheckBox();
        radioch3 = new javax.swing.JCheckBox();
        climCh3 = new javax.swing.JCheckBox();
        airCh3 = new javax.swing.JCheckBox();
        rchBut3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        matTf = new javax.swing.JTextField();
        marTf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rechBut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        ajBut = new javax.swing.JButton();
        verBut = new javax.swing.JButton();
        retBut = new javax.swing.JButton();
        typeTf = new javax.swing.JTextField();
        radioch = new javax.swing.JCheckBox();
        climCh = new javax.swing.JCheckBox();
        airCh = new javax.swing.JCheckBox();
        absCh = new javax.swing.JCheckBox();
        trouBut1 = new javax.swing.JButton();

        entryFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        entryFrame.setSize(new java.awt.Dimension(510, 300));

        Titre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Matricule :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Marque :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Type :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Puissance :");

        okBut.setText("Ajouter");

        anBut.setText("Annuler");
        anBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anButActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date d'achat :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Prix d'achat :");

        radioch2.setText("Radio");

        climCh2.setText("Climatiseur");

        airCh2.setText("Airbag");

        absCh2.setText("Abs");

        clasCom2.setMaximumRowCount(99);
        clasCom2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Classe :");

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
                        .addGap(22, 22, 22)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(22, 22, 22)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(marTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(typeTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)))
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(matTf2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)))
                                .addGap(22, 22, 22)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(puisTf2)
                                    .addComponent(prixTf2)
                                    .addComponent(datePk2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(anBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(okBut))
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(clasCom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioch2)
                                .addGap(27, 27, 27)
                                .addComponent(climCh2)
                                .addGap(18, 18, 18)
                                .addComponent(absCh2)
                                .addGap(18, 18, 18)
                                .addComponent(airCh2)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        entryFrameLayout.setVerticalGroup(
            entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryFrameLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Titre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(matTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(puisTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, entryFrameLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(datePk2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(prixTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(marTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(typeTf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioch2)
                    .addComponent(climCh2)
                    .addComponent(absCh2)
                    .addComponent(airCh2)
                    .addComponent(clasCom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBut)
                    .addComponent(anBut))
                .addGap(58, 58, 58))
        );

        jFrame1.setSize(new java.awt.Dimension(530, 350));

        tab1.setModel(new javax.swing.table.DefaultTableModel(
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
        tab1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(tab1);

        jLabel4.setText("Ces voitures ont un age supérieur ou egale à 2 ans :");

        anBut1.setText("Annuler");
        anBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anBut1ActionPerformed(evt);
            }
        });

        supBut1.setText("Supprimer");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel4))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(anBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anBut1)
                    .addComponent(supBut1))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jFrame2.setResizable(false);
        jFrame2.setSize(new java.awt.Dimension(550, 400));

        jLabel13.setText("De :");

        jLabel14.setText("à :");

        absCh3.setText("Abs");

        radioch3.setText("Radio");

        climCh3.setText("Climatiseur");

        airCh3.setText("Airbag");

        rchBut3.setText("Rechercher");

        tab2.setModel(new javax.swing.table.DefaultTableModel(
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
        tab2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane3.setViewportView(tab2);

        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFrame2Layout.createSequentialGroup()
                                .addComponent(radioch3)
                                .addGap(27, 27, 27)
                                .addComponent(climCh3)
                                .addGap(18, 18, 18)
                                .addComponent(absCh3)
                                .addGap(18, 18, 18)
                                .addComponent(airCh3)
                                .addGap(57, 57, 57)
                                .addComponent(rchBut3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jFrame2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(dd1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(df1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jFrame2Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jButton2)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(df1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioch3)
                        .addComponent(climCh3)
                        .addComponent(absCh3)
                        .addComponent(airCh3))
                    .addComponent(rchBut3))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestion des Voitures");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Rechercher une voiture :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Matricule :");

        mar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mar.setText("Marque :");

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
        tab.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tab);

        ajBut.setText("Ajouter une voiture");

        verBut.setText("Vérifier l'age des voiture");

        retBut.setText("Retour");
        retBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retButActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Type :");

        radioch.setText("Radio");

        climCh.setText("Climatiseur");

        airCh.setText("Airbag");

        absCh.setText("Abs");

        trouBut1.setText("Trouver une voiture");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 445, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(retBut)
                        .addGap(36, 36, 36)
                        .addComponent(ajBut, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(verBut, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(trouBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioch)
                                .addGap(27, 27, 27)
                                .addComponent(climCh)
                                .addGap(18, 18, 18)
                                .addComponent(absCh)
                                .addGap(18, 18, 18)
                                .addComponent(airCh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rechBut))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(matTf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(marTf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(typeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(marTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mar)
                    .addComponent(typeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rechBut)
                    .addComponent(radioch)
                    .addComponent(climCh)
                    .addComponent(absCh)
                    .addComponent(airCh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajBut)
                    .addComponent(verBut)
                    .addComponent(retBut)
                    .addComponent(trouBut1))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retButActionPerformed
        jFrame1.dispatchEvent(new WindowEvent(jFrame1, WindowEvent.WINDOW_CLOSING));
        entryFrame.dispatchEvent(new WindowEvent(entryFrame, WindowEvent.WINDOW_CLOSING));
        dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_retButActionPerformed

    private void anButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anButActionPerformed
        entryFrame.dispatchEvent(new WindowEvent(entryFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_anButActionPerformed

    private void anBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anBut1ActionPerformed
        jFrame1.dispatchEvent(new WindowEvent(jFrame1, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_anBut1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFrame2.dispatchEvent(new WindowEvent(jFrame2, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void RechercheListener(java.awt.event.ActionListener lis ){
        rechBut.addActionListener(lis);
    }
    
    public void AjouterListener(java.awt.event.ActionListener lis ){
        ajBut.addActionListener(lis);
    }
    
    public void AddListener(java.awt.event.ActionListener lis ){
        verBut.addActionListener(lis);
    }
    
    public void VerifListener(java.awt.event.ActionListener lis ){
        verBut.addActionListener(lis);
    }
    
    public void SupprimerListener(java.awt.event.ActionListener lis ){
        supBut1.addActionListener(lis);
    }
    
    public void OkButListener(java.awt.event.ActionListener lis ){
        okBut.addActionListener(lis);
    }

    public void trouButListener(java.awt.event.ActionListener lis ){
        trouBut1.addActionListener(lis);
    }
    
    public void rechButListener(java.awt.event.ActionListener lis ){
        rchBut3.addActionListener(lis);
    }
    public JCheckBox getAbsCh() {
        return absCh;
    }

    public JCheckBox getAirCh() {
        return airCh;
    }

    public JCheckBox getClimCh() {
        return climCh;
    }

    public JTextField getMarTf() {
        return marTf;
    }

    public JTextField getMatTf() {
        return matTf;
    }

    public JCheckBox getRadioch() {
        return radioch;
    }

    public JTextField getTypeTf() {
        return typeTf;
    }

    public JCheckBox getAbsCh2() {
        return absCh2;
    }

    public JCheckBox getAirCh2() {
        return airCh2;
    }

    public JCheckBox getClimCh2() {
        return climCh2;
    }

    public JXDatePicker getDatePk2() {
        return datePk2;
    }

    public JTextField getMarTf2() {
        return marTf2;
    }

    public JTextField getMatTf2() {
        return matTf2;
    }

    public JTextField getPrixTf2() {
        return prixTf2;
    }

    public JTextField getPuisTf2() {
        return puisTf2;
    }

    public JCheckBox getRadioch2() {
        return radioch2;
    }

    public JTextField getTypeTf2() {
        return typeTf2;
    }

    public JComboBox<String> getClasCom2() {
        return clasCom2;
    }

    public JFrame getjFrame2() {
        return jFrame2;
    }

    public JXDatePicker getDd1() {
        return dd1;
    }

    public JXDatePicker getDf1() {
        return df1;
    }

    public JButton getRchBut3() {
        return rchBut3;
    }

    public JTable getTab2() {
        return tab2;
    }

    public JCheckBox getAbsCh3() {
        return absCh3;
    }

    public JCheckBox getAirCh3() {
        return airCh3;
    }

    public JCheckBox getClimCh3() {
        return climCh3;
    }

    public JCheckBox getRadioch3() {
        return radioch3;
    }
    
    public void setTab(DefaultTableModel m) {
        this.tab.setModel(m);
    }
    
    public void setTab1(DefaultTableModel m) {
        this.tab1.setModel(m);
    }
    
    public void setTab2(DefaultTableModel m) {
        this.tab2.setModel(m);
    }
    
    public JFrame getjFrame1() {
        return jFrame1;
    }
    
    public JFrame getEntryFrame() {
        return entryFrame;
    }

    public JTable getTab() {
        return tab;
    }

    public JTable getTab1() {
        return tab1;
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
    private javax.swing.JLabel Titre;
    private javax.swing.JCheckBox absCh;
    private javax.swing.JCheckBox absCh2;
    private javax.swing.JCheckBox absCh3;
    private javax.swing.JCheckBox airCh;
    private javax.swing.JCheckBox airCh2;
    private javax.swing.JCheckBox airCh3;
    private javax.swing.JButton ajBut;
    private final javax.swing.JButton anBut = new javax.swing.JButton();
    private javax.swing.JButton anBut1;
    private javax.swing.JComboBox<String> clasCom2;
    private javax.swing.JCheckBox climCh;
    private javax.swing.JCheckBox climCh2;
    private javax.swing.JCheckBox climCh3;
    private org.jdesktop.swingx.JXDatePicker datePk2;
    private org.jdesktop.swingx.JXDatePicker dd1;
    private org.jdesktop.swingx.JXDatePicker df1;
    private javax.swing.JFrame entryFrame;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private final javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel10 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel11 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel12 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private final javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel4;
    private final javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private final javax.swing.JLabel mar = new javax.swing.JLabel();
    private javax.swing.JTextField marTf;
    private javax.swing.JTextField marTf2;
    private javax.swing.JTextField matTf;
    private javax.swing.JTextField matTf2;
    private javax.swing.JButton okBut;
    private javax.swing.JTextField prixTf2;
    private javax.swing.JTextField puisTf2;
    private javax.swing.JCheckBox radioch;
    private javax.swing.JCheckBox radioch2;
    private javax.swing.JCheckBox radioch3;
    private javax.swing.JButton rchBut3;
    private javax.swing.JButton rechBut;
    private javax.swing.JButton retBut;
    private javax.swing.JButton supBut1;
    private javax.swing.JTable tab;
    private javax.swing.JTable tab1;
    private javax.swing.JTable tab2;
    private javax.swing.JButton trouBut1;
    private javax.swing.JTextField typeTf;
    private javax.swing.JTextField typeTf2;
    private javax.swing.JButton verBut;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JOptionPane popup;
}
