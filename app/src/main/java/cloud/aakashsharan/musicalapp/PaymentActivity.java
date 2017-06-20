package cloud.aakashsharan.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        // get the recently played view
        TextView rPlayedView = (TextView)findViewById(R.id.recently_played);

        rPlayedView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent rPlayedIntent = new Intent(PaymentActivity.this, RecentlyPlayedActivity.class);
                startActivity(rPlayedIntent);
            }
        });

    }
}
