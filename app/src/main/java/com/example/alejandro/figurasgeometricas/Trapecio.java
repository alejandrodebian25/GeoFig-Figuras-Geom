package com.example.alejandro.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Trapecio extends AppCompatActivity {

    private double a,b,c,b1,h;
    EditText a_et,d_et,d2_et,d3_et,d4_et;
    TextView a_tv1,p_tv2;

    DecimalFormat num=new DecimalFormat("#.##");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);

        a_et=(EditText)findViewById(R.id.editText1);
        d_et=(EditText)findViewById(R.id.editText2);
        d2_et=(EditText)findViewById(R.id.editText3);
        d3_et=(EditText)findViewById(R.id.editText4);
        d4_et=(EditText)findViewById(R.id.editText5);


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
        d3_et.setText("");
        d4_et.setText("");


        a_tv1.setText("");
        p_tv2.setText("");
    }

    public void mostrar(View v){
        if(((a_et.getText().toString()).compareTo("")!=0) && (d_et.getText().toString()).compareTo("")!=0){
            a=Double.parseDouble(a_et.getText().toString());
            b=Double.parseDouble(d_et.getText().toString());
            c=Double.parseDouble(d2_et.getText().toString());
            h=Double.parseDouble(d3_et.getText().toString());
            b1=Double.parseDouble(d4_et.getText().toString());


            a_tv1.setText(area(a,b,c,h,b1)+"");
            p_tv2.setText(perimetro(a,b,c,h,b1)+"");
        }
        else{
            Toast.makeText(getApplicationContext(),"Ingrese Dato",Toast.LENGTH_LONG).show();
        }
    }

    public String area(double a,double b, double c,double h,double b1){
        String ar;
        double area;
        area=((b+b1)*h)/2;
        ar=(num.format(area)+"");
        return ar ;
    }
    public String perimetro(double a,double b, double c,double h,double b1){
        String pe;
        double pm;
        pm=a+b+b1+c;
        pe=(num.format(pm)+"");
        return pe;
    }
}
