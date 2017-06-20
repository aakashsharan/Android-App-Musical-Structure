package cloud.aakashsharan.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class RecentlyPlayedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_played);

        // Find the view that shows artists category
        TextView artistView = (TextView)findViewById(R.id.artists);

        // Set a click listener on that view
        artistView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(RecentlyPlayedActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
            }
        });
    }
}
