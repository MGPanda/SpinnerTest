package com.example.spinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner s = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s = findViewById(R.id.spinner3);
        s.setAdapter(adapter);
    }
    public void update(View view) {
        TextView tv = findViewById(R.id.textView);
        TextView tv2 = findViewById(R.id.textView2);
        EditText et = findViewById(R.id.email);
        EditText et2 = findViewById(R.id.phone);
        Spinner s = findViewById(R.id.spinner);
        tv.setText(et.getText()+" - "+s.getSelectedItem().toString());
        s = findViewById(R.id.spinner3);
        tv2.setText(et2.getText()+" - "+s.getSelectedItem().toString());
    }
}
