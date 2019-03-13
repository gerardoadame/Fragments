package com.example.fragments;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, FragmentUno.OnFragmentInteractionListener{
    Button btnuno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentUno fragmentUno = new FragmentUno();

        getSupportFragmentManager().beginTransaction().add(R.id.btnuno,fragmentUno);

        btnuno=findViewById(R.id.btnuno);
        btnuno.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.btnuno:
                FragmentUno fragmentUno = new FragmentUno();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.contenedor,fragmentUno);
                transaction.commit();

                break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
