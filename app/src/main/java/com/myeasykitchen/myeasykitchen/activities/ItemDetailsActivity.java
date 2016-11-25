package com.myeasykitchen.myeasykitchen.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.myeasykitchen.myeasykitchen.DatabaseClient;
import com.myeasykitchen.myeasykitchen.R;

/**
 * Created by Ali on 11/25/2016.
 */

public abstract class ItemDetailsActivity extends AppCompatActivity {

    protected EditText nameText;
    protected EditText quantityText;
    protected DatabaseClient databaseClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        nameText = (EditText)findViewById(R.id.name_text);
        quantityText = (EditText)findViewById(R.id.quantity_text);

        Button save_button = (Button)findViewById(R.id.save_button);
        Button cancel_button = (Button)findViewById(R.id.cancel_button);

        databaseClient = DatabaseClient.getInstance();

        setup();

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save_item();
                finish();
            }
        });

        cancel_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public abstract void save_item();
    public abstract void setup();
}
