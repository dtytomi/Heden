package adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.tomix.heden.R;
import com.example.tomix.heden.data.DatabaseDescription;
import com.example.tomix.heden.data.DatabaseDescription.Client;

import java.util.List;

/**
 * Created by tomix on 5/22/17.
 */

public class ListViewAdapter extends BaseAdapter implements View.OnClickListener {

    private Activity activity;

    // ContactsAdapter instance variables
    private Cursor cursor = null;

    public ListViewAdapter(Activity activity) {
        super();
        this.activity = activity;
    }



    private class ViewHolder {
        TextView name;
        TextView load;
        TextView consumption;
        ImageButton delButton;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        LayoutInflater inflater = activity.getLayoutInflater();

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.listview_row, null);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.clientNameRecordView);
            holder.load = (TextView) convertView.findViewById(R.id.clientLoadRecordView);
            holder.consumption = (TextView) convertView
                    .findViewById(R.id.clientConsumptionRecordView);
            holder.delButton = (ImageButton) convertView.findViewById(R.id.delButton);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        cursor.moveToPosition(position);
        holder.name.setText(cursor.getString(cursor.getColumnIndex(Client.COLUMN_NAME)));
        holder.load.setText(cursor.getString(cursor.getColumnIndex(Client.COLUMN_POWER)));
        holder.consumption.setText(cursor.getString(cursor.getColumnIndex(Client.COLUMN_PER_HOUR_RATING)));

        ImageButton deleteButton = (ImageButton) convertView.findViewById(R.id.delButton);
        deleteButton.setOnClickListener(this);

        return convertView;
    }

    @Override
    public void onClick(View v) {
//        deleteClient();
    }

    // DialogFragment to confirm deletion of contact
//    private final DialogFragment confirmDelete = new DialogFragment() {
//
//        // create an AlertDialog and return it
//        @Override
//        public Dialog onCreateDialog(Bundle bundle) {
//
//            // create a new AlertDialog Builder
//            AlertDialog.Builder builder =
//                    new AlertDialog.Builder(getActivity());
//            builder.setTitle(R.string.confirm_title);
//            builder.setMessage(R.string.confirm_message);
//
//            // provide an OK button that simply dismisses the dialog
//            builder.setPositiveButton(R.string.button_delete,
//                    new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(
//                                DialogInterface dialog, int button) {
//                            // use Activity's ContentResolver to invoke
//                            // delete on the AddressBookContentProvider
//                            getActivity().getContentResolver().delete(
//                                    contactUri, null, null);
//                        }
//                    }
//            );
//
//            builder.setNegativeButton(R.string.button_cancel, null);
//            return builder.create(); // return the AlertDialog
//        }
//    };

//    private void deleteClient() {
//        confirmDelete.show(getFragmentManager(), "confirm delete");
//    }

    @Override
    public int getCount() {
        return (cursor != null) ? cursor.getCount() : 0;
    }

    @Override
    public Object getItem(int position) {
        return (cursor != null) ? cursor.moveToPosition(position) : 0;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    // swap this adapter's current Cursor for a new one
    public void swapCursor(Cursor cursor) {
        this.cursor = cursor;
        notifyDataSetChanged();
    }

}
