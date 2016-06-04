package com.example.alejandro.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Circulo extends AppCompatActivity {

    private double radio;
    private double pi=3.141592654;
    EditText radio_et1;
    TextView a_tv1,p_tv2;
    DecimalFormat num=new DecimalFormat("#.##");


    public Circulo (){
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio_et1=(EditText)findViewById(R.id.editText1);
        a_tv1=(TextView)findViewById(R.id.tv1);
        p_tv2=(TextView)findViewById(R.id.tv2);
    }

    public void salir(View v){
        finish();
    }
    public void limpiar(View v){
        radio_et1.setText("");
        a_tv1.setText("");
        p_tv2.setText("");

    }

    public void mostrar(View v){
        if((radio_et1.getText().toString()).compareTo("")!=0){
            double r=Double.parseDouble(radio_et1.getText().toString());
            a_tv1.setText(area(r,pi));
            p_tv2.setText(perimetro(r,pi));
            //System.out.println("Siiiiiiiiiii");
        }
        else{
           // System.out.println("Noooooo");
            Toast.makeText(getApplicationContext(),"Ingrese Dato",Toast.LENGTH_LONG).show();
        }


    }

    public String area(double r,double pi){
        String ar;

        double a;
        a=pi*r*r;

        ar=(num.format(a)+"");
        return ar ;
    }
    public String perimetro(double r,double pi){
        String pe;

        double p;
        p=2*pi*r;

        pe=(num.format(p)+"");
        return pe;
    }


}
