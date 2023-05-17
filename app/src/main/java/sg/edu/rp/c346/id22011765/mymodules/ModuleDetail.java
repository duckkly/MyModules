package sg.edu.rp.c346.id22011765.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetail extends AppCompatActivity {

    TextView tvmodCode;
    TextView tvmodName;
    TextView tvmodYear;
    TextView tvmodSem;
    TextView tvmodCred;
    TextView tvmodVen;
    Button btnreset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvmodCode = findViewById(R.id.modCode);
        tvmodName = findViewById(R.id.modName);
        tvmodYear = findViewById(R.id.modYear);
        tvmodSem = findViewById(R.id.modSem);
        tvmodCred = findViewById(R.id.modCred);
        tvmodVen = findViewById(R.id.modVen);
        btnreset = findViewById(R.id.btnreset);

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intentReceived = getIntent();
        String ModCode = intentReceived.getStringExtra("modCode");
        String ModName = intentReceived.getStringExtra("modName");
        String ModYear = intentReceived.getStringExtra("modYear");
        String ModSem = intentReceived.getStringExtra("modSem");
        String ModCred = intentReceived.getStringExtra("modCred");
        String ModVen = intentReceived.getStringExtra("modVen");

        tvmodCode.setText("Module Code: " + ModCode);
        tvmodName.setText("Module Name: " + ModName);
        tvmodYear.setText("Module Year: " + ModYear);
        tvmodSem.setText("Module Semester: " + ModSem);
        tvmodCred.setText("Module Credit: " + ModCred);
        tvmodVen.setText("Module Venue: " + ModVen);
    }
}