package rs.aleph.android.example22.dialogs;

import android.app.Notification;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;

import rs.aleph.android.example22.R;

/**
 * Created by borcha on 26.05.17..
 */

public class Obavestenja extends Notification.Builder {

    String naslovPoruke;
    String poruka;
    Context cont;



    public Obavestenja(Context context, String _naslov, String _poruka) {
        super(context);
        this.cont=context;
        this.naslovPoruke=_naslov;
        this.poruka=_poruka;

        setContentTitle(_naslov);
        setContentText(_poruka);
        setSmallIcon(R.drawable.ic_tipkonekcije);


    }

    @Override
    public Notification build() {
        return super.build();
    }
}
