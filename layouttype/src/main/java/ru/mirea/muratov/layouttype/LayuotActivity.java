package ru.mirea.muratov.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LayuotActivity extends AppCompatActivity {
    EditText editTextName;
    EditText editTextOrganisation;
    EditText editTextPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layuot);
        editTextName = findViewById(R.id.editTextName);
        editTextOrganisation = findViewById(R.id.editTextOrganisation);
        editTextPhoneNumber = findViewById(R.id.editTextPhoneNumber);
    }

    public void saveContact(View view) {
        String name = editTextName.getText().toString().trim();
        String phoneNumber = editTextPhoneNumber.getText().toString().trim();
        if (name.isEmpty() || phoneNumber.isEmpty())
            Toast.makeText(this, R.string.empty_contact_msg, Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, R.string.contact_saved_msg, Toast.LENGTH_SHORT).show();
    }
}