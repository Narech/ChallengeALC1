package net.arsenaltech.challengealc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button btn_about_alc;
    public Button btn_my_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(getString(R.string.main_activty_title));
        btn_about_alc = findViewById(R.id.btn_about_alc);
        btn_my_profile = findViewById(R.id.btn_my_profile);

        btn_about_alc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutALCActivity.class);
                startActivity(intent);
            }
        });
        btn_my_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(intent);

            }
        });
    }
}
