package com.example.alejandro.proyectoganadorxd;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton imageButton;
    ImageButton buttondos;
    ImageButton buttontres;
    ImageButton buttoncuatro;
    ImageButton buttoncinco;
    ImageButton buttonseis;
    ImageButton buttonsiete;
    ImageButton buttonocho;
    ImageButton buttonnueve;
    ImageButton buttondiez;
    ImageButton buttononce;
    ImageButton buttondoce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.button2);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, ApartadoUno.class);
                startActivity(a);

            }
        });
        buttondos = findViewById(R.id.button4);
        buttondos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,Activity_Buscador.class);
                startActivity(a);

            }
        });
        buttontres = findViewById(R.id.button6);
        buttontres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoTres.class);
                startActivity(a);

            }
        });
        buttoncuatro = findViewById(R.id.button8);
        buttoncuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoCuatro.class);
                startActivity(a);

            }
        });
        buttoncinco = findViewById(R.id.button10);
        buttoncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoCinco.class);
                startActivity(a);

            }
        });
        buttonseis = findViewById(R.id.button12);
        buttonseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoSeis.class);
                startActivity(a);

            }
        });
        buttonsiete = findViewById(R.id.button14);
        buttonsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoSiete.class);
                startActivity(a);

            }
        });
        buttonocho = findViewById(R.id.button16);
        buttonocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoOcho.class);
                startActivity(a);

            }
        });
        buttonnueve = findViewById(R.id.button18);
        buttonnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoNueve.class);
                startActivity(a);

            }
        });
        buttondiez = findViewById(R.id.button20);
        buttondiez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoDiez.class);
                startActivity(a);

            }
        });
        buttononce = findViewById(R.id.button22);
        buttononce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoOnce.class);
                startActivity(a);

            }
        });
        buttondoce = findViewById(R.id.button24);
        buttondoce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this,ApartadoDoce.class);
                startActivity(a);

            }
        });



     /*   ImageButton imagenuno = (ImageButton) findViewById(R.id.button2);
        Picasso.with(this)
                .load("https://i.ytimg.com/vi/sO7U78pUr34/maxresdefault.jpg")
                .error(R.mipmap.ic_launcher)
                .fit()
                .into(imagenuno);


        ImageButton imagendos = (ImageButton) findViewById(R.id.button4);
        Picasso.with(this)
                .load("https://www.mexicodesconocido.com.mx/wp-content/uploads/2019/06/Mayas.jpg")
                .error(R.mipmap.ic_launcher)
                .fit()
                .into(imagendos);



        ImageButton imagentres = (ImageButton) findViewById(R.id.button6);
        Picasso.with(this)
                .load("https://expertvagabond.com/wp-content/uploads/chichen-itza-ruins-blog-1.jpg")
                .error(R.mipmap.ic_launcher)
                .fit()
                .into(imagentres);


        ImageButton imagencuatro = (ImageButton) findViewById(R.id.button8);
        Picasso.with(this)
                .load("https://cdn.pixabay.com/photo/2018/04/26/17/59/chichen-itza-3352580_1280.jpg")
                .error(R.mipmap.ic_launcher)
                .fit()
                .into(imagencuatro);


        ImageButton imagencinco = (ImageButton) findViewById(R.id.button10);
        Picasso.with(this)
                .load("https://i2.wp.com/historiasdelahistoria.com/wordpress-2.3.1-ES-0.1-FULL/wp-content/uploads/2019/06/Chichen-Itza.jpg?resize=801%2C451&ssl=1")
                .error(R.mipmap.ic_launcher)
                .fit()
                .into(imagencinco);

*/

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Bienvenido al mejor proyecto", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
