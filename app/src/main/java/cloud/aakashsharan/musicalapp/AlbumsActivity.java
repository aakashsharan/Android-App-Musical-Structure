package cloud.aakashsharan.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the view that shows songs category
        TextView songsView = (TextView)findViewById(R.id.songs);

        // Set a click listener on that view
        songsView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(AlbumsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });
    }
}
