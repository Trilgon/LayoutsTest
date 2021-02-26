package ru.mirea.muratov.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonsActivity extends AppCompatActivity {
    private TextView textViewOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        textViewOut = findViewById(R.id.textViewOut);
    }

    public void clickedButtonOK(View view) {
        textViewOut.setText(R.string.clicked_buttno_ok);
        Toast.makeText(this, R.string.clicked_buttno_ok, Toast.LENGTH_SHORT).show();
    }

    public void clickedButtonCancel(View view) {
        textViewOut.setText(R.string.clicked_button_cancel);
        Toast.makeText(this, R.string.clicked_button_cancel, Toast.LENGTH_SHORT).show();
    }
}