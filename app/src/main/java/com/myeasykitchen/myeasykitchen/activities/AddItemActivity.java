package com.myeasykitchen.myeasykitchen.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.myeasykitchen.myeasykitchen.DatabaseClient;
import com.myeasykitchen.myeasykitchen.models.Item;
import com.myeasykitchen.myeasykitchen.R;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        Button save_button = (Button)findViewById(R.id.save_button);
        Button cancel_button = (Button)findViewById(R.id.cancel_button);

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

    public void save_item()
    {
        TextView name_text = (TextView)findViewById(R.id.name_text);
        TextView quantity_text = (TextView)findViewById(R.id.quantity_text);

        DatabaseClient.getInstance().addItem(getIntent().getStringExtra("list name"), new Item(name_text.getText().toString()));
        finish();
    }
}
