package cloud.aakashsharan.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // Find the view that shows albums category
        TextView albumView = (TextView)findViewById(R.id.albums);

        // Set a click listener on that view
        albumView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumIntent);
            }
        });
    }
}
