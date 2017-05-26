package rs.aleph.android.example22.async;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import rs.aleph.android.example22.dialogs.Obavestenja;
import rs.aleph.android.example22.tools.ReviewerTools;

/**
 * Created by milossimic on 10/23/16.
 */
public class SimpleService extends Service{


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    /**
     * Metoda koja se poziva prilikom izvrsavanja zadatka servisa
     * Koristeci Intent mozemo prilikom startovanja servisa proslediti
     * odredjene parametre.
     * */
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        /**
         * Provericemo trenutnu povezanost sa mrezom.
         * Za ovo koristimo dostupne pozive android operativnog sistema
         * */
        int status = ReviewerTools.getConnectivityStatus(getApplicationContext());

        /**
         * Primer poziva asinhronog zadatka ako ima veze ka mrezi
         * npr. sinhronizacija mail-ova fotografija, muzike dokumenata isl.
         * */
        //if(status == ReviewerTools.TYPE_WIFI){
            //new SimpleSyncTask(getApplicationContext()).execute();


        //}

        kreirajObavestenje(ReviewerTools.getConnectionType(status));


        /**
         * Zaustaviti servis nakon obavljenog pokretanja asinhronog zadatka.
         * Ovu metodu nije potrebno pozvati ako zelimo da nasa aplikacija
         * konstantno osluskuje na neke izmene (npr. novi email, viber poruka isl)
         * */
        stopSelf();

        /**
         * Ako iz nekog razloga operativni sistem ubije servis
         * ne kreirati novi.
         * */
        return START_NOT_STICKY;
    }

    public  void kreirajObavestenje(String _tipKonekcije) {

        Notification obavestenje=new Obavestenja(this,"Tip povezivanja",_tipKonekcije).build();
        NotificationManager notificationManager =(NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        obavestenje.flags |=Notification.FLAG_AUTO_CANCEL;

        notificationManager.notify(0, obavestenje);
    }

}
