package com.example.alejandro.figurasgeometricas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listaView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaView=(ListView)findViewById(R.id.LisV);

        Figura arrayFiguras_datos[]=new Figura[]{
                new Figura(R.drawable.circulo,"Circulo"),
                new Figura(R.drawable.cuadrado,"Cuadrado"),
                new Figura(R.drawable.pentagono,"Pentagono"),
                new Figura(R.drawable.rectangulo,"Recatngulo"),
                new Figura(R.drawable.rombo,"Rombo"),
                new Figura(R.drawable.triangulo,"Triangulo"),
                new Figura(R.drawable.trapecio,"Trapecio"),
                new Figura(R.drawable.trapeciorectangulo,"Trapecio Recto"),
                new Figura(R.drawable.paralelogramo,"Paralelogramo"),





        };

        FiguraAdapter adaptador=new FiguraAdapter(this,R.layout.listview_fila,arrayFiguras_datos);
        listaView.setAdapter(adaptador);

        //Creando un escucha para saber que item se utilizo
        listaView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v= (TextView)view.findViewById(R.id.tvNombreFigura);
                System.out.println("MIRA------> "+position+" <----");
                Intent i = null;
                switch (position)
                {
                    case 0:
                        i = new Intent(getApplicationContext(),Circulo.class);
                        break;
                    case 1:
                        i = new Intent(getApplicationContext(),Cuadrado.class);
                        break;
                    case 2:
                        i = new Intent(getApplicationContext(),Pentagono.class);
                        break;
                    case 3:
                        i = new Intent(getApplicationContext(),Rectangulo.class);
                        break;
                    case 4:
                        i = new Intent(getApplicationContext(),Rombo.class);
                        break;

                    case 5:
                        i = new Intent(getApplicationContext(),Triangulo.class);
                        break;
                    case 6:
                        i = new Intent(getApplicationContext(),Trapecio.class);
                        break;
                    case 7:
                        i = new Intent(getApplicationContext(),TrapecioRecto.class);
                        break;
                    case 8:
                        i = new Intent(getApplicationContext(),Paralelogramo.class);
                        break;




                }
                startActivity(i);

                //Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();

            }


        });







    }
}
