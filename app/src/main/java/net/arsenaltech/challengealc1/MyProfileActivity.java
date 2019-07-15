package net.arsenaltech.challengealc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {
    TextView track_value, country_value, email_value, phone_value, slackusername_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        getSupportActionBar().setTitle(getString(R.string.profile));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        track_value = findViewById(R.id.track_value);
        country_value = findViewById(R.id.country_value);
        email_value = findViewById(R.id.email_value);
        phone_value = findViewById(R.id.phone_value);
        slackusername_value = findViewById(R.id.slackusername_value);


        track_value.setText("Android");
        country_value.setText("Benin");
        email_value.setText("nachsou@gmail.com");
        phone_value.setText("22966080420");
        slackusername_value.setText("@Narech");




    }


    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }
}
