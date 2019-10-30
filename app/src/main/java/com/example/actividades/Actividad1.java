package com.example.actividades;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad1<protect> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        String msn = this.getIntent().getExtras().getString("msn");
        TextView txt = findViewById(R.id.txt);
        txt.setText(msn);
    }
    @Override
     protected void onStart(){
        super.onStart();
        Toast toast = Toast.makeText(this, "APP INICIADO", Toast.LENGTH_SHORT);
        toast.show();

    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast toast = Toast.makeText(this, "APP REANUDANDO", Toast.LENGTH_SHORT);
        toast.show();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast toast = Toast.makeText(this, "APP PAUSADO", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast toast = Toast.makeText(this, "APP STOP", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast toast = Toast.makeText(this, "APP REINICADO", Toast.LENGTH_SHORT);
        toast.show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast toast = Toast.makeText(this, "APP CERRADO", Toast.LENGTH_SHORT);
        toast.show();
    }

}
