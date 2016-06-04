package com.example.alejandro.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Pentagono extends AppCompatActivity {

    private double r,a,b;
    EditText a_et,b_et,r_et;
    TextView a_tv1,p_tv2;
    DecimalFormat num=new DecimalFormat("#.##");
    public Pentagono (){
        super();
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pentagono);
        a_et=(EditText)findViewById(R.id.editText1);
        b_et=(EditText)findViewById(R.id.editText2);
        r_et=(EditText)findViewById(R.id.editText3);
        a_tv1=(TextView)findViewById(R.id.tv1);
        p_tv2=(TextView)findViewById(R.id.tv2);


    }
    public void salir(View v){
        finish();
    }
    public void limpiar(View v){
        a_et.setText("");
        b_et.setText("");
        r_et.setText("");

        a_tv1.setText("");
        p_tv2.setText("");
    }

    public void mostrar(View v){
        if(((a_et.getText().toString()).compareTo("")!=0) && (b_et.getText().toString()).compareTo("")!=0&& (r_et.getText().toString()).compareTo("")!=0){
            a=Double.parseDouble(a_et.getText().toString());
            b=Double.parseDouble(b_et.getText().toString());
            r=Double.parseDouble(r_et.getText().toString());


            a_tv1.setText(area(a,b)+"");
            p_tv2.setText(perimetro(b)+"");
        }
        else{
            Toast.makeText(getApplicationContext(),"Ingrese Dato",Toast.LENGTH_LONG).show();
        }
    }

    public String area(double a,double b){
        String ar="";
        double area;
        area=(5*a*b)/2;
        ar=(num.format(area)+"");
        return ar ;
    }
    public String perimetro(double b){
        String pe="";
        double pm;
        pm=5*b;
        pe=(num.format(pm)+"");
        return pe;
    }
}
