package com.example.tomix.heden.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.tomix.heden.data.DatabaseDescription.Client;

import static android.R.attr.data;

/**
 * Created by tomix on 5/16/17.
 */

public class ClientDatabaseHandler extends SQLiteOpenHelper {

    // All Static variables
    // Database Version
    private  static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "Clients.db";


    public ClientDatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL for creating the contacts table
        final String CREATE_CLIENTS_TABLE =
                "CREATE TABLE " + Client.TABLE_NAME + "(" +
                        Client._ID + " integer primary key, " +
                        Client.COLUMN_NAME + " TEXT, " +
                        Client.COLUMN_ADDRESS + " TEXT, " +
                        Client.COLUMN_POWER + " TEXT, " +
                        Client.COLUMN_PER_HOUR_RATING + " TEXT);";
        db.execSQL(CREATE_CLIENTS_TABLE); // create the contacts table
    }

    // Upgrading database
    @Override
    public void  onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS" + Client.TABLE_NAME);

        onCreate(db);
    }

}
