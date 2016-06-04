package com.example.alejandro.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Cuadrado extends AppCompatActivity {

    private double lado;
    EditText a_et1;
    TextView a_tv1,p_tv2;
    DecimalFormat num=new DecimalFormat("#.##");
    public Cuadrado (){
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);

        a_et1=(EditText)findViewById(R.id.editText1);
        a_tv1=(TextView)findViewById(R.id.tv1);
        p_tv2=(TextView)findViewById(R.id.tv2);
    }
    public void salir(View v){
        finish();
    }

    public void limpiar(View v){
        a_et1.setText("");
        a_tv1.setText("");
        p_tv2.setText("");
    }

    public void mostrar(View v){
        if((a_et1.getText().toString()).compareTo("")!=0){
             lado=Double.parseDouble(a_et1.getText().toString());
            a_tv1.setText(area(lado)+"");
            p_tv2.setText(perimetro(lado)+"");
        }
        else{
            Toast.makeText(getApplicationContext(),"Ingrese Dato",Toast.LENGTH_LONG).show();
        }
    }

    public String area(double lado){
        String ar="";
        double a;
        a=lado*lado;
        ar=(num.format(a)+"");
        return ar ;
    }
    public String perimetro(double lado){
        String pe="";
        double p;
        p=4*lado;
        pe=(num.format(p)+"");
        return pe;
    }
}
