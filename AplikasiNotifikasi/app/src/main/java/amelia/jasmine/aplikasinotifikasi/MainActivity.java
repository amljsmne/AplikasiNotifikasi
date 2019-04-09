package amelia.jasmine.aplikasinotifikasi;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String Channel_id = "notifkasiSholat";
    private static final String Channel_name = "notifikasiWaktuSholat";
    private static final String Channel_desc = "notifikasiCSholat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSubuh = findViewById(R.id.subuh);
        Button buttonDzuhur = findViewById(R.id.dzuhur);
        Button buttonAshar = findViewById(R.id.ashar);
        Button buttonMagrib = findViewById(R.id.magrib);
        Button buttonIsya = findViewById(R.id.isya);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(Channel_id, Channel_name, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(Channel_desc);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        buttonSubuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subuh();
            }
        });

        buttonDzuhur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dzuhur();
            }
        });

        buttonAshar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ashar();
            }
        });

        buttonMagrib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magrib();
            }
        });

        buttonIsya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isya();
            }
        });

    }

    private void subuh(){
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this, Channel_id)
                        .setSmallIcon(R.drawable.ic_notifications_none_black_24dp)
                        .setContentTitle("Subuh")
                        .setContentText("Saatnya sholat subuh!! Sholat lebih baik daripada tidur")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1,mBuilder.build());

    }

    private void dzuhur(){
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this, Channel_id)
                        .setSmallIcon(R.drawable.ic_notifications_none_black_24dp)
                        .setContentTitle("Dzuhur")
                        .setContentText("Waktu Dzuhur! Waktu istirahat, jangan lupa sholat Dzuhur.")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1,mBuilder.build());

    }

    private void ashar(){
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this, Channel_id)
                        .setSmallIcon(R.drawable.ic_notifications_none_black_24dp)
                        .setContentTitle("Ashar")
                        .setContentText("Waktu Ashar! Luangkan waktu untuk akhiratmu. Dunia sementara, akhirat selamanya.")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1,mBuilder.build());

    }

    private void magrib(){
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this, Channel_id)
                        .setSmallIcon(R.drawable.ic_notifications_none_black_24dp)
                        .setContentTitle("Magrib")
                        .setContentText("Waktu Magrib! Jangan sibukkan dengan dunia saja, bersiap untuk sholat.")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1,mBuilder.build());

    }

    private void isya(){
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this, Channel_id)
                        .setSmallIcon(R.drawable.ic_notifications_none_black_24dp)
                        .setContentTitle("Isya")
                        .setContentText("Waktu Isya! Sholat Isya dulu baru istirahat.")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1,mBuilder.build());

    }
}
