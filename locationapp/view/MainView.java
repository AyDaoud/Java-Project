package locationapp.view;

import java.awt.Color;
import javax.swing.ImageIcon;

public class MainView extends javax.swing.JFrame {
    public MainView() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voitures = new javax.swing.JButton();
        location = new javax.swing.JButton();
        reservation = new javax.swing.JButton();
        client = new javax.swing.JButton();
        ImageIcon imgcar = new ImageIcon(getClass().getResource("car.png"));
        jLabel1 = new javax.swing.JLabel();
        ImageIcon imgcli = new ImageIcon(getClass().getResource("cli.png"));
        jLabel2 = new javax.swing.JLabel();
        ImageIcon imgres = new ImageIcon(getClass().getResource("res.png"));
        jLabel3 = new javax.swing.JLabel();
        ImageIcon imgloc = new ImageIcon(getClass().getResource("loc.png"));
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Location");
        setBackground(new java.awt.Color(255, 252, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setResizable(false);

        voitures.setBackground(new java.awt.Color(255, 255, 255));
        voitures.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        voitures.setText("Voitures");
        voitures.setBorderPainted(false);
        voitures.setPreferredSize(new java.awt.Dimension(130, 30));

        location.setBackground(new java.awt.Color(255, 255, 255));
        location.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        location.setText("Location");
        location.setBorderPainted(false);
        location.setPreferredSize(new java.awt.Dimension(130, 30));

        reservation.setBackground(new java.awt.Color(255, 255, 255));
        reservation.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        reservation.setText("Reservation");
        reservation.setBorderPainted(false);
        reservation.setPreferredSize(new java.awt.Dimension(130, 30));

        client.setBackground(new java.awt.Color(255, 255, 255));
        client.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        client.setText("Clients");
        client.setBorderPainted(false);
        client.setPreferredSize(new java.awt.Dimension(147, 30));

        jLabel1.setText(null);
        jLabel1.setMaximumSize(new java.awt.Dimension(120, 120));
        jLabel1.setMinimumSize(new java.awt.Dimension(120, 120));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(120, 120));
        jLabel1.setIcon(imgcar);

        jLabel2.setText(null);
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 120));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 120));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 120));
        jLabel2.setIcon(imgcli);

        jLabel3.setText(null);
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 120));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 120));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 120));
        jLabel3.setIcon(imgres);

        jLabel4.setText(null);
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 120));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 120));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 120));
        jLabel4.setIcon(imgloc);

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 48)); // NOI18N
        jLabel5.setText("Rent CAR");

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel7.setText("Made by : Houssem eddine Rekik - Ons Chaabene - Haythem Draoui - Meisseme Kedri");

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel8.setText("Ecole Polytechnique de Tunisie - Promotion 2019-2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(95, 95, 95))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(reservation, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(voitures, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel5)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voitures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void clientListener(java.awt.event.ActionListener lis ){
        client.addActionListener(lis);
    }
    
    public void reservationListener(java.awt.event.ActionListener lis ){
        reservation.addActionListener(lis);
    }
    
    public void locationListener(java.awt.event.ActionListener lis ){
        location.addActionListener(lis);
    }
    
    public void voiturestListener(java.awt.event.ActionListener lis ){
        voitures.addActionListener(lis);
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton client;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton location;
    private javax.swing.JButton reservation;
    private javax.swing.JButton voitures;
    // End of variables declaration//GEN-END:variables
}