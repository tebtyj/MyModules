package sg.edu.rp.c346.id22011050.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class module1 extends AppCompatActivity {
    TextView tvDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);
        tvDisplay = findViewById(R.id.textView2);

        tvDisplay.setText("In Second Activity");
        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("ModuleC");
        String moduleName = intentReceived.getStringExtra("ModuleN");
        int AcadeYr = intentReceived.getIntExtra("Acdmicyr",2020);
        int Sem = intentReceived.getIntExtra("sem",1);
        int ModCred = intentReceived.getIntExtra("credit",4);
        String venue = intentReceived.getStringExtra("venue");
        tvDisplay.setText(moduleCode+": C346\n"+moduleName+": Android Programming \n" +"Academic Year: "+ AcadeYr+"\n"+
                "Semester: "+Sem+ "\n"+"Module Credit: "+ModCred+"\n"+venue+": W66M");
    }
}