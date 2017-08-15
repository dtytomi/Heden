package com.example.tomix.heden.data;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by tomix on 5/21/17.
 */

public class DatabaseDescription {

    // ContentProvider's name: typically the package name
    public static final String AUTHOURITY = "com.example.tomix.heden.data";

    // base URI used to interact with the ContentProvider
    public static  final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHOURITY);

    // nested class defines contents of the clients table
    public static final class Client implements BaseColumns {
        public static final String TABLE_NAME = "clients";

        // Uri for the contacts table
        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(TABLE_NAME).build();


        // Contacts Table Columns names
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_ADDRESS = "address";
        public static final String COLUMN_POWER = "power";
        public static final String COLUMN_PER_HOUR_RATING = "perHourRating";

        // creates a Uri for a specific contact
        public static Uri buildClientUri (long id) {
            return ContentUris.withAppendedId(CONTENT_URI, id);
        }

    }

}
