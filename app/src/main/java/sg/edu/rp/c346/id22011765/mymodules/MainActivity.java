package sg.edu.rp.c346.id22011765.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvmod1;
    TextView tvmod2;
    TextView tvmod3;
    TextView tvmod4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvmod1 = findViewById(R.id.mod1);
        tvmod2 = findViewById(R.id.mod2);
        tvmod3 = findViewById(R.id.mod3);
        tvmod4 = findViewById(R.id.mod4);

        tvmod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetail.class);
                intent.putExtra("modCode", "C346");
                intent.putExtra("modName", "Mobile App Development");
                intent.putExtra("modYear", "2023");
                intent.putExtra("modSem", "1");
                intent.putExtra("modCred", "4");
                intent.putExtra("modVen", "E63A");
                startActivity(intent);
            }
        });

        tvmod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetail.class);
                intent.putExtra("modCode", "C206");
                intent.putExtra("modName", "Software Development Process");
                intent.putExtra("modYear", "2023");
                intent.putExtra("modSem", "1");
                intent.putExtra("modCred", "4");
                intent.putExtra("modVen", "W65C");
                startActivity(intent);
            }
        });

        tvmod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetail.class);
                intent.putExtra("modCode", "C235");
                intent.putExtra("modName", "IT Security Management");
                intent.putExtra("modYear", "2023");
                intent.putExtra("modSem", "1");
                intent.putExtra("modCred", "4");
                intent.putExtra("modVen", "W65C");
                startActivity(intent);
            }
        });

        tvmod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetail.class);
                intent.putExtra("modCode", "C218");
                intent.putExtra("modName", "UI UX Design for Apps");
                intent.putExtra("modYear", "2023");
                intent.putExtra("modSem", "1");
                intent.putExtra("modCred", "4");
                intent.putExtra("modVen", "W65C");
                startActivity(intent);
            }
        });
    }
}