package com.example.alejandro.figurasgeometricas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Rectangulo extends AppCompatActivity {

    private double b,h;
    EditText b_et,h_et;
    TextView a_tv1,p_tv2;
    DecimalFormat num=new DecimalFormat("#.##");
    public Rectangulo (){
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        b_et=(EditText)findViewById(R.id.editText1);
        h_et=(EditText)findViewById(R.id.editText2);

        a_tv1=(TextView)findViewById(R.id.tv1);
        p_tv2=(TextView)findViewById(R.id.tv2);
    }

    public void salir(View v){
        finish();
    }

    public void limpiar(View v){
        b_et.setText("");
        h_et.setText("");
        a_tv1.setText("");
        p_tv2.setText("");
    }

    public void mostrar(View v){
        if(((b_et.getText().toString()).compareTo("")!=0) && (h_et.getText().toString()).compareTo("")!=0){
            b=Double.parseDouble(b_et.getText().toString());
            h=Double.parseDouble(h_et.getText().toString());


            a_tv1.setText(area(b,h)+"");
            p_tv2.setText(perimetro(b,h)+"");
        }
        else{
            Toast.makeText(getApplicationContext(),"Ingrese Dato",Toast.LENGTH_LONG).show();
        }
    }

    public String area(double b,double h){
        String ar="";
        double area;
        area=b*h;
        ar=(num.format(area)+"");
        return ar ;
    }
    public String perimetro(double b,double h){
        String pe="";
        double pm;
        pm=(2*b)+(2*h);
        pe=(num.format(pm)+"");
        return pe;
    }
}
