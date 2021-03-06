package com.app.tiendaMascotas;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MenuHistorial extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_historial);
    }

    public void irRegistrar(View view) {
        Intent intent  = new Intent(this, Historial.class);
        startActivity(intent);
    }

    public void irModificar(View view) {
        Intent intent  = new Intent(this, ListHistorial.class);
        startActivity(intent);
    }

    public void irVer(View view) {
        Intent intent  = new Intent(this, ListHistorial.class);
        startActivity(intent);
    }
}
