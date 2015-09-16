package com.example.chasse2.example02_g2;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculadoraActivity extends ActionBarActivity implements View.OnClickListener {

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean div = false;
    Double[] numero = new Double[20];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Button btn0 = (Button) findViewById(R.id.Btn0);
        btn0.setOnClickListener(this);
        Button btn1 = (Button) findViewById(R.id.Btn1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.Btn2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.Btn3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.Btn4);
        btn4.setOnClickListener(this);
        Button btn5 = (Button) findViewById(R.id.Btn5);
        btn5.setOnClickListener(this);
        Button btn6 = (Button) findViewById(R.id.Btn6);
        btn6.setOnClickListener(this);
        Button btn7 = (Button) findViewById(R.id.Btn7);
        btn7.setOnClickListener(this);
        Button btn8 = (Button) findViewById(R.id.Btn8);
        btn8.setOnClickListener(this);
        Button btn9 = (Button) findViewById(R.id.Btn9);
        btn9.setOnClickListener(this);

        Button punto = (Button) findViewById(R.id.BtnPunto);
        punto.setOnClickListener(this);

        Button btnsuma = (Button) findViewById(R.id.BtnSuma);
        btnsuma.setOnClickListener(this);
        Button btnresta = (Button) findViewById(R.id.BtnResta);
        btnresta.setOnClickListener(this);
        Button btnmul = (Button) findViewById(R.id.BtnMulti);
        btnmul.setOnClickListener(this);
        Button btndiv = (Button) findViewById(R.id.BtnDiv);
        btndiv.setOnClickListener(this);
        Button btnigual = (Button) findViewById(R.id.BtnIgual);
        btnigual.setOnClickListener(this);

        Button btnraiz = (Button) findViewById(R.id.BtnSqrt);
        btnraiz.setOnClickListener(this);
        Button btnP = (Button) findViewById(R.id.BtnPorce);
        btnP.setOnClickListener(this);

        Button btnborrar = (Button) findViewById(R.id.BtnBorrar);
        btnborrar.setOnClickListener(this);
        Button btnlimpiar = (Button) findViewById(R.id.BtnLimpiar);
        btnlimpiar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TextView pantalla = (TextView) findViewById(R.id.txtResul);
        int seleccion = v.getId();//hacer visible la interfaz
        String a = pantalla.getText().toString();
        try {
        switch (seleccion) {
            case R.id.Btn0:
                pantalla.setText(a+"0");
                break;
            case R.id.Btn1:
                pantalla.setText(a+"1");
                break;
            case R.id.Btn2:
                pantalla.setText(a+"2");
                break;
            case R.id.Btn3:
                pantalla.setText(a+"3");
                break;
            case R.id.Btn4:
                pantalla.setText(a+"4");
                break;
            case R.id.Btn5:
                pantalla.setText(a+"5");
                break;
            case R.id.Btn6:
                pantalla.setText(a+"6");
                break;
            case R.id.Btn7:
                pantalla.setText(a+"7");
                break;
            case R.id.Btn8:
                pantalla.setText(a+"8");
                break;
            case R.id.Btn9:
                pantalla.setText(a+"9");
                break;
            case R.id.BtnPunto:
                if (decimal == false){
                pantalla.setText(a+".");
                decimal = true;
                }else return;
                break;
            case R.id.BtnSuma:
                suma = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText("");
                decimal = false;
                break;
            case R.id.BtnResta:
                resta = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText("");
                decimal = false;
                break;
            case R.id.BtnMulti:
                multi = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText("");
                decimal = false;
                break;
            case R.id.BtnDiv:
                div = true;
                numero[0] = Double.parseDouble(a);
                pantalla.setText("");
                decimal = false;
                break;
            case R.id.BtnIgual:
                numero[1] = Double.parseDouble(a);

                if (suma == true){
                    resultado = numero[0] + numero[1];
                    pantalla.setText(String.valueOf(resultado));
                } else if (resta == true){
                    resultado = numero[0] - numero[1];
                    pantalla.setText(String.valueOf(resultado));
                }else if (multi == true){
                    resultado = numero[0] * numero[1];
                    pantalla.setText(String.valueOf(resultado));
                }else if (div == true){
                    resultado = numero[0] / numero[1];
                    pantalla.setText(String.valueOf(resultado));
                }

                decimal = false;
                suma= false;
                resta = false;
                multi = false;
                div = false;

                break;
            case R.id.BtnBorrar:
                break;
            case R.id.BtnLimpiar:
                pantalla.setText("");
                decimal =false;
                break;
        }

        }catch(Exception e){

                pantalla.setText("error");
         }

    }
}
