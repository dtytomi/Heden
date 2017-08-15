package com.example.tomix.heden.data;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

import com.example.tomix.heden.R;
import com.example.tomix.heden.data.DatabaseDescription.Client;


/**
 * Created by tomix on 5/21/17.
 */

public class ClientContentProvider extends ContentProvider {

    // used to access the database
    private ClientDatabaseHandler databaseHelper;

    // UriMatcher helps ContentProvider determine operation to perform
    private static final UriMatcher uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);

    // constants used with UriMatcher to determine operation to perform
    private static final int ONE_CLIENT = 1;
    private static final int CLIENTS = 2;

    // static block to configure this ContentProvider's UriMatcher
    static {
        // Uri for Client with the specified id (#)
        uriMatcher.addURI(DatabaseDescription.AUTHOURITY,
                Client.TABLE_NAME + "/*", ONE_CLIENT);

        // Uri for Clients table
        uriMatcher.addURI(DatabaseDescription.AUTHOURITY,
                Client.TABLE_NAME, CLIENTS);

    }

    // called when the AddressBookContentProvider is created
    @Override
    public boolean onCreate() {
        // create the ClientDatabaseHandler
        databaseHelper = new ClientDatabaseHandler(getContext());
        return true;
    }

    // required method: Not used in this app, so we return null
    @Override
    public String getType(Uri uri) {
        return null;
    }

    // query the database
    @Override
    public Cursor query(Uri uri, String[] projection,
                        String selection, String[] selectionArgs, String sortOrder) {

        SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
        queryBuilder.setTables(Client.TABLE_NAME);

        switch (uriMatcher.match(uri)) {
            case ONE_CLIENT:
                queryBuilder.appendWhere(
                        Client._ID + "=" + uri.getLastPathSegment()
                );
                break;

            case CLIENTS:
                break;

            default:
                throw new UnsupportedOperationException(
                        getContext().getString(R.string.invalid_query_uri) + uri
                );
        }

        // execute the query to select one or all contacts
        Cursor cursor = queryBuilder.query(databaseHelper.getReadableDatabase(),
                projection, selection, selectionArgs, null, null, sortOrder);

        cursor.setNotificationUri(getContext().getContentResolver(), uri);

        return cursor;
    }

    // insert a new contact in the database
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        Uri newClientUri = null;

        switch (uriMatcher.match(uri)) {
            // insert the new contact--success yields new contact's row id
            case CLIENTS:
                long rowId = databaseHelper.getWritableDatabase().insert(
                        Client.TABLE_NAME, null, values
                );
                // if the Client was inserted, create an appropriate Uri;
                // otherwise, throw an exception
                if ( rowId > 0) {
                    newClientUri = ContentUris.withAppendedId(Client.CONTENT_URI, rowId);

                    // notify observers that the database changed
                    getContext().getContentResolver().notifyChange(uri, null);
                } else {
                    throw new SQLException(
                            getContext().getString(R.string.invalid_insert_failed) + uri
                    );
                }

                break;

            default:
                throw new UnsupportedOperationException(
                        getContext().getString(R.string.invalid_insert_uri) + uri
                );
        }

        return newClientUri;
    }

    // update an existing contact in the database
    @Override
    public int update(Uri uri, ContentValues values,
                      String selection, String[] selectionArgs) {

        int numberOfRowsUpdated;

        switch (uriMatcher.match(uri)) {
            case ONE_CLIENT:
                String id = uri.getLastPathSegment();

                // update the contact
                numberOfRowsUpdated = databaseHelper.getWritableDatabase().update(
                        Client.TABLE_NAME, values, Client._ID + "=" + id,
                        selectionArgs
                );
                break;

            default:
                throw new UnsupportedOperationException(
                        getContext().getString(R.string.invalid_update_uri) + uri
                );
        }

        // if changes were made, notify observers that the database changed
        if (numberOfRowsUpdated != 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }

        return numberOfRowsUpdated;
    }

    // delete an existing contact from the database
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {

        int numberOfRowsDeleted;

        switch (uriMatcher.match(uri)) {
            case ONE_CLIENT:
                String id = uri.getLastPathSegment();

                // update the contact
                numberOfRowsDeleted = databaseHelper.getWritableDatabase().delete(
                        Client.TABLE_NAME, Client._ID + "=" + id,
                        selectionArgs
                );
                break;

            default:
                throw new UnsupportedOperationException(
                        getContext().getString(R.string.invalid_delete_uri) + uri
                );
        }

        // if changes were made, notify observers that the database changed
        if (numberOfRowsDeleted != 0) {
            getContext().getContentResolver().notifyChange(uri, null);
        }

        return numberOfRowsDeleted;
    }

}
