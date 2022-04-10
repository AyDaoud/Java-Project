package locationapp.view;

import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;
import javax.swing.JOptionPane;

public class LocationView extends javax.swing.JFrame {
    public LocationView() {
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
        idrCom = new javax.swing.JComboBox<>();
        resCh = new javax.swing.JCheckBox();
        dedCh = new javax.swing.JRadioButton();
        cautCh = new javax.swing.JRadioButton();
        cautTf = new javax.swing.JTextField();
        kilomTf = new javax.swing.JTextField();
        ClotFrame = new javax.swing.JFrame();
        jLabel23 = new javax.swing.JLabel();
        nomTf3 = new javax.swing.JTextField();
        prenomTf3 = new javax.swing.JTextField();
        matTf1 = new javax.swing.JTextField();
        voitTf1 = new javax.swing.JTextField();
        kilomTf1 = new javax.swing.JTextField();
        montTf1 = new javax.swing.JTextField();
        IdLocTf = new javax.swing.JTextField();
        drPk = new org.jdesktop.swingx.JXDatePicker(new Locale("en"));
        hrSp = new javax.swing.JSpinner();
        mrSp = new javax.swing.JSpinner();
        okBut1 = new javax.swing.JButton();
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
        cloBut = new javax.swing.JButton();

        entryFrame.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        entryFrame.setResizable(false);
        entryFrame.setSize(new java.awt.Dimension(720, 450));
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

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Reservation :");

        idrCom.setEditable(true);
        idrCom.setMaximumRowCount(10000);
        idrCom.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("ID :");

        dedCh.setText("Dédomagement");

        cautCh.setText("Caution Payée");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Caution (20%) :");

        cautTf.setEditable(false);
        cautTf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cautTf.setText("100,000");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("DT");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Kilometrage :");

        javax.swing.GroupLayout entryFrameLayout = new javax.swing.GroupLayout(entryFrame.getContentPane());
        entryFrame.getContentPane().setLayout(entryFrameLayout);
        entryFrameLayout.setHorizontalGroup(
            entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(entryFrameLayout.createSequentialGroup()
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(entryFrameLayout.createSequentialGroup()
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
                                                .addComponent(matTf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                                .addComponent(resCh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idrCom, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(entryFrameLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wkndCh)
                            .addGroup(entryFrameLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(montTf, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20))
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(cautTf, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel27))
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addGap(117, 117, 117)
                                        .addComponent(anBut, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(okBut)))
                                .addGap(43, 43, 43)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cautCh)
                                    .addComponent(dedCh)))
                            .addGroup(entryFrameLayout.createSequentialGroup()
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
                                        .addComponent(mdSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kilomTf, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(kiloTf, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(entryFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dfPk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hfSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mfSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        entryFrameLayout.setVerticalGroup(
            entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entryFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(idrCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resCh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(kiloTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(kilomTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(montTf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(dedCh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(cautTf, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(cautCh))
                .addGap(18, 18, 18)
                .addGroup(entryFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBut)
                    .addComponent(anBut))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        ClotFrame.setSize(new java.awt.Dimension(620, 260));

        jLabel23.setText("ID_LOC :");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Nom :");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Voiture :");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Matricule : ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Prenom :");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Date de restitution :");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("à");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Kilometrage :");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setText("DT");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("Reste à payer :");

        nomTf3.setEditable(false);

        prenomTf3.setEditable(false);

        matTf1.setEditable(false);

        voitTf1.setEditable(false);

        montTf1.setEditable(false);
        montTf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        montTf1.setText("0,0");

        IdLocTf.setEditable(false);
        IdLocTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        hrSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        mrSp.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        okBut1.setText("Confirmer");

        anBut1.setText("Annuler");
        anBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anBut1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClotFrameLayout = new javax.swing.GroupLayout(ClotFrame.getContentPane());
        ClotFrame.getContentPane().setLayout(ClotFrameLayout);
        ClotFrameLayout.setHorizontalGroup(
            ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClotFrameLayout.createSequentialGroup()
                .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClotFrameLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClotFrameLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IdLocTf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ClotFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomTf3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ClotFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(matTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ClotFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(prenomTf3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ClotFrameLayout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(voitTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ClotFrameLayout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(drPk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hrSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mrSp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kilomTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(ClotFrameLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(montTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35))
                    .addGroup(ClotFrameLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(anBut1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okBut1)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        ClotFrameLayout.setVerticalGroup(
            ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClotFrameLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClotFrameLayout.createSequentialGroup()
                        .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(nomTf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(prenomTf3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(matTf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(voitTf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(IdLocTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drPk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(hrSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mrSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(kilomTf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(montTf1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(ClotFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBut1)
                    .addComponent(anBut1))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Gestion des Location");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Rechercher une reservation :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nom du Client :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Prénom du Client :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("ID LOC :");

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

        ajBut.setText("Enregistrer une Location");

        modBut.setText("Modifier une Location");

        retBut.setText("Retour");
        retBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retButActionPerformed(evt);
            }
        });

        cloBut.setText("Clôturer une Location");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
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
                .addGap(140, 140, 140)
                .addComponent(ajBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cloBut)
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
                            .addComponent(cloBut))
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

    private void anBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anBut1ActionPerformed
        ClotFrame.dispatchEvent(new WindowEvent(ClotFrame, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_anBut1ActionPerformed
    //------------------------//
    //-------Buttons----------//
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
    
    public void OkBut1Listener(java.awt.event.ActionListener lis ){
        okBut1.addActionListener(lis);
    }
    
    public void cloButListener(java.awt.event.ActionListener lis ){
        cloBut.addActionListener(lis);
    }
    
    public void wkndChListener(java.awt.event.ActionListener lis ){
        wkndCh.addActionListener(lis);
    }
    
    public void resChListener(java.awt.event.ActionListener lis ){
        resCh.addActionListener(lis);
    }
    public void idcComchanged(java.awt.event.ActionListener lis){
        idcCom.addActionListener(lis);
    }
    
    public void idvComchanged(java.awt.event.ActionListener lis){
        idvCom.addActionListener(lis);
    }
    
    public void idrComchanged(java.awt.event.ActionListener lis){
        idrCom.addActionListener(lis);
    }
    //------------------------//
    //-----------1------------//
    public int getId() {
        if(!idTf.getText().equals(""))return Integer.valueOf(idTf.getText());
        else return 0;
    }

    public String getNom() {
        return nomTf.getText();
    }

    public String getPrenom() {
        return prenomTf.getText();
    }

    public JTable getTab() {
        return tab;
    }

    public void setTab(DefaultTableModel m) {
        this.tab.setModel(m);
    }
    //------------------------//
    //----------Entry---------//
        //getters
    public JFrame getEntryFrame() {
        return entryFrame;
    }
    
    public boolean getResChState() {
        return resCh.isSelected();
    }

    public JComboBox<String> getIdrCom() {
        return idrCom;
    }
    
    public int getIdrComV() {
        return Integer.valueOf(idrCom.getSelectedItem().toString());
    }

    public JComboBox<String> getIdcCom() {
        return idcCom;
    }

    public int getIdcComV() {
        return Integer.valueOf(idcCom.getSelectedItem().toString());
    }

    public JComboBox<String> getIdvCom() {
        return idvCom;
    }

    public int getIdvComV() {
        return Integer.valueOf(idvCom.getSelectedItem().toString());
    }
    
    public double getPrixTfV() {
        return Double.valueOf(prixTf.getText());
    }

    public JTextField getPrixTf() {
        return prixTf;
    }

    public boolean getWkndChState() {
        return wkndCh.isSelected();
    }

    public JXDatePicker getDdPk() {
        return ddPk;
    }

    public JXDatePicker getDfPk() {
        return dfPk;
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
    
    public long getKilomTfV() {
        return Long.parseLong(kilomTf.getText());
    }
    
    public Long getKiloTfV() {
        return Long.parseLong(kiloTf.getText());
    }
    
    public JTextField getKiloTf() {
        return kiloTf;
    }

    public JTextField getMontTf() {
        return montTf;
    }
    
    public JTextField getCautTf() {
        return cautTf;
    }

    public JRadioButton getCautCh() {
        return cautCh;
    }

    public JRadioButton getDedCh() {
        return dedCh;
    }

    public boolean getCautChV() {
        return cautCh.isSelected();
    }

    public boolean getDedChV() {
        return dedCh.isSelected();
    }
        //setters
    public void setIdcCom(Vector<Integer> v) {
        for(int i = 0 ; i < v.size(); i++)this.idcCom.addItem(v.get(i).toString());
    }

    public void setIdvCom(Vector<Integer> v) {
        for(int i = 0 ; i < v.size(); i++)this.idvCom.addItem(v.get(i).toString());
    }
    
    public void setIdrCom(Vector<Integer> v) {
        for(int i = 0 ; i < v.size(); i++)this.idrCom.addItem(v.get(i).toString());
    }
    
    public void setNomTf2(String nomTf2) {
        this.nomTf2.setText(nomTf2);
    }

    public void setPrenomTf2(String prenomTf2) {
        this.prenomTf2.setText(prenomTf2);
    }

    public void setMatTf(String matTf) {
        this.matTf.setText(matTf);
    }

    public void setVoitTf(String VoitTf) {
        this.VoitTf.setText(VoitTf);
    }

    public void setPrixTf(String prixTf) {
        this.prixTf.setText(prixTf);
    }
    
    public void setDdPk(String d){
        try {
            ddPk.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(d));
        } catch (ParseException ex) {
            Logger.getLogger(LocationView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setDfPk(String d){
        try {
            dfPk.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(d));
        } catch (ParseException ex) {
            Logger.getLogger(LocationView.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public void setKilomTf(long kilo_deb) {
        kilomTf.setText(Long.toString(kilo_deb));
    }

    public void setKiloTf(String kiloTf) {
        this.kiloTf.setText(kiloTf);
    }

    public void setCautTf(String cautTf) {
        this.cautTf.setText(cautTf);
    }

    public void setMont_Tf(String mont_Tf) {
        this.montTf.setText(mont_Tf);
    }
    //------------------------//
    //----------Clot----------//
        //getters
    public JFrame getClotFrame() {
        return ClotFrame;
    }
    
    public String getDr(){
        if(drPk.getDate()!=null){
            String d =this.drPk.getDate().toString();
            return d.substring(0, 11)+d.substring(24, 28);
        }
        else return "";
    }

    public JXDatePicker getDrPk() {
        return drPk;
    }
    
    public String getHrSpV() {
        String s = hrSp.getValue().toString();
        String c = mfSp.getValue().toString();
        if(s.length()==1)s="0"+s;
        if(c.length()==1)c="0"+c;
        return s+":"+c;
    }

    public JTextField getKilomTf1() {
        return kilomTf1;
    }
    public long getKilomTf1V() {
        return Long.parseLong(kilomTf1.getText());
    }
    
    public JTextField getKilomTf() {
        return kilomTf;
    }
    public JTextField getIdLocTf() {
        return IdLocTf;
    }

    public void setIdLocTf(JTextField IdLocTf) {
        this.IdLocTf = IdLocTf;
    }

    public void setNomTf3(String nom){
        nomTf3.setText(nom);
    }
    
    public void setPreomTf3(String prenom){
        prenomTf3.setText(prenom);
    }
    
    public void setMatTf1(String mat){
        matTf1.setText(mat);
    }
    
    public void setVoitTf1(String voit){
        voitTf1.setText(voit);
    }

    public void setMontTf1(String mont) {
        montTf1.setText(mont);
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
    private javax.swing.JFrame ClotFrame;
    private javax.swing.JTextField IdLocTf;
    private javax.swing.JTextField VoitTf;
    private javax.swing.JButton ajBut;
    private final javax.swing.JButton anBut = new javax.swing.JButton();
    private final javax.swing.JButton anBut1 = new javax.swing.JButton();
    private javax.swing.JRadioButton cautCh;
    private javax.swing.JTextField cautTf;
    private javax.swing.JButton cloBut;
    private org.jdesktop.swingx.JXDatePicker ddPk;
    private javax.swing.JRadioButton dedCh;
    private org.jdesktop.swingx.JXDatePicker dfPk;
    private org.jdesktop.swingx.JXDatePicker drPk;
    private javax.swing.JFrame entryFrame;
    private javax.swing.JSpinner hdSp;
    private javax.swing.JSpinner hfSp;
    private javax.swing.JSpinner hrSp;
    private javax.swing.JTextField idTf;
    private javax.swing.JComboBox<String> idcCom;
    private javax.swing.JComboBox<String> idrCom;
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
    private javax.swing.JLabel jLabel23;
    private final javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel26 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel27 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel28 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel29 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel30 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel31 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel32 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel33 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel34 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel35 = new javax.swing.JLabel();
    private final javax.swing.JLabel jLabel36 = new javax.swing.JLabel();
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
    private javax.swing.JTextField kilomTf;
    private javax.swing.JTextField kilomTf1;
    private javax.swing.JTextField matTf;
    private javax.swing.JTextField matTf1;
    private javax.swing.JSpinner mdSp;
    private javax.swing.JSpinner mfSp;
    private javax.swing.JButton modBut;
    private javax.swing.JTextField montTf;
    private javax.swing.JTextField montTf1;
    private javax.swing.JSpinner mrSp;
    private javax.swing.JTextField nomTf;
    private javax.swing.JTextField nomTf2;
    private javax.swing.JTextField nomTf3;
    private javax.swing.JButton okBut;
    private javax.swing.JButton okBut1;
    private javax.swing.JTextField prenomTf;
    private javax.swing.JTextField prenomTf2;
    private javax.swing.JTextField prenomTf3;
    private javax.swing.JTextField prixTf;
    private javax.swing.JButton rechBut;
    private javax.swing.JCheckBox resCh;
    private javax.swing.JButton retBut;
    private javax.swing.JTable tab;
    private javax.swing.JTextField voitTf1;
    private javax.swing.JCheckBox wkndCh;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JOptionPane popup;
}