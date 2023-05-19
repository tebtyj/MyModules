package sg.edu.rp.c346.id22011050.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMod1;
    TextView tvMod2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMod1= findViewById(R.id.C346);
        tvMod2= findViewById(R.id.C349);

        tvMod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this, module1.class);
                    i.putExtra("ModuleC","Module Code");
                    i.putExtra("ModuleN", "Module Name" );
                    i.putExtra("Acdmicyr",2020);
                    i.putExtra("sem",1);
                    i.putExtra("credit",4);
                    i.putExtra("venue","Venue");

                startActivity(i);
            }
        });
        tvMod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Module2.class);
                i.putExtra("ModuleC","Module Code");
                i.putExtra("ModuleN", "Module Name" );
                i.putExtra("Acdmicyr",2020);
                i.putExtra("sem",1);
                i.putExtra("credit",3);
                i.putExtra("venue","Venue");

                startActivity(i);
            }
        });
    }
}