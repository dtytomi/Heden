package activity;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import adapter.ListViewAdapter;

import com.example.tomix.heden.R;
import com.example.tomix.heden.data.DatabaseDescription.Client;

/**
 * Created by tomix on 5/22/17.
 */

public class ClientsFragment extends Fragment
        implements LoaderManager.LoaderCallbacks<Cursor> {

    // constant used to identify the Loader
    private static final int CONTACT_LOADER = 0;

    private ListViewAdapter listViewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getLoaderManager().initLoader(CONTACT_LOADER, null, this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        setHasOptionsMenu(true);

        View view = inflater.inflate(R.layout.fragment_clients, container, false);

        ListView listView = (ListView) view.findViewById(R.id.clientsListView);
        Log.d(getActivity().getPackageName(), listView != null ? "listView is not null!" : "listView is null!");
         listViewAdapter = new ListViewAdapter(getActivity());
        listView.setAdapter(listViewAdapter);


        return view;
    }

    // initialize a Loader when this fragment's activity is created
    public void onActivityCreated(Bundle savedInstnceState) {
        super.onActivityCreated(savedInstnceState);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

    // called by LoaderManager to create a Loader
    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        // create an appropriate CursorLoader based on the id argument;
        // only one Loader in this fragment, so the switch is unnecessary
        switch (id) {
            case CONTACT_LOADER:
                return new CursorLoader(getActivity(),
                        Client.CONTENT_URI, new String[] {Client.COLUMN_NAME,
                        Client.COLUMN_POWER, Client.COLUMN_PER_HOUR_RATING},
                        null, null, null    );

            default:
                return null;
        }
    }

    // called by LoaderManager when loading completes
    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
        listViewAdapter.swapCursor(data);
    }

    // called by LoaderManager when the Loader is being reset
    @Override
    public void onLoaderReset(Loader<Cursor> loader) {
        listViewAdapter.swapCursor(null);
    }

}
