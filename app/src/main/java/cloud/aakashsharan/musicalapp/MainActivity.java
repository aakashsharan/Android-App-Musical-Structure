package cloud.aakashsharan.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the view that shows recently played category
        TextView rPlayedView = (TextView)findViewById(R.id.recently_played);

        // Set a click listener on that view
        rPlayedView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent rPlayedIntent = new Intent(MainActivity.this, RecentlyPlayedActivity.class);
                startActivity(rPlayedIntent);
            }
        });


        // Find the view that shows artists category
        TextView artistView = (TextView)findViewById(R.id.artists);

        // Set a click listener on that view
        artistView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });

        // Find the view that shows albums category
        TextView albumView = (TextView)findViewById(R.id.albums);

        // Set a click listener on that view
        albumView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });

        // Find the view that shows songs category
        TextView songsView = (TextView)findViewById(R.id.songs);

        // Set a click listener on that view
        songsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Find the view that shows playlist category
        TextView playlistView = (TextView)findViewById(R.id.playlist);

        // Set a click listener on that view
        playlistView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        // Find the view that shows payment category
        TextView paymentView = (TextView)findViewById(R.id.payment_activity);

        // Set a click listener on that view
        paymentView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });

    }
}
