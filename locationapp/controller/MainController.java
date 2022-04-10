package locationapp.controller;

import java.awt.event.ActionEvent;
import locationapp.model.ClientModel;
import locationapp.model.LocationModel;
import locationapp.model.ReservationModel;
import locationapp.model.VoitureModel;
import locationapp.view.MainView;
import locationapp.view.ClientView;
import locationapp.view.LocationView;
import locationapp.view.ReservationView;
import locationapp.view.VoitureView;

public class MainController {
    private final MainView acceuil; 
    public MainController(MainView acceuil) {
        this.acceuil=acceuil;
        this.acceuil.setLocationRelativeTo(null);
        this.acceuil.clientListener((ActionEvent e) -> {
            ClientView cv = new ClientView();cv.setVisible(true);
            new ClienController(cv,new ClientModel());
        });
        this.acceuil.reservationListener((ActionEvent e) -> {
            ReservationView rv = new ReservationView();rv.setVisible(true);
            new ReservationController(rv,new ReservationModel());
        });
        this.acceuil.locationListener((ActionEvent e) -> {
            LocationView rv = new LocationView();rv.setVisible(true);
            new LocationController(rv,new LocationModel());
        });
        this.acceuil.voiturestListener((ActionEvent e)->{
            VoitureView cv = new VoitureView();cv.setVisible(true);
            new VoitureController(cv,new VoitureModel());
        });
    }
}