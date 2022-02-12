
package com.example.pmaula1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText novo = (EditText) findViewById(R.id.novo);
        TextView texto = (TextView) findViewById(R.id.texto);
        Button troca = (Button) findViewById(R.id.troca);

        troca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texto.setText(novo.getText());

                Context context = getApplicationContext();
                CharSequence text = texto.getText();
                int duration = Toast.LENGTH_LONG;


                Toast.makeText(context, text, duration).show();
            }
        });






    }
}