package cloud.aakashsharan.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Find the view that shows playlist category
        TextView playlistView = (TextView)findViewById(R.id.playlist);

        // Set a click listener on that view
        playlistView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(SongsActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
