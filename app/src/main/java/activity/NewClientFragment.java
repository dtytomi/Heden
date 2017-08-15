package activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.tomix.heden.ClientSummaryActivity;
import com.example.tomix.heden.R;


/**
 * Created by tomix on 5/12/17.
 */

public class NewClientFragment  extends Fragment implements View.OnClickListener  {


    Bundle bundle = new Bundle();

    private TextInputLayout nameTextInputLayout;
    private TextInputLayout addressTextInputLayout;
    private EditText hpACEditView5Qty;
    private EditText hpACEditView5Hrs;
    private EditText hpACEditView1Qty;
    private EditText hpACEditView1Hrs;
    private EditText hpACEditView15Qty;
    private EditText hpACEditView15Hrs;
    private EditText hpACEditView2Qty;
    private EditText hpACEditView2Hrs;
    private EditText bulbEditViewESLQty;
    private EditText bulbEditViewESLHrs;
    private EditText bulbEditViewTLQty;
    private EditText bulbEditViewTLHrs;
    private EditText bulbEditView60Qty;
    private EditText bulbEditView60Hrs;
    private EditText bulbEditView100Qty;
    private EditText bulbEditView100Hrs;
    private EditText bulbEditView200Qty;
    private EditText bulbEditView200Hrs;
    private EditText fanEditViewCFQty;
    private EditText fanEditViewCFHrs;
    private EditText fanEditViewSFQty;
    private EditText fanEditViewSFHrs;
    private EditText fanEditViewBSFQty;
    private EditText fanEditViewBSFHrs;
    private EditText tvEditViewQty;
    private EditText tvEditViewHrs;
    private EditText rdEditViewQty;
    private EditText rdEditViewHrs;
    private EditText dcEditViewQty;
    private EditText dcEditViewHrs;
    private EditText dvdEditViewQty;
    private EditText dvdEditViewHrs;
    private EditText htEditViewQty;
    private EditText htEditViewHrs;
    private EditText csEditViewQty;
    private EditText csEditViewHrs;
    private EditText lpEditViewQty;
    private EditText lpEditViewHrs;
    private EditText wdEditViewQty;
    private EditText wdEditViewHrs;
    private EditText dfEditViewQty;
    private EditText dfEditViewHrs;
    private EditText refrigeratorEditViewQty;
    private EditText refrigeratorEditViewHrs;
    private EditText wmEditViewQty;
    private EditText wmEditViewHrs;
    private EditText hEditViewQty;
    private EditText hEditViewHrs;
    private EditText ovEditViewQty;
    private EditText ovEditViewHrs;
    private EditText mtEditViewQty;
    private EditText mtEditViewHrs;
    private EditText vcEditViewQty;
    private EditText vcEditViewHrs;
    private EditText wpEditViewQty;
    private EditText wpEditViewHrs;
    private EditText ironEditViewQty;
    private EditText ironEditViewHrs;
    private EditText ecEditViewQty;
    private EditText ecEditViewHrs;
    private EditText fbEditViewQty;
    private EditText fbEditViewHrs;
    private EditText phoneChargerEditViewQty;
    private EditText phoneChargerEditViewHrs;

    public int totalWatt = 0;
    public int totalHours = 0;
    public float totalConsumption;


    public NewClientFragment() {

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_new_client, container, false);

        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        nameTextInputLayout =
                (TextInputLayout) view.findViewById(R.id.nameTextInputLayout);
        addressTextInputLayout =
                (TextInputLayout) view.findViewById(R.id.addressTextInputLayout);
        hpACEditView5Qty = (EditText) view.findViewById(R.id.hpACEditView5Qty);
        hpACEditView5Hrs = (EditText) view.findViewById(R.id.hpACEditView5Hrs);
        hpACEditView1Qty = (EditText) view.findViewById(R.id.hpACEditView1Qty);
        hpACEditView1Hrs = (EditText) view.findViewById(R.id.hpACEditView1Hrs);
        hpACEditView15Qty = (EditText) view.findViewById(R.id.hpACEditView15Qty);
        hpACEditView15Hrs = (EditText) view.findViewById(R.id.hpACEditView15Hrs);
        hpACEditView2Qty = (EditText) view.findViewById(R.id.hpACEditView2Qty);
        hpACEditView2Hrs = (EditText) view.findViewById(R.id.hpACEditView2Hrs);
        bulbEditViewESLQty = (EditText) view.findViewById(R.id.bulbEditViewESLQty);
        bulbEditViewESLHrs = (EditText) view.findViewById(R.id.bulbEditViewESLHrs);
        bulbEditViewTLQty = (EditText) view.findViewById(R.id.bulbEditViewTLQty);
        bulbEditViewTLHrs = (EditText) view.findViewById(R.id.bulbEditViewTLHrs);
        bulbEditView60Qty = (EditText) view.findViewById(R.id.bulbEditView60Qty);
        bulbEditView60Hrs = (EditText) view.findViewById(R.id.bulbEditView60Hrs);
        bulbEditView100Qty = (EditText) view.findViewById(R.id.bulbEditView100Qty);
        bulbEditView100Hrs = (EditText) view.findViewById(R.id.bulbEditView100Hrs);
        bulbEditView200Qty = (EditText) view.findViewById(R.id.bulbEditView200Qty);
        bulbEditView200Hrs = (EditText) view.findViewById(R.id.bulbEditView200Hrs);
        fanEditViewCFQty = (EditText) view.findViewById(R.id.fanEditViewCFQty);
        fanEditViewCFHrs = (EditText) view.findViewById(R.id.fanEditViewCFHrs);
        fanEditViewSFQty = (EditText) view.findViewById(R.id.fanEditViewSFQty);
        fanEditViewSFHrs = (EditText) view.findViewById(R.id.fanEditViewSFHrs);
        fanEditViewBSFQty = (EditText) view.findViewById(R.id.fanEditViewBSFQty);
        fanEditViewBSFHrs = (EditText) view.findViewById(R.id.fanEditViewBSFHrs);
        tvEditViewQty = (EditText) view.findViewById(R.id.tvEditViewQty);
        tvEditViewHrs = (EditText) view.findViewById(R.id.tvEditViewHrs);
        rdEditViewQty = (EditText) view.findViewById(R.id.rdEditViewQty);
        rdEditViewHrs = (EditText) view.findViewById(R.id.rdEditViewHrs);
        dcEditViewQty = (EditText) view.findViewById(R.id.dcEditViewQty);
        dcEditViewHrs = (EditText) view.findViewById(R.id.dcEditViewHrs);
        dvdEditViewQty = (EditText) view.findViewById(R.id.dvdEditViewQty);
        dvdEditViewHrs = (EditText) view.findViewById(R.id.dvdEditViewHrs);
        htEditViewQty = (EditText) view.findViewById(R.id.htEditViewQty);
        htEditViewHrs = (EditText) view.findViewById(R.id.htEditViewHrs);
        csEditViewQty = (EditText) view.findViewById(R.id.csEditViewQty);
        csEditViewHrs = (EditText) view.findViewById(R.id.csEditViewHrs);
        lpEditViewQty = (EditText) view.findViewById(R.id.lpEditViewQty);
        lpEditViewHrs = (EditText) view.findViewById(R.id.lpEditViewHrs);
        wdEditViewQty = (EditText) view.findViewById(R.id.wdEditViewQty);
        wdEditViewHrs = (EditText) view.findViewById(R.id.wdEditViewHrs);
        dfEditViewQty = (EditText) view.findViewById(R.id.dfEditViewQty);
        dfEditViewHrs = (EditText) view.findViewById(R.id.dfEditViewHrs);
        refrigeratorEditViewQty = (EditText) view.findViewById(R.id.refrigeratorEditViewQty);
        refrigeratorEditViewHrs = (EditText) view.findViewById(R.id.refrigeratorEditViewHrs);
        wmEditViewQty = (EditText) view.findViewById(R.id.wmEditViewQty);
        wmEditViewHrs = (EditText) view.findViewById(R.id.wmEditViewHrs);
        hEditViewQty = (EditText) view.findViewById(R.id.hEditViewQty);
        hEditViewHrs = (EditText) view.findViewById(R.id.hEditViewHrs);
        ovEditViewQty = (EditText) view.findViewById(R.id.ovEditViewQty);
        ovEditViewHrs = (EditText) view.findViewById(R.id.ovEditViewHrs);
        mtEditViewQty = (EditText) view.findViewById(R.id.mtEditViewQty);
        mtEditViewHrs = (EditText) view.findViewById(R.id.mtEditViewHrs);
        vcEditViewQty = (EditText) view.findViewById(R.id.vcEditViewQty);
        vcEditViewHrs = (EditText) view.findViewById(R.id.vcEditViewHrs);
        wpEditViewQty = (EditText) view.findViewById(R.id.wpEditViewQty);
        wpEditViewHrs = (EditText) view.findViewById(R.id.wpEditViewHrs);
        ironEditViewQty = (EditText) view.findViewById(R.id.ironEditViewQty);
        ironEditViewHrs = (EditText) view.findViewById(R.id.ironEditViewHrs);
        ecEditViewQty = (EditText) view.findViewById(R.id.ecEditViewQty);
        ecEditViewHrs = (EditText) view.findViewById(R.id.ecEditViewHrs);
        fbEditViewQty = (EditText) view.findViewById(R.id.fbEditViewQty);
        fbEditViewHrs = (EditText) view.findViewById(R.id.fbEditViewHrs);
        phoneChargerEditViewQty = (EditText) view.findViewById(R.id.phoneChargerEditViewQty);
        phoneChargerEditViewHrs = (EditText) view.findViewById(R.id.phoneChargerEditViewHrs);

        hpACEditView5Qty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hpACEditView5Hrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hpACEditView1Qty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hpACEditView1Hrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hpACEditView15Qty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hpACEditView15Hrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hpACEditView2Qty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hpACEditView2Hrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditViewESLQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditViewESLHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditViewTLQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditViewTLHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditView60Qty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditView60Hrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditView100Qty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditView100Hrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditView200Qty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        bulbEditView200Hrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fanEditViewCFQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fanEditViewCFHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fanEditViewSFQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fanEditViewSFHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fanEditViewBSFQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fanEditViewBSFHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        tvEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        tvEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        rdEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        rdEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        dcEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        dcEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        dvdEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        dvdEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        htEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        htEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        csEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        csEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        lpEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        lpEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        wdEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        wdEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        dfEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        dfEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        refrigeratorEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        refrigeratorEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        wmEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        wmEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        hEditViewHrs .setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        ovEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        ovEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        mtEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        mtEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        vcEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        vcEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        wpEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        wpEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        ironEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        ironEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        ecEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        ecEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fbEditViewQty.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        fbEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        phoneChargerEditViewQty .setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });
        phoneChargerEditViewHrs.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean focus) {
                if (focus) {
                    ((EditText)v).setText("");
                }
            }
        });


        Button submit = (Button) view.findViewById(R.id.submitButton);
        submit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        // Launch the MainActivity.
        Intent intent = new Intent(getActivity(), MainActivity.class);
        startActivity(intent);

        int hpAC5Qty = Integer.parseInt(hpACEditView5Qty.getText().toString());
        int hpAC1Qty = Integer.parseInt(hpACEditView1Qty.getText().toString());
        int hpAC15Qty = Integer.parseInt(hpACEditView15Qty.getText().toString());
        int hpAC2Qty = Integer.parseInt(hpACEditView2Qty.getText().toString());
        int bulbESLQty = Integer.parseInt(bulbEditViewESLQty.getText().toString());
        int bulbTLQty = Integer.parseInt(bulbEditViewTLQty.getText().toString());
        int bulb60Qty = Integer.parseInt(bulbEditView60Qty.getText().toString());
        int bulb100Qty = Integer.parseInt(bulbEditView100Qty.getText().toString());
        int bulb200Qty = Integer.parseInt(bulbEditView200Qty.getText().toString());
        int fanCFQty = Integer.parseInt(fanEditViewCFQty.getText().toString());
        int fanSFQty = Integer.parseInt(fanEditViewSFQty.getText().toString());
        int fanBSFQty = Integer.parseInt(fanEditViewBSFQty.getText().toString());
        int tvQty = Integer.parseInt(tvEditViewQty.getText().toString());
        int rdQty = Integer.parseInt(rdEditViewQty.getText().toString());
        int dcQty = Integer.parseInt(dcEditViewQty.getText().toString());
        int dvdQty = Integer.parseInt(dvdEditViewQty.getText().toString());
        int htQty = Integer.parseInt(htEditViewQty.getText().toString());
        int csQty = Integer.parseInt(csEditViewQty.getText().toString());
        int lpQty = Integer.parseInt(lpEditViewQty.getText().toString());
        int wdQty = Integer.parseInt(wdEditViewQty.getText().toString());
        int dfQty = Integer.parseInt(dfEditViewQty.getText().toString());
        int refrigeratorQty = Integer.parseInt(refrigeratorEditViewQty.getText().toString());
        int wmQty = Integer.parseInt(wmEditViewQty.getText().toString());
        int hQty = Integer.parseInt(hEditViewQty.getText().toString());
        int ovQty = Integer.parseInt(ovEditViewQty.getText().toString());
        int mtQty = Integer.parseInt(mtEditViewQty.getText().toString());
        int vcQty = Integer.parseInt(vcEditViewQty.getText().toString());
        int wpQty = Integer.parseInt(wpEditViewQty.getText().toString());
        int ironQty = Integer.parseInt(ironEditViewQty.getText().toString());
        int ecQty = Integer.parseInt(ecEditViewQty.getText().toString());
        int fbQty = Integer.parseInt(fbEditViewQty.getText().toString());
        int phoneChargerQty = Integer.parseInt(phoneChargerEditViewQty.getText().toString());

        int hpAC5Watt = 370 * hpAC5Qty;
        int hpAC1Watt = 780 * hpAC1Qty;
        int hpAC15Watt = 1252 * hpAC15Qty;
        int hpAC2Watt = 2500 * hpAC2Qty;
        int bulbESLWatt = 12 * bulbESLQty;
        int bulbTLWatt = 43 * bulbTLQty;
        int bulb60Watt = 60 * bulb60Qty;
        int bulb100Watt = 100 * bulb100Qty;
        int bulb200Watt = 200 * bulb200Qty;
        int fanCFWatt = 50 * fanCFQty;
        int fanSFWatt = 200 * fanSFQty;
        int fanBSFWatt = 500 * fanBSFQty;
        int tvWatt = 180 * tvQty;
        int rdWatt = 26 * rdQty;
        int dcWatt = 50 * dcQty;
        int dvdWatt = 20 * dvdQty;
        int htWatt = 150 * htQty;
        int csWatt = 600 * csQty;
        int lpWatt = 100 * lpQty;
        int wdWatt = 90 * wdQty;
        int dfWatt = 300 * dfQty;
        int refrigeratorWatt = 150 * refrigeratorQty;
        int wmWatt = 600 * wmQty;
        int hWatt = 1140 * hQty;
        int ovWatt = 12200 * ovQty;
        int mtWatt = 1200 * mtQty;
        int vcWatt = 630 * vcQty;
        int wpWatt = 2000 * wpQty;
        int ironWatt = 1100 * ironQty;
        int ecWatt = 1000 * ecQty;
        int fbWatt = 300 * fbQty;
        int phoneChargerWatt = 10 * phoneChargerQty;

        totalWatt = hpAC5Watt + hpAC1Watt + hpAC15Watt +  hpAC2Watt + bulbESLWatt
                +   bulbTLWatt + bulb60Watt + bulb100Watt + bulb200Watt + fanCFWatt +
                fanSFWatt + fanBSFWatt + tvWatt + rdWatt + dcWatt + dvdWatt + htWatt
                + csWatt + lpWatt + wdWatt + dfWatt + refrigeratorWatt +  wmWatt +
                hWatt + ovWatt + mtWatt + vcWatt + wpWatt + ironWatt +  ecWatt
                +  fbWatt + phoneChargerWatt;

        int hpAC5Hrs = Integer.parseInt(hpACEditView5Hrs.getText().toString());
        int hpAC1Hrs = Integer.parseInt(hpACEditView1Hrs.getText().toString());
        int hpAC15Hrs = Integer.parseInt(hpACEditView15Hrs.getText().toString());
        int hpAC2Hrs = Integer.parseInt(hpACEditView2Hrs.getText().toString());
        int bulbESLHrs = Integer.parseInt(bulbEditViewESLHrs.getText().toString());
        int bulbTLHrs = Integer.parseInt(bulbEditViewTLHrs.getText().toString());
        int bulb60Hrs = Integer.parseInt(bulbEditView60Hrs.getText().toString());
        int bulb100Hrs = Integer.parseInt(bulbEditView100Hrs.getText().toString());
        int bulb200Hrs = Integer.parseInt(bulbEditView200Hrs.getText().toString());
        int fanCFHrs = Integer.parseInt(fanEditViewCFHrs.getText().toString());
        int fanSFHrs = Integer.parseInt(fanEditViewSFHrs.getText().toString());
        int fanBSFHrs = Integer.parseInt(fanEditViewBSFHrs.getText().toString());
        int tvHrs = Integer.parseInt(tvEditViewHrs.getText().toString());
        int rdHrs = Integer.parseInt(rdEditViewHrs.getText().toString());
        int dcHrs = Integer.parseInt(dcEditViewHrs.getText().toString());
        int dvdHrs = Integer.parseInt(dvdEditViewHrs.getText().toString());
        int htHrs = Integer.parseInt(htEditViewHrs.getText().toString());
        int csHrs = Integer.parseInt(csEditViewHrs.getText().toString());
        int lpHrs = Integer.parseInt(lpEditViewHrs.getText().toString());
        int wdHrs = Integer.parseInt(wdEditViewHrs.getText().toString());
        int dfHrs = Integer.parseInt(dfEditViewHrs.getText().toString());
        int refrigeratorHrs = Integer.parseInt(refrigeratorEditViewHrs.getText().toString());
        int wmHrs = Integer.parseInt(wmEditViewHrs.getText().toString());
        int hHrs = Integer.parseInt(hEditViewHrs.getText().toString());
        int ovHrs = Integer.parseInt(ovEditViewHrs.getText().toString());
        int mtHrs = Integer.parseInt(mtEditViewHrs.getText().toString());
        int vcHrs = Integer.parseInt(vcEditViewHrs.getText().toString());
        int wpHrs = Integer.parseInt(wpEditViewHrs.getText().toString());
        int ironHrs = Integer.parseInt(ironEditViewHrs.getText().toString());
        int ecHrs = Integer.parseInt(ecEditViewHrs.getText().toString());
        int fbHrs = Integer.parseInt(fbEditViewHrs.getText().toString());
        int phoneChargerHrs = Integer.parseInt(phoneChargerEditViewHrs.getText().toString());

        String clientName = nameTextInputLayout.getEditText().getText().toString();
        String clientAddress = addressTextInputLayout.getEditText().getText().toString();

        totalHours = hpAC5Hrs + hpAC1Hrs +  hpAC15Hrs +  hpAC2Hrs +  bulbESLHrs
                +   bulbTLHrs + bulb60Hrs + bulb100Hrs + bulb200Hrs +
                fanCFHrs + fanSFHrs + fanBSFHrs + tvHrs + rdHrs + dcHrs + dvdHrs + htHrs
                +   csHrs + lpHrs + wdHrs + dfHrs + refrigeratorHrs + wmHrs + hHrs + ovHrs +
                mtHrs + vcHrs + wpHrs + ironHrs + ecHrs + fbHrs + phoneChargerHrs;

        totalConsumption = totalWatt / totalHours;


        Intent in = new Intent(getActivity(), ClientSummaryActivity.class);
        bundle.putString("Name", clientName);
        bundle.putString("Address", clientAddress);
        bundle.putFloat("Consumption", totalConsumption);
        bundle.putInt("Load", totalWatt);
        in.putExtras(bundle);

        startActivity(in);


    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

}
