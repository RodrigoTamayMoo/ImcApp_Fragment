package com.rodrigo_tamay_moo.imcapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rodrigo_tamay_moo on 26/10/2017.
 */

    public class ImcFragment extends Fragment{
    private Button mBotonCalcular, mBotonLimpiar;
    private TextView mTextViewImc;
    private EditText mEditTextPeso, mEditTextEstatura;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragmento_imc, container, false);
        mEditTextPeso = (EditText) v.findViewById(R.id.campo_peso);
        mEditTextEstatura = (EditText) v.findViewById(R.id.campo_estatura);
        mBotonCalcular = (Button) v.findViewById(R.id.boton_calcular);
        mBotonLimpiar = (Button) v.findViewById(R.id.boton_limpiar);
        mTextViewImc = (TextView) v.findViewById(R.id.etiqueta_imc);

        mBotonCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String s = mEditTextPeso.getText().toString();
                double peso = Double.parseDouble(s);
                s = mEditTextEstatura.getText().toString();
                double estatura = Double.parseDouble(s);
                double imc = peso / (estatura * estatura);
                s = String.format("%2.2f", imc);
                mTextViewImc.setText(s);
            }
        });

        mBotonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditTextPeso.setText("");
                mEditTextEstatura.setText("");
                mTextViewImc.setText("0.0");
            }
        });

        return v;
    }
    }