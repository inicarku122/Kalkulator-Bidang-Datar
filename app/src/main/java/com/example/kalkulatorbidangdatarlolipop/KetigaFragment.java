package com.example.kalkulatorbidangdatarlolipop;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class KetigaFragment extends Fragment {
    private EditText txt_diameter;
    private Button btnluas,btnkeliling;
    private TextView hasil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ketiga, container, false);

        txt_diameter = v.findViewById(R.id.txt_diameter);
        btnluas = v.findViewById(R.id.btnluas);
        btnkeliling = v.findViewById(R.id.btnkeliling);
        hasil = v.findViewById(R.id.hasil);

        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_diameter.getText().toString();
                if(nilai.isEmpty()){
                    txt_diameter.setError("Data Tidak Boleh Kosong");
                    txt_diameter.requestFocus();
                }else{
                    Double Diameter = Double.parseDouble(nilai);
                    Double Jari = 0.5* Diameter;
                    Double Luas = 3.14 * (Jari*Jari);
                    hasil.setText(String.format("%.2f",Luas));
                }
            }
        });

        btnkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = txt_diameter.getText().toString();
                if(nilai.isEmpty()){
                    txt_diameter.setError("Data Tidak Boleh Kosong");
                    txt_diameter.requestFocus();
                }else{
                    Double Diameter = Double.parseDouble(nilai);
                    Double keliling = 3.14 * Diameter ;
                    hasil.setText(String.format("%.2f",keliling));
                }
            }
        });

        return v;
    }
}