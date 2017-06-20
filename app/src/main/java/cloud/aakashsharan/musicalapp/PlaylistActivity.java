package cloud.aakashsharan.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Find the view that shows payment category
        TextView paymentView = (TextView)findViewById(R.id.payment_activity);

        // Set a click listener on that view
        paymentView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent paymentIntent = new Intent(PlaylistActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });
    }
}
