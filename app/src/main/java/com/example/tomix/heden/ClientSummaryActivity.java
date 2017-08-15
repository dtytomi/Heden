package com.example.tomix.heden;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.tomix.heden.data.DatabaseDescription.Client;

import static com.example.tomix.heden.R.id.nameTextInputLayout;

public class ClientSummaryActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView clientNameTextView;
    private TextView clientAddressTextView;
    private TextView loadTextView;
    private TextView loadConsumptionTextView;

    private int load;
    private float consumption;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_summary);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("Name");
        String address = bundle.getString("Address");
        float consumption = bundle.getFloat("Consumption");
        int load = bundle.getInt("Load");

        clientNameTextView = (TextView) findViewById(R.id.clientNameTextView);
        clientAddressTextView = (TextView) findViewById(R.id.clientAddressTextView);
        loadTextView = (TextView) findViewById(R.id.loadTextView);
        loadConsumptionTextView = (TextView) findViewById(R.id.loadConsumptionTextView);

        clientNameTextView.setText(name);
        clientAddressTextView.setText(address);
        loadTextView.setText(String.format("%d", load));
        loadConsumptionTextView.setText(String.format("%.02f", consumption));

        Button safe = (Button) findViewById(R.id.safeButton);
        safe.setOnClickListener(this);

        Button cancel = (Button) findViewById(R.id.cancelButton);
        cancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cancelButton:
                //Closing ClientSummaryScreen Activity
                finish();
                break;

            case R.id.safeButton:
                saveClient(); // save contact to the database
                finish();
                break;

            default:
                break;
        }

    }

    // saves client information to the database
    private void saveClient() {
        // create ContentValues object containing contact's key-value pairs
        ContentValues contentValues = new ContentValues();
        contentValues.put(Client.COLUMN_NAME,
                clientNameTextView.getText().toString());
        contentValues.put(Client.COLUMN_ADDRESS,
                clientAddressTextView.getText().toString());
        contentValues.put(Client.COLUMN_POWER,
                loadTextView.getText().toString());
        contentValues.put(Client.COLUMN_PER_HOUR_RATING,
                loadConsumptionTextView.getText().toString());


        // use Activity's ContentResolver to invoke
        // insert on the ClientContentProvider
        Uri newContactUri = getContentResolver().insert(
                Client.CONTENT_URI, contentValues);
    }

}
