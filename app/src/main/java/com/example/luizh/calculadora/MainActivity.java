package com.example.luizh.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    float n1 = 0;
    float n2 = 0;
    float aux = 0;
    float vezes = 0;
    float result = 0;
    float memoria = 0;
    private String op;
    private String mostra;
    private String resultado;
    private String resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_0 = (Button)findViewById(R.id.btn_0);
        Button btn_1 = (Button)findViewById(R.id.btn_1);
        Button btn_2 = (Button)findViewById(R.id.btn_2);
        Button btn_3 = (Button)findViewById(R.id.btn_3);
        Button btn_4 = (Button)findViewById(R.id.btn_4);
        Button btn_5 = (Button)findViewById(R.id.btn_5);
        Button btn_6 = (Button)findViewById(R.id.btn_6);
        Button btn_7 = (Button)findViewById(R.id.btn_7);
        Button btn_8 = (Button)findViewById(R.id.btn_8);
        Button btn_9 = (Button)findViewById(R.id.btn_9);
        Button btn_mais = (Button)findViewById(R.id.btn_mais);
        Button btn_menos = (Button)findViewById(R.id.btn_menos);
        Button btn_vezes = (Button)findViewById(R.id.btn_vezes);
        Button btn_dividir = (Button)findViewById(R.id.btn_dividir);
        Button btn_porcentagem = (Button)findViewById(R.id.btn_porcentagem);
        Button btn_igual = (Button)findViewById(R.id.btn_igual);
        Button btn_virgula = (Button)findViewById(R.id.btn_virgula);
        Button btn_guarda_memoria = (Button)findViewById(R.id.btn_guarda_memoria);
        Button btn_mostra_memoria = (Button)findViewById(R.id.btn_mostra_memoria);
        Button btn_limpa_tudo = (Button)findViewById(R.id.btn_guarda_memoria);

        final EditText visor_cima = (EditText)findViewById(R.id.visor_cima);
        final EditText visor_baixo = (EditText)findViewById(R.id.visor_baixo);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"0");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"1");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"2");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"3");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"4");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"5");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"6");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"7");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"8");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+"9");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_virgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(visor_baixo.getText().toString()+".");
                aux = Float.parseFloat(visor_baixo.getText().toString());
            }
        });

        btn_guarda_memoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = aux;
                visor_cima.setText("Salvo na Memória");
                visor_baixo.setText(""+memoria);
            }
        });

        btn_mostra_memoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                visor_baixo.setText(""+memoria);
            }
        });

        btn_limpa_tudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                memoria = aux;
                visor_cima.setText("Salvo na Memória");
                visor_baixo.setText(""+memoria);

                resultado="";
                visor_cima.setText(""+resultado.toString());
                visor_baixo.setText(""+resultado.toString());
                aux = 0;
                n1 = 0;
                n2 = 0;
                op = "";
                result = 0;
                vezes = 0;
            }
        });

        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(vezes == 0)
                {
                    n1 = aux;

                    op = "/";

                    visor_cima.setText(aux + op);

                    visor_baixo.setText(null);

                }
                else
                {
                    op = "/";

                    visor_cima.setText(result + op);

                    visor_baixo.setText(null);
                }
                aux = n1;

                visor_baixo.setText(null);
                aux = 0;

            }
        });

        btn_vezes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(vezes == 0)
                {
                    n1 = aux;

                    op = "*";

                    visor_cima.setText(aux + op);

                    visor_baixo.setText(null);

                }
                else
                {
                    op = "*";

                    visor_cima.setText(result + op);

                    visor_baixo.setText(null);
                }
                aux = n1;

                visor_baixo.setText(null);
                aux = 0;

            }
        });

        btn_mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(vezes == 0)
                {
                    n1 = aux;

                    op = "+";

                    visor_cima.setText(aux + op);

                    visor_baixo.setText(null);

                }
                else
                {
                    op = "+";

                    visor_cima.setText(result + op);

                    visor_baixo.setText(null);
                }
                aux = n1;

                visor_baixo.setText(null);
                aux = 0;

            }
        });

        btn_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(vezes == 0)
                {
                    n1 = aux;

                    op = "-";

                    visor_cima.setText(aux + op);

                    visor_baixo.setText(null);

                }
                else
                {
                    op = "-";

                    visor_cima.setText(result + op);

                    visor_baixo.setText(null);
                }
                aux = n1;

                visor_baixo.setText(null);
                aux = 0;

            }
        });

        btn_porcentagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                n2 = Float.parseFloat(visor_baixo.getText().toString());

                if (op == "+")
                {
                    result = (n1 + (n2 /100));

                    visor_cima.setText(visor_cima.getText().toString()+n2+"%="+result);
                    visor_baixo.setText(null);
                }
                else if (op == "-"){

                    result = (n1 - (n2 /100));

                    visor_cima.setText(visor_cima.getText().toString()+n2+"%="+result);
                    visor_baixo.setText(null);
                }
                else if (op == "*"){

                    result = (n1 * (n2 /100));

                    visor_cima.setText(visor_cima.getText().toString()+n2+"%="+result);
                    visor_baixo.setText(null);
                }
                else if ((op == "/")&&(n2 !=0)){

                    result = (n1 / (n2 /100));

                    visor_cima.setText(visor_cima.getText().toString()+n2+"%="+result);
                    visor_baixo.setText(null);
                }
                else{

                    visor_cima.setText(null);
                    visor_baixo.setText(null);
                    visor_cima.setText("Operação");
                    visor_baixo.setText("Inválida");
                }
                aux = result;

            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (vezes == 0){

                    n2 = Float.parseFloat(visor_baixo.getText().toString());

                    if(op == "+"){

                        result = n1 + n2;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);

                        visor_baixo.setText(null);
                    }
                    else if(op == "-"){

                        result = n1 - n2;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);

                        visor_baixo.setText(null);
                    }
                    else if(op == "*"){

                        result = n1 * n2;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);

                        visor_baixo.setText(null);
                    }
                    else if((op == "/")&&(n2 != 0)){

                        result = n1 / n2;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);

                        visor_baixo.setText(null);
                    }
                    else if((op == "/")&&(n2 == 0))
                    {
                        visor_cima.setText(null);
                        visor_baixo.setText(null);
                        visor_cima.setText("Operação");
                        visor_baixo.setText("Inválida");

                    }
                    vezes = 1;
                    aux = result;
                }
                else
                {
                    n1 = Float.parseFloat(visor_baixo.getText().toString());

                    if(op == "+"){

                        result = result + n1;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);
                        visor_baixo.setText(null);
                    }
                    else if(op == "-"){

                        result = result - n1;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);

                        visor_baixo.setText(null);
                    }
                    else if(op == "*"){

                        result = result * n1;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);

                        visor_baixo.setText(null);
                    }
                    else if((op == "/")&&(n1 != 0)){

                        result = result / n1;

                        visor_cima.setText(visor_cima.getText().toString()+visor_baixo.getText().toString()+"="+result);

                        visor_baixo.setText(null);
                    }
                    else if((op == "/")&&(n1 == 0)){

                        visor_cima.setText(null);
                        visor_baixo.setText(null);
                        visor_cima.setText("Operação");
                        visor_baixo.setText("Inválida");
                    }
                    aux = result;
                }

            }
        });

    }

}