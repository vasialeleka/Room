package com.example.roommvp.addpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roommvp.R;
import com.example.roommvp.main.MainActivity;

public class AddPet extends AppCompatActivity {
    Button addPetButton;
    EditText petName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_pet);
        addPetButton = findViewById(R.id.buttonAdd);
        final AppPetPresenter presenter = new AppPetPresenter(this);
        petName = (EditText) findViewById(R.id.editText);
        addPetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               presenter.insertData(petName.getText().toString());
                Intent intent = new Intent(AddPet.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}
