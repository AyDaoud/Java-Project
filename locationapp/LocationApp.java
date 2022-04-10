package locationapp;

import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import locationapp.controller.MainController;
import locationapp.view.MainView;

public class LocationApp {
    public static void main(String[] args) {
        //Theme Setup
        try {
            for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
                if("Windows".equals(info.getName()))UIManager.setLookAndFeel(info.getClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }
        //language and timeZone Setup
        Locale.setDefault(new Locale("en","US"));
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        
        MainView acceuil = new MainView();
        acceuil.setVisible(true);
        MainController mainActivity = new MainController(acceuil);
    }
}
