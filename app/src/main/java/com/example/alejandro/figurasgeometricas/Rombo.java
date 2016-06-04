package com.example.alejandro.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Rombo extends AppCompatActivity {
    private double a,d,d2;
    EditText a_et,d_et,d2_et;
    TextView a_tv1,p_tv2;
    DecimalFormat num=new DecimalFormat("#.##");
    public Rombo (){
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);

        a_et=(EditText)findViewById(R.id.editText1);
        d_et=(EditText)findViewById(R.id.editText2);
        d2_et=(EditText)findViewById(R.id.editText3);
        a_tv1=(TextView)findViewById(R.id.tv1);
        p_tv2=(TextView)findViewById(R.id.tv2);
    }

    public void salir(View v){
        finish();
    }
    public void limpiar(View v){
        a_et.setText("");
        d_et.setText("");
        d2_et.setText("");

        a_tv1.setText("");
        p_tv2.setText("");
    }

    public void mostrar(View v){
        if(((a_et.getText().toString()).compareTo("")!=0) && (d_et.getText().toString()).compareTo("")!=0){
            a=Double.parseDouble(a_et.getText().toString());
            d=Double.parseDouble(d_et.getText().toString());
            d2=Double.parseDouble(d2_et.getText().toString());


            a_tv1.setText(area(d,d2)+"");
            p_tv2.setText(perimetro(a)+"");
        }
        else{
            Toast.makeText(getApplicationContext(),"Ingrese Dato",Toast.LENGTH_LONG).show();
        }
    }

    public String area(double d,double d2){
        String ar;
        double area;
        area=(d*d2)/2;
        ar=(num.format(area)+"");
        return ar ;
    }
    public String perimetro(double a){
        String pe;
        double pm;
        pm=4*a;
        pe=(num.format(pm)+"");
        return pe;
    }
}
